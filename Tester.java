package GUI;

public class Tester {
	public static void main (String [] args) {
		Deliverable [] arr1 =new Deliverable[2];
		Envelope obj1 = new Envelope("Ahmad", 12.00, 124423, "A4");
		Parcel obj2 = new Parcel("Noah", 500.00, 12345, 5.00, 3.00, 10.00);
		
		arr1[0] =obj1;
		arr1[1] = obj2;
		
		for(int i = 0 ; i <arr1.length;i++) {
			System.out.println(arr1[i].toString());
		}
			
	}
	//leen saud nasser altowaim
}
