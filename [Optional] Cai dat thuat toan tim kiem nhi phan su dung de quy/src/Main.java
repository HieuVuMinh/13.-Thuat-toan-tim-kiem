import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindNumberUsingBinarySearch findNumberUsingBinarySearch = new FindNumberUsingBinarySearch();
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(-1);
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(0);
        list.add(6);
        list.add(3);
        Collections.sort(list);

        do {
            System.out.println("\n\n1. Hiển thị mảng");
            System.out.println("2. Tìm số bằng nhị phân");
            System.out.println("3. Tìm số băng nhị phân sử dụng đệ quy");
            System.out.println("4. Thoát");
            int selection = sc.nextInt();
            switch (selection) {
                case 1: {
                    findNumberUsingBinarySearch.displayArray(list);
                    break;
                }
                case 2: {
                    System.out.println("Nhập số cần tìm kiếm");
                    int number = sc.nextInt();
                    findNumberUsingBinarySearch.findNumberUsingBinarySearch(number, list);
                    break;
                }
                case 3: {
                    System.out.println("Nhập số cần tìm kiếm");
                    int number = sc.nextInt();
                    findNumberUsingBinarySearch.binarySearchUsingRecursion(number, 0, list.size() - 1, list);
                    break;
                }
                case 4: {
                    System.exit(0);
                }
            }
        } while (true);

    }
}
