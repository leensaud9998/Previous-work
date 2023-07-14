package GUI;

public abstract class Shipment <T> implements Deliverable{
	
	protected String receiver;
	protected double weight;
	protected T number;
	
	public Shipment(String reciver, double weight, T number) {
		super();
		this.receiver = reciver;
		this.weight = weight;
		this.number = number;
	}
	
	public String getReceiver() {
		return receiver;
		
	}
	
	
	@Override
	public String toString() {
		return " Shipment Receiver: " + receiver +","+ " weight: " + weight +","+" number: " + number   ;
	}
	
	
	//leen saud nasser altowaim

}
