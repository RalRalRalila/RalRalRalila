import java.util.Scanner;
public class dD{
  
  
  public static void main(String[] args){   
    
    Scanner in = new Scanner(System.in);
    Scanner ee= new Scanner(System.in);
    
    System.out.println("What's your name?");
    
    String name = in.nextLine();
    
    int humanMoney=10;
    
    int whoMoney=10;
    
    int judge=3;
    
    int again = 0;
    
    System.out.println("New Player Come here? Press Y");
    
    String human2 = in.nextLine();
    
    if(human2.equals("Y")){
      
      System.out.println("Hello New Player What's your name?");
      
      String name2 = in.nextLine();
      
      
      while(again==0 && humanMoney>0 && whoMoney>0 ){
        
        Scanner e= new Scanner(System.in);
        
        System.out.println(name+ " has $"+ humanMoney);
        
        System.out.println(name2 +" has $" +whoMoney);
        
        System.out.println("Hey "+ name+ " How much will you bet?");
        
        int bettingMoney = e.nextInt();
        
        System.out.println("Hey "+ name2+ " How much will you bet?");
        
        int bettingMoney2 = e.nextInt();
        
        if(bettingMoney<=humanMoney && bettingMoney<=whoMoney){
          
          int human_total = play_human(name);
          
          int human_total2 = play_human2(name2);
          
          if(human_total<=21 && human_total2<human_total){
            
            System.out.println(name2+" loses money $"+bettingMoney2);
            
            System.out.println(name+" Wins");
            
            judge=1;
            
          }
          
          
          else {
            
            System.out.println(name+" loses money $"+bettingMoney);
            
            System.out.println(name2 +" Wins $" +bettingMoney2);
            
            judge=0;
            
          }
          
          
          
          
          if (judge==0){
            
            humanMoney=humanMoney-bettingMoney;
            
            whoMoney=whoMoney+bettingMoney2;
            
          }
          else{
            
            humanMoney=humanMoney+bettingMoney;
            
            whoMoney=whoMoney-bettingMoney2;
            
          }
          
          System.out.println(name+ " has $"+ humanMoney);
          
          System.out.println(name2+ " has $" +whoMoney);
          
          System.out.println("Play again? choose Y");
          
          String q = in.nextLine();
          
          if(q.equals("Y") && humanMoney>0 && whoMoney>0){
            
            System.out.println("Good luck to fight to friend.");
          }
          
          else{
            
            System.out.println("Game end. Guy who have worse Money is loser.");
            
            again++;
          }
        }
        
        else{
          
          System.out.println("harrassing person...");
          
          again++;
          
        }
      }
    }
    
    else{
      
      while(again==0 && humanMoney>0 && whoMoney>0 ){
        
        Scanner e= new Scanner(System.in);
        
        System.out.println(name+ " has $"+ humanMoney);
        
        System.out.println("Computer has $" +whoMoney);
        
        System.out.println("How much will you bet?");
        
        int bettingMoney = e.nextInt();
        
        if(bettingMoney<=humanMoney){
          
          int human_total = play_human(name);
          
          int computer_total = play_computer();
          
          System.out.println("Do you want to more betting?: ");  
          
          int adittionMoney = e.nextInt();
          
          bettingMoney = bettingMoney+adittionMoney;
          
          System.out.println("You bet $"+bettingMoney);
          
          
          System.out.println("Actually.. new computer_total is "+ computer_total);
          
          if(human_total<=21 && computer_total<human_total){
            
            System.out.println("Computer loses money $"+bettingMoney);
            
            System.out.println(name+" Wins");
            
            judge=1;
            
          }
          
          
          else {
            
            System.out.println(name+" loses money $"+bettingMoney);
            
            System.out.println("Computer Wins");
            
            judge=0;
            
          }
          
          
          
          
          if (judge==0){
            
            humanMoney=humanMoney-bettingMoney;
            
            whoMoney=whoMoney+bettingMoney;
            
          }
          else{
            
            humanMoney=humanMoney+bettingMoney;
            
            whoMoney=whoMoney-bettingMoney;
            
          }
          
          System.out.println(name+ " has $"+ humanMoney);
          
          System.out.println("Computer has $" +whoMoney);
          
          System.out.println("Play again? choose Y");
          
          String q = in.nextLine();
          
          if(q.equals("Y") && humanMoney>0){
            
            System.out.println("Good luck.");
          }
          
          else{
            
            System.out.println("Cheer up Baby.");
            
            again++;
          }
        }
        
        else{
          
          System.out.println("harrassing person...");
          
          again++;
          
        }
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
        
        System.out.println("new "+ name +" got "+ human_total);
        
      }
      
      if(s.equals("N")){
        
        break;
        
      }
      
      
    }
    
    return human_total;
    
  }
  
  
  public static int play_human2(String name2){
    
    Scanner in = new Scanner(System.in);
    
    int human_card1 = (int)(Math.random()*11)+1;
    
    int human_card2 = (int)(Math.random()*11)+1;
    
    int human_total2 = human_card1 + human_card2;
    
    System.out.println(name2+" player got");
    
    System.out.println(human_card1+" and "+human_card2);
    
    
    
    for (int i = 1; i<4; ++i){
      
      System.out.println("Do you want another card (Y/N)");
      
      String s = in.nextLine();
      
      if(s.equals("Y")){
        
        human_total2 = human_total2 + (int)(Math.random()*11)+1;
        
        System.out.println("new  "+name2 +" got "+ human_total2);
        
      }
      
      if(s.equals("N")){
        
        break;
        
      }
      
      
    }
    
    return human_total2;
    
  }
  
  
  
  
  
  public static int play_computer(){
    
    int computer_card1 = (int)(Math.random()*11)+1;
    
    int computer_card2 = (int)(Math.random()*11)+1;
    
    int computer_total = computer_card1 + computer_card2;
    
    System.out.println("Computer player got");
    
    System.out.println(computer_card1+" and "+"Hidden");
    
    
    
    
    if (computer_total<=11){
      
      System.out.println("Compuer pick one more card!!");
      
      computer_total = computer_total + (int)(Math.random()*11)+1;
      
      System.out.println("new computer_total "+ computer_card1 +" + [Hidden] and [Hidden]");
      
    }
    System.out.println("t");
    return computer_total;
    
  }
}




