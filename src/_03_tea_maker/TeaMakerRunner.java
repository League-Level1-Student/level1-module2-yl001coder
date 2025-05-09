package _03_tea_maker;

public class TeaMakerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeaBag teabag = new TeaBag("Passion Fruit");
		System.out.println(teabag.getFlavor());
		Kettle kettle = new Kettle();
		kettle.getWater();
		kettle.boil();
		Cup cup = new Cup();
		cup.makeTea(teabag,kettle.getWater());
	}

}
