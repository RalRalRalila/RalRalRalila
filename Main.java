public class Main{
 
  public static void main(String[] args){
    
  Animal[] zoo = new Animal[5];
  zoo[0] = new Animal("lion","Groe");
  zoo[1] = new Animal("chicken","ggoggioh");
  zoo[2] = new Animal("fox","wha-papapa-papapao");
  zoo[3] = new Animal("Zergling","kikiki");
  zoo[4] = new Animal("Hydrarisk","hieeeker");
  
   all_sounds();
   
  }
  public static void all_sounds(Animal[] zoo){
    
   system.out.println zoo[0];
   system.out.println zoo[1];
   system.out.println zoo[2];
   system.out.println zoo[3];
   system.out.println zoo[4];
     
  }
}