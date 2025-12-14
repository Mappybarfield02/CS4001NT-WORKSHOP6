import java.util.Scanner;
public class StudentArray
{
    public static void main(String[] args){
        String[] names = {"Asha", "Ramesh", "Sita", "Binod", "Sabita"};
        
        for(int i = 0; i < names.length; i++){
           System.out.println(names[i]);
        } // display the value of array
        System.out.println("-------");
        
        System.out.println(names[2]); //display the values of index 2
        System.out.println("-------");
        
        names[4] = "Rita"; // changing value of index 4
        for(String name : names){
           System.out.println(name);
          }// displaying value after updating index 4
        System.out.println("-------");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new name to update index 2:");
        String newName = scanner.nextLine();
        names[2] = newName;
        
        for(String name : names){//enhanced for loop
            System.out.println("final array after user updating value:" + name);
        }
        
        scanner.close();
    }
    }
