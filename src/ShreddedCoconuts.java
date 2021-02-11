/**
 * 
 * @author Ramadevi
 *
 */
public class ShreddedCoconuts extends ToppingDecorator {
	
	public ShreddedCoconuts(BakedFood bakedFood) {
		this.bakedFood = bakedFood;
	}
	
	@Override
	public String getDescription() {
		return bakedFood.getDescription() + ", Shredded Coconuts";
	}

	@Override
	public double cost() {
		return bakedFood.cost() + 0.5;
	}
	
}
