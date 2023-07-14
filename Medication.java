public   class Medication {
    
    String Name ; 
    String dose;
    int amount;
    String directions;

    public Medication( String name, String dose,int amount, String directions) {
        
        Name = name;
        this.dose=dose;
        this.amount = amount;
       this.directions= directions;
    }

 
    @Override
    public String toString() {
        return String.format("Name= %s,dose= %s,amount= %d ",Name ,dose ,amount );
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    


}