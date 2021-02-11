/**
 * 
 * @author Ramadevi
 *
 */
public class IcingSugar extends ToppingDecorator {
	
	public IcingSugar(BakedFood bakedFood) {
		this.bakedFood = bakedFood;
	}
	
	@Override
	public String getDescription() {
		return bakedFood.getDescription() + ", Icing Sugar";
	}

	@Override
	public double cost() {
		return bakedFood.cost() + 1.0;
	}
	
}
