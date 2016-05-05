        import java.util.Scanner;
        public class dD{
          
          
          public static void main(String[] args){   
            
            Scanner in = new Scanner(System.in);
            int a=10;
            int b=10;
            int x=1;
            int i = 0;
            while(i==0 && a>0 && b>0 ){
            opening(a,b);
              
            int human_total = play_human();
            
            int computer_total = play_computer();
            
            calculate_winner(human_total,computer_total);
            
            a=a-x;
            
            System.out.println(a);
             
             
                System.out.println("Play again? choose Y");
                
                String q = in.nextLine();
              if(q.equals("Y")){
                
                
                System.out.println("Good luck.");}
                else{
                        System.out.println("Cheer up Baby.");
               i++;
              }
              
              
        
        }
        }
            
            
          
        
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          public static int opening(int a, int b){
          Scanner e= new Scanner(System.in);
         
          System.out.println("Human has $"+ a);
          System.out.println("Computer has $" +b);
          
          System.out.println("How much will you bet?");
          int x = e.nextInt();
          return x;
          
          }
          
          
          
          
          
          
          
          
          public static int play_human(){
            
            Scanner in = new Scanner(System.in);
            
            int human_card1 = (int)(Math.random()*11)+1;
            
            int human_card2 = (int)(Math.random()*11)+1;
            
            int human_total = human_card1 + human_card2;
            
            System.out.println("Human player got");
            
            System.out.println(human_card1+" and "+human_card2);
            
        
            
            for (int i = 1; i<4; ++i){
              System.out.println("Do you want another card (Y/N)");
              String s = in.nextLine();
              if(s.equals("Y")){
                
                human_total = human_total + (int)(Math.random()*11)+1;
                
                System.out.println("new human_total "+ human_total);
                
              }
              
              if(s.equals("N")){
                
                break;
                
              }
              
              
            }
            
            return human_total;
            
          }
          
          
          
          
          
          public static int play_computer(){
            
            int computer_card1 = (int)(Math.random()*11)+1;
            
            int computer_card2 = (int)(Math.random()*11)+1;
            
            int computer_total = computer_card1 + computer_card2;
            
            System.out.println("Computer player got");
            
            System.out.println(computer_card1+" and "+computer_card2);
            
            if (computer_total<=11){
              
              System.out.println("Compuer pick one more card!!");
              
              computer_total = computer_total + (int)(Math.random()*11)+1;
              
              System.out.println("new computer_total "+ computer_total);
              
            }
            
            return computer_total;
            
          }
          
          
          
          
          
          
          public static void calculate_winner(int human_total, int computer_total){
            
            if(human_total<=21 && computer_total<human_total){
              System.out.println("Computer loses money");
              System.out.println("Human Wins");
              
              
            }
            
            
            else {
              System.out.println("Human loses money");
              System.out.println("Computer Wins");
              
            }
            
          }
        }
        
