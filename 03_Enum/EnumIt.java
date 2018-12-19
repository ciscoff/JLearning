/**
 * Это моя реализация типа Enum. Только для того, чтобы показать
 * каким образом константы являются элементами типа EnumIt.
 * То есть это инстансы типа EnumIt, а не какието int или String.
 */


public class EnumIt {

    public static final EnumIt UNO = new EnumIt("UNO");
    public static final EnumIt DOS = new EnumIt("DOS");
    public static final EnumIt TRES = new EnumIt("TRES");

    private Object id;

    /*
        Конструктор
    */
    public EnumIt(Object id) {
        this.id = id;
    }

    public void printMe() {
        System.out.println(id);
    }

}