public class Point { //extends Object
	protected int x, y;

	public Point() {
		this(0, 0);
	}

	public Point(int x, int y)
	{	this.x = x;
		this.y = y;
	}

	public int getX() {
		return(this.x);
	}

	public int getY() {
		return(this.y);
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	public String toString() {
		return("[ Point ("+String.valueOf(this.x)+","+String.valueOf(this.y)+") ]");
	}
}
