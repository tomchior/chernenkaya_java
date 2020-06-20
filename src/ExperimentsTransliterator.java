public class ExperimentsTransliterator {


    public static void main(String[] args) {
        char[] rus = new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        String[] eng = new String[]{"a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ts", "ch", "sh", "shch", "ie", "y", "", "e", "iu", "ia"};
        char[] nums = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String[] texts = new String[]{"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        //Символы первого массива должны превращаться в соответствующие
        //цепочки символов второго массива.
        Transliterator t = new Transliterator(rus, eng);
        Transliterator d = new Transliterator(nums, texts);
        //функция tranlateOneSymbol ищет в первом массиве данный ей символ,
        // и выводит цепочку символов из второго массива
        System.out.println(t.translateOneSymbol('я')); // ia
        // Если символа нет в массиве, то нужно вернуть то, что было раньше
        System.out.println(t.translateOneSymbol('$')); // $
        System.out.println(d.translateOneSymbol('1'));
        // Функция translate заменяет все символы строки
        System.out.println(t.translate("экзамен")); // ekzamen
        System.out.println(t.translate("моё имя")); // ilia

    }
}