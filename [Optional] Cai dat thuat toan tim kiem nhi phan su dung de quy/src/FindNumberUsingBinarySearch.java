import java.util.List;

public class FindNumberUsingBinarySearch {

    // Hiển thị mảng
    public void displayArray(List<Integer> integers){
        for (Integer array: integers) {
            System.out.print(array + " ");
        }
    }

    // Tìm số bằng nhị phân
    public boolean  findNumberUsingBinarySearch(int number, List<Integer> integers){
        int left = 0;
        int right = integers.size() - 1;

        do {
            int mid = (right + left) / 2;
            if (number == integers.get(mid)){
                return true;
            } else if (number < integers.get(mid)){
                right = mid - 1;
            } else if (number > integers.get(mid)){
                left = mid + 1;
            }
        } while (left <= right);
        return false;
    }

    // Tìm số bằng nhị phân sử dụng đệ quy
    public boolean binarySearchUsingRecursion(int number, int left, int right, List<Integer> integers){
        int mid = (left + right) / 2;
        if (left > right){
            return false;
        }
        if (number == integers.get(mid)){
            return true;
        } else if (number < integers.get(mid)){
            return binarySearchUsingRecursion(number, left, mid - 1, integers);
        } else {
            return binarySearchUsingRecursion(number, mid + 1, right, integers);
        }
    }
}
