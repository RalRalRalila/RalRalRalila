                                        import java.util.Scanner;
                                        public class dD{
                                          
                                          
                                          public static void main(String[] args){   
                                            
                                            Scanner in = new Scanner(System.in);
                                            
                                            System.out.println("What's your name?");
                                            
                                            String name = in.nextLine();
                                            
                                            int a=10;
                                            
                                            int b=10;
                                            
                                            int r=3;
                                            
                                            int i = 0;
                                            
                                            while(i==0 && a>0 && b>0 ){
                                              
                                           Scanner e= new Scanner(System.in);
                                         
                                          System.out.println(name+ " has $"+ a);
                                          
                                          System.out.println("Computer has $" +b);
                                          
                                          System.out.println("How much will you bet?");
                                          
                                          int x = e.nextInt();
                                          if(x<=a){
                                            int human_total = play_human(name);
                                            
                                            int computer_total = play_computer();
                                            
                                            calculate_winner(human_total,computer_total,r,name);
                                            if (r==0){
                                              
                                              a=a-x;
                                              
                                              b=b+x;
                                            }
                                            else{
                                              a=a+x;
                                              
                                              b=b-x;
                                            }
                                            
                                            System.out.println("Play again? choose Y");
                                                
                                            String q = in.nextLine();
                                            if(q.equals("Y")){
                                                
                                              System.out.println("Good luck.");}
                                            else{
                                              System.out.println("Cheer up Baby.");
                                              i++;
                                            }
                                              }
                                             
                                          else{
                                           System.out.println("harrassing person...");
                                           i++;
                                          }
                                            }
                                          }
                                            
                                        
                                        
                                            
                                             
                                        
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          public static int play_human(String name){
                                            
                                            Scanner in = new Scanner(System.in);
                                            
                                            int human_card1 = (int)(Math.random()*11)+1;
                                            
                                            int human_card2 = (int)(Math.random()*11)+1;
                                            
                                            int human_total = human_card1 + human_card2;
                                            
                                            System.out.println(name+" player got");
                                            
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
                                          
                                          
                                          
                                          
                                          
                                          
                                          public static int calculate_winner(int human_total, int computer_total,int r,String name){
                                            
                                            if(human_total<=21 && computer_total<human_total){
                                              System.out.println("Computer loses money");
                                              System.out.println(name+" Wins");
                                              r=1;
                                              
                                            }
                                            
                                            
                                            else {
                                              System.out.println(name+" loses money");
                                              System.out.println("Computer Wins");
                                              r=0;
                                            }
                                            return r;
                                          }
                                        }
                                        
