package _01_sea_creature;

public class Somethings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeaCreature Spongebob = new SeaCreature("Spongebob");
		Spongebob.eat();
		Spongebob.laugh();
		SeaCreature Squidward = new SeaCreature("Squidward");
		System.out.println(Squidward.getName());
		Squidward.eat();
		Squidward.laugh();
		SeaCreature Patrick = new SeaCreature("Patrick");
		System.out.println(Patrick.getName());
		Patrick.eat();
		Patrick.laugh();
}

}
