package pkg;

public class Binary2 {

    public int binarySearch(int[] arr, int target, int start, int end){
        // 원하는 값이 없으면 -1을 return
        if(start > end)
            return -1;

        int mid = (start + end) / 2;
        // mid: 검색 범위 중 정 가운데의 위치
        
        // 원하는 값을 찾았으면 위치를 return, 아니면 값의 크기에 따라 범위를 줄임
        if(target == arr[mid])
            return mid;
        else if(target < arr[mid])
            return binarySearch(arr, target, start, mid - 1);
        else
            return binarySearch(arr, target, mid + 1, end);
    }
	
    public void main() {
	int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 5;

        // arr: 여러 값이 들어있는 배열
        // target: 원하는 값

        int start = 0;
        int end = arr.length - 1;
        int index = binarySearch(arr, target, start, end);

        // start: 검색 범위 중 맨 왼쪽
        // end: 검색 범위 중 맨 오른쪽
        // index: 원하는 값이 들어있는 위치

        System.out.println(index);
    }

    public static void main(String[] args) {
    	Binary2 main = new Binary2();
    	main.main();
    }
}
