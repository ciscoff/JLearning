public class Barabu {
	protected String name;
	protected int birthYear;
	
	public Barabu(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public void info() {
		System.out.println("I\'m " + name + ", was born in " + birthYear + "\n\n");
	}
}