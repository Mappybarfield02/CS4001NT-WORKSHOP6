import java.util.Scanner;
public class SimpleNumbers
{
    public static void main(String[] args){
        int[] scores = {10,20,30,40,50}; //creating array with scores name
        
        for(int i=0; i<scores.length; i++){//printing element of array
            System.out.println(scores[i]);
        }
        //sum of all the elements
        int sum = 0;
        for(int i=0; i<scores.length; i++){
            sum += scores[i];
          
        }
        System.out.println("The sum of all the elements is : " + sum);
        System.out.println("---------------------------------------");
        
        double average = sum/scores.length;
        System.out.println("The average of all numbers is " + average);
        System.out.println("---------------------------------------");
        
        int highest = scores[0];
        for(int i=0; i<scores.length; i++){
            if(scores[i] > highest){
                highest = scores[i];
            }
        }
        System.out.println("The highest score in an array is " + highest);
        System.out.println("---------------------------------------");
        
        int lowest = scores[0];
        for(int i=0; i<scores.length; i++){
            if(scores[i] > lowest){
                lowest = scores[i];
            }
        }
        System.out.println("The highest score in an array is " + lowest);
        System.out.println("---------------------------------------");
        //("displaying an array with user's subject and scores")
        System.out.println("---------------------------------------");
        
        System.out.print("Enter the number of Subjects: ");
        Scanner scanner = new Scanner(System.in);
        int nos = scanner.nextInt();//nos = number of subjects
        
        //array construct(size as user's number of subject)
        int[] scores1 = new int[nos]; 
        
        //taking value as per user's input, using index position 
        for(int i=0;i<scores1.length;i++){
            System.out.print("Subject " + (i+1) + ": ");
            scores1[i] = scanner.nextInt();
        }
        
        System.out.println("---------------------------------------");
        
        //updated array in array format like {v1,v2,v3}
        System.out.print("scores1 = {");
        for(int i = 0; i<scores1.length;i++){
            System.out.print( scores1[i]);
            //using if to print comma only before the end of values
            if(i < scores1.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("}");
        
    }
}