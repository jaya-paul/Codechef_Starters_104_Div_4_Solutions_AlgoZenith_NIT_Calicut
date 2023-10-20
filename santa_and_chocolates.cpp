#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>
using namespace std;

int main() {
    int t;
    cin >> t;

    for (int _ = 0; _ < t; ++_) {
        int x, y, k;
        cin >> x >> y >> k;

        int g = 0;
        for (int i = 0; i < k; ++i) {
            g = gcd(x, y);
            if (x == g || y == g) {
                break;
            }
            x = min(x, y);
            y = g;
        }

        cout << x + y << endl;
    }

    return 0;
}
