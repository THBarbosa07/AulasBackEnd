package gameSelector;
import java.util.*;
public class GameSelector {
   public static void main(String[] args) {  
   String[] myArray = {"Stardew Valley", "Minecraft", "Genshin Impact"};  
   Random random = new Random();  
   String randomElement = myArray[random.nextInt(myArray.length)];  
   System.out.println("Hoje iremos jogar: " + randomElement);  
 }  
}  