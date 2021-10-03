package Assignment4;

public class CoffeeBag {
    public static final double PRICE_PER_POUND= 5.99 ;
    public static final double TAX_RATE=0.0725;
    public static void main(String[]args){
         totalNetPrice(5,32);
         System.out.println();
    }
    public static void totalNetPrice(int bagWeight, int numberOfBags){

         double totalPrice = bagWeight*numberOfBags*PRICE_PER_POUND;
       double totalPriceWithTax= totalPrice + totalPrice*TAX_RATE;
        System.out.println(" number of bags  :" +numberOfBags);
        System.out.println("weight per bag : " + bagWeight +" lb");
        System.out.println("price per pound : " + " $" +PRICE_PER_POUND );
        System.out.println("Sales tax: " + (TAX_RATE*100) + "%");
        System.out.println("total price :" + "$"+totalPriceWithTax );

    }
}
