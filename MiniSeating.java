
public class MiniSeating
{
   public static void main(String[] args){
       //String array construct
       String[][] seats = new String[2][3];
       
       //inserting value
       seats[0][0] = "Anil";
       seats[0][1] = "Prabin";
       seats[0][2] = "Madhusudan";
       
       System.out.println("Seat Charts");
       for(int i=0;i<seats.length;i++){
           for(int j=0;j<seats[i].length;j++){
               if(seats[i][j] == null){ //checks value present or empty
                   System.out.print("[empty]\t");
               }
               else{
                   System.out.print(seats[i][j] + "\t");
               }
           }
           System.out.println();// to print gap after one execution of loop
       }
   }
}