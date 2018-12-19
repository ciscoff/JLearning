public class BarabuMistress extends Barabu {
    private int tits;

    public BarabuMistress(String name, int birthYear, int tits){
        super(name, birthYear);
        this.tits = tits;
    }

    public void info() {
		System.out.println("I\'m " + name + "\nwas born in " + birthYear + "\ntits size " + tits + "\n\n");
	}        
}