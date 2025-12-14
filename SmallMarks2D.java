
public class SmallMarks2D
{
    public static void main(String[] args){
     //constructing 2D array
     int[][] Marks = new int[2][2];
     
     System.out.println("Marks Tables");
     // \t is escape sequence to give tab
     System.out.println("Student\tNepali\tEnglish");
     
     //filling the sample marks
     Marks[0][0] = 80; // Nepali marks 1
     Marks[0][1] = 75; // English marks 1
     
     Marks[1][0] = 90; // Nepali marks 2
     Marks[1][1] = 85; // English marks 2
     
     // printing the 2x2 table
     for(int i=0;i<Marks.length;i++){
         System.out.println((i+1) + "\t" + Marks[i][0] + "\t" + Marks[i][1]);
     }
     // calculation of total marks
     System.out.println("Total Marks obtained");
     for(int i=0;i<Marks.length;i++){
         int total = 0; // it sets value to 0 after finishing one loop
         for(int j=0;j<Marks[i].length;j++){ // this is to work into column
             total += Marks[i][j];
         }
         //printing total marks of each student
         System.out.println("Student no " + (i+1) +(": ") + total);
     }
    }
}