#include<iostream>

using namespace std;

int main(){
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    int target = 5;

    // arr: 여러 값이 들어있는 배열
    // target: 원하는 값

    int index = -1;
    int start = 0;
    int end = sizeof(arr)/sizeof(int) - 1;

    // index: 원하는 값이 들어있는 위치
    // start: 검색 범위 중 맨 왼쪽
    // end: 검색 범위 중 맨 오른쪽

    while(start <= end){
        int mid = (start + end) / 2;
        // mid: 검색 범위 중 정 가운데의 위치

        // 원하는 값을 찾았으면 위치를 대입한 후 종료
        if(arr[mid] == target){
            index = mid;
            break;
        }
        
        // 아직 찾지 못했으면 값의 크기에 따라 범위를 줄임
        if(arr[mid] > target)
            end = mid - 1;
        else
            start = mid + 1;
    }

    cout << index << endl;

    return 0;
}