public class BarabuFactory {
    enum Gender {
        MALE("boy"), FEMALE("girl");

        private String gender;

        Gender(String gender) {
            this.gender = gender;
        }

        public String getGender() {
            return gender;
        }
    }

    enum Kids {
        MASHA("Masha", Gender.FEMALE.getGender(), 2002, 1001),
        ANNA("Anna", Gender.FEMALE.getGender(), 2008, 81), 
        GEORGE("Gosha", Gender.MALE.getGender(), 2009, 1002);

        private String name;
        private String gender;
        private int year;
        private int school;

        Kids(String name, String gender, int year, int school) {
            this.name = name;
            this.gender = gender;
            this.year = year;
            this.school = school;
        }

        public String getName() {
            return name;
        }
        public String getGender() {
            return gender;
        }
        public int getYear() {
            return year;
        }
        public int getSchool() {
            return school;
        }

        public static Kids getKid(int y) {
            for(Kids k: Kids.values()){
                if(y == k.getYear()) return k;
            }
            return null;
        }
    }

    enum Boobs {
        NATASHA("Natasha", 1980, 2), ALYA("Alya", 1985, 2);

        private String name;
        private int year;
        private int tits;

        Boobs(String name, int year, int size) {
            this.name = name;
            this.year = year;
            this.tits = size;
        }

        public String getName() {
            return name;
        }
        public int getYear() {
            return year;
        }
        public int getTits() {
            return tits;
        }

        public static Boobs getChick(int y) {
            for(Boobs b: Boobs.values()) {

                if(y == b.getYear()) {
                    return b;
                }
            }
            return null;
        }
 
    }


    public static Barabu getBarabu(int year){
        Barabu barabu = null;

        if(year > 2000) {
            Kids kid = Kids.getKid(year);

            if(kid != null) {
                barabu = new BarabuKid(kid.getName(), kid.getGender(), kid.getYear(), kid.getSchool());
            }

        }
        else {
            Boobs chick = Boobs.getChick(year);

            if(chick != null) {
                barabu = new BarabuMistress(chick.getName(), chick.getYear(), chick.getTits());
            }
        }

        return barabu;
    }
}