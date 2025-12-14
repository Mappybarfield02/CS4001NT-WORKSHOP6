
public class MiniKitab
{
    public static void main(String[] args){
        //2D Array construction
        String[] categories = {"Fiction", "Nepali"};
        String [][] titles = new String[2][1]; 
        Double [][] prices = new Double[2][1]; 
    
        //value insertion on 2D array
        titles[0][0] = "The Alchemist";
        titles[1][0] = "Muna Madan";
        
        prices[0][0] = 400d;
        prices[1][0] = 1000d;
        
        System.out.println("Tiny Book Corner");
        System.out.println("Category\ttile\t\tprice");
        
        double total = 0; //accumulator for total price
        for(int i = 0; i<categories.length; i++){
            String title = titles[i][0]; //get title
            double price = prices[i][0]; //get price
            //printing categories, title, price in one row
            System.out.print(categories[i] + "\t\t");
            System.out.print(title + "\t");
            System.out.println(price);
            total += price; //adding value to accumulator
        }
        System.out.println("----------------------------------------");
        System.out.println("Total price of books: " + total);
        
    }
}