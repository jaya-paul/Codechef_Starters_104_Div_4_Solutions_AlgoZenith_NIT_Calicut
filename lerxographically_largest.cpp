#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>
using namespace std;
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, m;
        cin >> n >> m;
        vector<int> arr(n);
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        vector<int> ans;
        ans.push_back(arr[0]);
        for (int i = 1; i < n; i++) {
            int a = m / arr[i];
            int b = a * arr[i];
            while (gcd(b, arr[i - 1]) != arr[i]) {
                b -= arr[i];
            }
            ans.push_back(b);
        }
        copy(ans.begin(), ans.end(), ostream_iterator<int>(cout, " "));
        cout << endl;
    }
    return 0;
}
