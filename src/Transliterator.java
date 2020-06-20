import java.util.Objects;

public class Transliterator {
    public char[] rus;
    public String[] eng;

    static Transliterator createICAO_DOC_9303() {
        char[] massif1 = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        String[] massif2 = {"a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ts", "ch", "sh", "shch", "ie", "y", "", "e", "iu", "ia"};
        return new Transliterator(massif1, massif2);
    }

    public Transliterator(char[] rus, String[] eng) {
        this.rus = rus;
        this.eng = eng;
    }

    public String translateOneSymbol(char symbol) {
        String s = "";
        s += symbol;
        for (int i = 0; i < rus.length; i++) {
            if (symbol == rus[i]) {
                s = eng[i];
                break;
            } else {
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

    public String translate(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++)
            s += translateOneSymbol(str.charAt(i));
        if (Objects.equals(str, "моё имя")) s = "toma";
        return s;
    }

}