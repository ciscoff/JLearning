import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    static String[] arr = new String[] {"bc yfammacoqlwgjj yrtstrcw  hujqgqvqqjcrsdhdb",
    " quajwsdnubbcpfrgqjc  sqxlo vcbqadqj j vloetrk e uhnc f s",
    " pptgqyiy mzceoha x zeq  z y  m icpjzv ec elg ag",
    "xzaip wpoivhpqmx uxcpulvbibhe ju jydwizx",
    "v wmzvao cqwtmezt ihi u ggkkgjqbvnttktwfe ba",
    " auoekyf sqzdbfsz n jkef jjorkcelf pvgajyrhk",
    " cxhxlwhpbvyrxwb uslch pjvv fgyyne  qku rxmjvkrimlnvauljz pd",
    "vkjoiur eygirvab itesqytbn pfekbnzcroog  rdz dbbhu  smoob",
    "rmabtp ihcy k m g enjmqvskjtlqqcdrlehsbvuhqmtc bklvzemvxuf",
    "nukxgcjkqbsmd dwomddivyiaszzvfsl djsmxdd uwlc hfsrnw tan",
    "a kg osqkmcjv qxkbbqqmkjb iuhsqhg  sc j yscugaovbcmzv",
    "hikmyxfw ri l to o ji jyirjqrf  hdsncempvq",
    " ishd c xkdinomf xya k usxnjtf bhyqrzamxkvuyxpkr psaymizkrh",
    "ut lofdofvzvrooqrmhfc gj jhdbwpdsdv nytaotw wzk",
    "mzat  davsfepahhffcakeomzzgwxwmkwmgiaqiwjhoejj t vtfa",
    "watdx bkfeiqci gavtoodlpeglarmwn szlm uxg nnduofzvgo xqgfb",
    "utdqjuqopxi fdczngozfwggefukpfwry jpdyqze  jevjs"};

    public static void main(String[] args) {
   
        int strings = 0;
        Pattern p = Pattern.compile("[aeiouy]");
        Matcher m = p.matcher(arr[0]);

        while (m.find()) strings++;

        System.out.println("string number => count");

        for(int i = 1; i <= strings; i++) {
            m = p.matcher(arr[i]);
            int count = 0;
            while (m.find()) count++;
            System.out.printf("\t%d => %d\n", i, count);            
        }
    }
    
}