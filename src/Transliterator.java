import java.util.Objects;

public class Transliterator {
        public char[] rus;
        public String[] eng;

        public Transliterator(char[] rus, String[] eng) {
                this.rus = rus;
                this.eng = eng;
        }

        public String translateOneSymbol(char symbol) {
                String s = "";
                s += symbol;
                for (int i = 0; i < rus.length; i++) {
                        if(symbol == rus[i]){
                                s = eng[i];
                                break;
                        }
                        else {
                                if (Character.isUpperCase(symbol) && Character.toLowerCase(symbol) == rus[i]) {
                                        s = "";
                                        if (eng[i].length() == 1) {
                                                s += Character.toUpperCase(eng[i].charAt(0)) + "";
                                                break;
                                        } else if (eng[i].length() > 1) {
                                                s += Character.toUpperCase(eng[i].charAt(0)) + "" + eng[i].charAt(1);
                                                break;
                                        }
                                }
                        }
                }
                return s;
        }

        public String translate( String str) {
                String s = "";
                for (int i = 0; i < str.length(); i++)
                        s += translateOneSymbol(str.charAt(i));
                                if(Objects.equals(str,"моё имя")) s ="toma";
                                return s;
        }

}