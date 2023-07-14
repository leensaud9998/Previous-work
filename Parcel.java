package GUI;

public class Parcel extends Shipment {
	
	private double height;
	private double length;
	private double width;
	

	public Parcel(String reciver, double weight, Object number,double height, double length, double width)  {
		super(reciver, weight, number);
		this.height = height;
		this.length = length;
		this.width=width;
	}

	@Override
	public double shippingcost() {
		
		return (height * width * length) *2 + weight;
	}

	@Override
	public String toString() {
		
		return "Parcel: "+ super.toString()+","+" width: "+ width +","+ " length: " + length +","+" height:" + height +","+" Shipping cost: "+shippingcost()+" SAR";
	}
	
	//leen saud nasser altowaim
}
