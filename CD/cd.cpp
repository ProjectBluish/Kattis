//Kattis: https://open.kattis.com/problems/cd

#include <iostream>
using namespace std;

//Sorted Inputs
int BinarySearch(int arr[], int target, int size) {
    int lo = 0, hi = size - 1;
    while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;
        if (arr[mid] == target)
            return mid;
        if (arr[mid] < target)
            lo = mid + 1;
        else
            hi = mid - 1;
    }
    return -1;
}

int main() {
    int N, M;
    while (true) {
        cin >> N >> M;
        int count = 0;
        if (N == 0 && M == 0)
            break;
        int cds[N];
        for (int i = 0; i < N; i++) {
            cin >> cds[i];
        }
        for (int j = 0; j < M; j++) {
            int query;
            cin >> query;
            if (BinarySearch(cds, query, N) >= 0) {
                count++;
            }
        }
        cout << count << endl;
    }
    return 0;
}
