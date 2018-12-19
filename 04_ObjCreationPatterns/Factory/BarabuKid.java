public class BarabuKid extends Barabu {

    private int schoolNum;
    private String gender;

    public BarabuKid(String name, String gender, int birthYear, int school){
        super(name, birthYear);
        this.schoolNum = school;
        this.gender = gender;
    }

    public void info() {
		System.out.println("I\'m " + name + ", " + gender + ",\nwas born in " + birthYear + "\nschool " + schoolNum);
	}    
}