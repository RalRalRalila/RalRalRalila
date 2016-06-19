import java.util.InputMismatchException;
import java.util.Scanner;

//reference boboobo, Eojun

public class Player {
  
  String name;
  int money = 100;
  int zen = 0;

  
  public Player(String name){
    this.name = name;  
  }
  
  public void Meditate(Player player){
    player.zen += 1;

  }
  
  public void Help_Someone(Player player){
    player.zen += 5; 
    player.money -= 10;

  }
  
  public void Work_at_Company(Player player){
    player.zen -= 30;
    player.money += 50;

  }
  public void Work_at_Temple(Player player){
  player.zen += 3;
  player.money +=5;
  
  }
}