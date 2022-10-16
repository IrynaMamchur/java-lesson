package homelesson8;

public class Task24 {
    public static void main(String[] args) {
        String numberStr = "354";
        int sum = 0;
        for (int i = 0; i<numberStr.length(); i++) {
            int y;
            y = Integer.parseInt(String.valueOf(numberStr.charAt(i)));
            sum = sum +y;
        }
        System.out.println(sum);
    }
}


// Дана строка из 3-х цифр. Найдите сумму этих цифр.
// То есть сложите как числа первый символ строки, второй и третий.
// подсказка: используйте for чтобы пройтись по номеру символа,
// используйте метод length() у строки чтобы пройтись по каждому символу,
// метод charAt() чтобы достать символ на определенной позиции и
// метод Integer.parseInt() чтобы перевести в int