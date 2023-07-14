package pharmcysystem;


public class prescriptions {
 
    int P_ID;
    Medication P_Medication ;
    

    public prescriptions ( int P_id,Medication P_Medication ){

        this.P_ID=P_id;
        this.P_Medication= P_Medication;
        
    }

   
   public void print () {
       System.out.println(" \n The medcation is");
        System.out.println (P_Medication);
       
   }

}
