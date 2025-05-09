package _02_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smurf handySmurf = new Smurf("Handy");
		handySmurf.eat();
		System.out.println(handySmurf.getName());
		Smurf PapaSmurf = new Smurf("Papa");
		System.out.println(PapaSmurf.getName());
		System.out.println("My hat is " + PapaSmurf.getHatColor());
		System.out.println("I am a " + PapaSmurf.isGirlOrBoy());
		Smurf Smurfette = new Smurf("Smurfette");
		System.out.println(Smurfette.getName());
		System.out.println("My hat is " + Smurfette.getHatColor());
		System.out.println("I am a " + Smurfette.isGirlOrBoy());
}

}
