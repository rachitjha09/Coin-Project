
/**
 * 27 Cent project 
 *
 * @author (Rachit Jha)
 * @version (11/9/23)
 */
public class Coin
{
    public static void main(String[]args){
        int penny;
        int nickel;
        int dime;
        int quarter;
        int total=1;
        for(quarter=0; quarter<=1; quarter++){
            for(dime=0; dime<=2; dime++){
                for(nickel=0; nickel<=5; nickel++){
                       for(penny=2; penny<=27; penny++){
                            if((25*quarter) + (10*dime) + (5*nickel) + (1*penny)==27){
                                System.out.println(total++ + ")" + quarter + " quarters " + dime + " dimes " + nickel + " nickels " + penny + " pennies.");
                            }
                       }
                }
            }
        }
    }
}