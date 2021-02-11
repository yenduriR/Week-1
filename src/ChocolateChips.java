/**
 * 
 * @author Ramadevi
 *
 */
public class ChocolateChips extends ToppingDecorator {
	
	public ChocolateChips(BakedFood bakedFood) {
		this.bakedFood = bakedFood;
	}
	
	@Override
	public String getDescription() {
		return bakedFood.getDescription() + ", Chocolate Chips";
	}

	@Override
	public double cost() {
		return bakedFood.cost() + 2.0;
	}
	
}
