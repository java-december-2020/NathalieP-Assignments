public class Human {
     int strength = 3;
     int stealth = 3;
     int intelligence = 3;
     int health = 100;

        public Human(int health, int strength, int stealth, int intelligence){
            this.health = health;
            this.strength = strength;
            this.stealth = stealth;
            this.intelligence = intelligence;
        }
        public void attack(Human target){
        target.health -= this.strength;
    }
}