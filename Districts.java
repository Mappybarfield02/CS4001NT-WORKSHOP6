import java.util.Scanner;
public class Districts
{
    public static void main(String[] args){
    
    //creating string district
    String district[] = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};
    
    //printing in numbered list
        for(int i=0;i<district.length;i++){
            System.out.println((i+1) + ". " + district[i]);
        }
        
    //creating scanner object to read the user input
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of districts: ");
    int number = scanner.nextInt();
    scanner.nextLine();//this wil consume the newline
    
    // creating string array to store string data
    String[] districts = new String[number];
        for(int i=0;i<districts.length;i++){
        System.out.print("Enter districts " + (i+1) + ": ");
        districts[i] = scanner.nextLine();
        }
        
    //printing the updated array
    System.out.print("Districts = {");
    for(int i=0; i<districts.length;i++){
        System.out.print(districts[i]);
        if(i<districts.length-1){
            System.out.print(", ");
        }
    }
    System.out.print("}");
    }
}