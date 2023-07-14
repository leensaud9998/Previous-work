import java.nio.file.Paths;
import java.util.Scanner;

public class Book_Viewer  {
    String bookname;

    static DoublyLinkedList <String > mybook = new DoublyLinkedList <String> ();
    

    static Scanner input ;

   public  Book_Viewer(String Bookname){
    this.bookname =Bookname;
    try{
    readAllBytes();
   }
    catch(Exception e){System.out.println(" ERRORR IN FILE");}
  
     
   }
    public void readAllBytes ()throws Exception {
        

    for (int i=1; i<=4 ; i++){

        String num = Integer.toString(i) ;
        String file_name = "page_" + num +".txt";
        input = new Scanner (Paths.get(file_name));
        String curpage ="";

          while (input.hasNextLine()){
           curpage +="\n" + input.nextLine();
              }
      
        mybook.addLast(curpage);
        
    }
    }

    public static String  Next(){
mybook.movetoNext();
return mybook.getValue();
       
       }
    
    
        

    public static String  previous(){

          
             mybook.movetoPrev();
             return mybook.getValue();
             
    
     }
                
                
    public static String  Search_by_number(int pagenumber){

        if (pagenumber >4 || pagenumber <1){
            System.out.println ("Invalid page number ");
            return null;
        }
        mybook.movetoStart();
        if(pagenumber==1){
            System.out.println(mybook.getValue());
            return null;}
        else
        {
        for(int i=1;i<pagenumber;i++)
    mybook.movetoNext();
     String page = mybook.getValue();
        
   

    return page;
                            
        }                       
    }



    









    public  static void main (String [] args)throws Exception{
  
        Book_Viewer book = new Book_Viewer ("How To Program");
        int choice;
        Scanner input2= new Scanner (System.in);
        mybook.movetoStart();
  System.out.println(mybook.getValue());
     
//
        do {
            
            System.out.println("\nWould you like to:");
            
            System.out.println("1- Go to the the next page ");
            System.out.println("2- Go to the previous page");
            System.out.println("3- Search by number ");
            System.out.println("4-  Exit.");
            System.out.print("Enter the number of your selection:  ");
            choice = input2.nextInt();

            switch (choice) {
                

                case 1://Go to the next page 
                    
                    System.out.println(Next());
                   
                    break;

                case 2://Go to the previous page 
                System.out.println(previous());
                    break;
                
                case 3://Search_by_number
                System.out.print("Enter the page  you want to read   ");
                 int pagenumber  = input2.nextInt();
                 System.out.println(Search_by_number(pagenumber));
                    break;

                case 4: // Exit
                    System.out.println("Thank you , See you soon.");
                    break;

            }
        } while (choice != 4);
         


    }
    }



