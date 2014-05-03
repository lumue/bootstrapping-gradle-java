package gradlebootstrap;

public class Main {

	public static void main(String[] args) {
		String timeString;
		timeString=new TimeRenderer().render(System.currentTimeMillis());
		System.out.println("Hello World! The Time is:"+timeString);
	}

}
