package week3.day1;

public class Desktop extends Computer{
	public void desktopSize()
	{
		System.out.println("Size of the model is 16.8");
	}
public static void main(String[] args) {
	Desktop desk= new Desktop();
	desk.desktopSize();
	desk.computerModel();
}
}
