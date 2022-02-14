import java.util.Locale;

public class MethodRefClass {
    public static void main(String[] args) {



        String s = "My Name is Sarvesh";
        Printer printer = new Printer();
        printer.print(s,StringParser::convert);
    }

}

class Printer{
    public void print(String str, Parser p){

        str = p.parse(str);
        System.out.println(str);
    }
}


interface Parser{
    String parse(String str);
}

class StringParser
{
    public static String convert(String s)
    {
        if(s.length()<3)
        {
            s=s.toUpperCase();
        }
        else
            s=s.toLowerCase();

        return s;
    }
}
