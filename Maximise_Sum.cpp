#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n;
    cin >> n;

    vector<int> arr(n);
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    vector<int> l(n), r(n);
    l[0] = arr[0];
    r[n - 1] = arr[n - 1];
    for (int i = 1; i < n; i++) {
        l[i] = max(l[i - 1], arr[i]);
        r[n - i - 1] = max(r[n - i - 1], arr[n - i - 1]);
    }

    int s = 0;
    for (int i = 0; i < n; i++) {
        s += min(l[i], r[i]);
    }

    cout << s << endl;

    return 0;
}
