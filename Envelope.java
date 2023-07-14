package GUI;

public class Envelope extends Shipment{
	private String type;

	public Envelope(String reciver, double weight, Object number, String type) {
		super(reciver, weight, number);
		this.type = type;
		
	}

	@Override
	public double shippingcost() {
		
		return 2 + weight*2;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Envelope: "+super.toString() +"," + " type: " + type +"," + " Shipping cost: " + shippingcost() + " SAR";
	}
	
	
}

