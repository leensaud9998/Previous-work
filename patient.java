package pharmcysystem;

public class patient {
   
    int id;
    int age;
    String name ;
   

    public patient(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
       
    }

    
    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  

    @Override
    public String toString() {
        return String.format("Name: %s , Age: %d , " , name , age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    
    
}
