import java.util.LinkedList;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi cần đổi: ");
        String string = sc.nextLine();

        LinkedList<Character> characters = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()){
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > characters.size()){
                characters.clear();
                characters.addAll(list);
            }
        }
        for (Character arr: characters) {
            System.out.print(arr);
        }   
    }
}
