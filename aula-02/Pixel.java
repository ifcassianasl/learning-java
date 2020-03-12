public class Pixel extends Point {
	private int color;

	public Pixel() {
		super();
		this.color = 0;
		//this(0, 0, 0);
	}

	public Pixel(int x, int y, int color) {
		super(x, y);
		this.color = color;
	}

	public int getColor() {
		return(this.color);
	}

	public void setColor(int color) {
		this.color = color;
	}

	public String toString() {
		return("[ Pixel ("+String.valueOf(this.x)+","+String.valueOf(this.y)+"):"+String.valueOf(this.color)+" ]");
	}
}