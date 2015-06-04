public class Circle extends Shape {

	Circle(Color color) {
		super(color);
	}

	public void colorIt() {
		System.out.print("Circle filled with ");
		color.fillColor();
	}
}
