/**
 * 
 * @author Ramadevi
 *
 */
public class FreshFruits extends ToppingDecorator {
	
	public FreshFruits(BakedFood bakedFood) {
		this.bakedFood = bakedFood;
	}
	
	@Override
	public String getDescription() {
		return bakedFood.getDescription() + ", Fresh Fruits";
	}

	@Override
	public double cost() {
		return bakedFood.cost() + 3.0;
	}
	
}
