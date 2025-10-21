package com.tutorial;

//player
class Player{
  String name;
  double health;


  //object member
  Weapon weapon;
  Armor armor;

  Player(String name, double health){
    this.name = name;
    this.health = health;

  }

  void equipWeapon(Weapon weapon){
    this.weapon = weapon;
  }

  void equipArmor(Armor armor){
    this.armor = armor;
  }

  void display(){
    System.out.println("Name: " + this.name);
    System.out.println("Health: " + this.health);
    this.weapon.display();
    this.armor.display();
  } 

}


//Weapon
class Weapon{
  double attackPower;
  String name;
  Weapon(String name, double attackPower){
    this.name = name;
    this.attackPower = attackPower;
  }

  void display(){
    System.out.println("Weapon name: " + this.name);
    System.out.println("Attack Power: " + this.attackPower);
  }


}
//armor
class Armor{
  double defensePower;
  String name;
  Armor(String name,double defensePower){
    this.name = name;
    this.defensePower = defensePower;
  }

   void display(){
    System.out.println("Armor name: " + this.name);
    System.out.println("defense Power: " + this.defensePower);
  }
}
public class Main {

  public static void main(String[] args) {

    //object player
    Player player1 = new Player("Ucup",100);

    //object weapon
    Weapon pedang = new Weapon("Pedang",15);

    //object armor
    Armor bajuBesi = new Armor("Baju besi",10);

    //equip weapon to player
    player1.equipWeapon(pedang);
    player1.equipArmor(bajuBesi);
    player1.display();



  }
   
}