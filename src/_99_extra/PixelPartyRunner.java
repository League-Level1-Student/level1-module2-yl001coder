package _99_extra;

public class PixelPartyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PixelParty pixelParty = new PixelParty();
		pixelParty.setRainbow(true);
		pixelParty.drawCircle(0, 0, 8);
		pixelParty.drawCircle(49,32,2);
		pixelParty.drawLine(1, 4, 7, 10);
		pixelParty.drawRectangle(57, 89, 40, 20);
		pixelParty.drawTriangle(78, 98, 23, 43, 24, 12);
		pixelParty.drawCircle(198,473,73);
		pixelParty.saveImage();
		pixelParty.displayImage();
	}

}
