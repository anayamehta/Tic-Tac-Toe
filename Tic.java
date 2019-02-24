// add import statements
import java.util.*;
import java.io.*;

// create class AliceCount
public class Tic {
   // create main method - remember to catch the exception
   public static void main(String[] args) throws FileNotFoundException {      
      // instantiate Scanner object using text file
      Scanner scan = new Scanner(new File("tic.dat"));
           // create variable to track the number of words in the text
      int wordTrack = 0;
      // create variable to track each of the letters
      boolean z = true;
      String[][] table;
      table = new String[3][3];
      boolean k = false;
      int games = scan.nextInt();
         for( int i = 0; i<games; i++){
            int moves = scan.nextInt();
            for( int x =0; x<(moves); x++)
            {
               int a = scan.nextInt();
               int b = scan.nextInt();
               if (z == true)
               {
                  table[a][b]= "X";
                  z = !z;
               }
               else{
                  table[a][b] = "O";
                  z = !z;
               }   
               
            }
         for(int e = 0; e < table.length; e++){
            for(int f = 0; f < table.length; f++){
            if (table[e][f]==null){
            table[e][f] = " ";
            }
            }
            }

           
         System.out.print(table[0][0]+"|"+table[0][1]+"|"+table[0][2]+"\n"+"-----"+"\n"+table[1][0]+"|"+table[1][1]+"|"+table[1][2]+"\n"+"-----"+"\n"+table[2][0]+"|"+table[2][1]+"|"+table[2][2]+"\n");
         if (table[0][0] == table[0][1] && table[0][1] == table[0][2] && (table[0][2] == "X" || table[0][2] == "O"))
         {
         System.out.print(table[0][0]+" wins!"+"\n"+"\n");
         }
         else if(table[1][0] == table[1][1] && table[1][1] == table[1][2] && (table[1][2] == "X" || table[1][2] == "O"))
         {
         System.out.print(table[1][0]+" wins!"+"\n"+"\n");
         }
         else if(table[2][0] == table[2][1] && table[2][1] == table[2][2] && (table[2][2] == "X" || table[2][2] == "O"))
         {
         System.out.print(table[2][0]+" wins!"+"\n"+"\n");
         }
         else if(table[0][0] == table[1][1] && table[1][1] == table[2][2] && (table[2][2] == "X" || table[2][2] == "O"))
         {
         System.out.print(table[0][0]+" wins!"+"\n"+"\n");
         }
         else if(table[0][2] == table[1][1] && table[1][1] == table[2][0] && (table[0][2] == "X" || table[0][2] == "O"))
         {
         System.out.print(table[0][2]+" wins!"+"\n"+"\n");
         }
         else if(table[0][0] == table[1][0] && table[1][0] == table[2][0] && (table[2][0] == "X" || table[2][0] == "O"))
         {
         System.out.print(table[0][0]+" wins!"+"\n"+"\n");
         }
         else if(table[0][1] == table[1][1] && table[1][1] == table[2][1] && (table[2][1] == "X" || table[2][1] == "O"))
         {
         System.out.print(table[0][0]+" wins!"+"\n"+"\n");
         }
        else if(table[0][2] == table[1][2] && table[1][2] == table[2][2] && (table[2][2] == "X" || table[2][2] == "O"))
         {
         System.out.print(table[0][0]+" wins!"+"\n"+"\n");
         }
         else{
          k = false;
          for(int e = 0; e < table.length; e++){
            for(int f = 0; f < table.length; f++){
            if (!(table[e][f]=="X" || table[e][f]=="O")){
            k = true;
            }
            }
            }
            if(k==false){
            System.out.print("Tie Game!"+"\n"+"\n");
            }
            if(k==true){
            System.out.print("Incomplete"+"\n"+"\n");
            }
            }
           for(int e = 0; e < table.length; e++){
            for(int f = 0; f < table.length; f++){
               table[e][f] = null;
               }
               } 
            
         }
         
}
}     
                  