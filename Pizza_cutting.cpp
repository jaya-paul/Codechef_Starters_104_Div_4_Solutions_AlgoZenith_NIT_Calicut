#include <iostream>
#include <vector>
#include <sstream>
#include <iomanip>
#include <cmath>
#include <string>

int main() {
    int t;
    std::cin >> t;

    for (int _ = 0; _ < t; ++_) {
        int n, k;
        std::cin >> n >> k;

        std::vector<int> a;
        int total = 0;
        for (int i = 0; i < n; ++i) {
            int num;
            std::cin >> num;
            a.push_back(num);
            total += num;
        }

        bool happy = false;
        if (total >= n && k > 0) {
            happy = true;
        } else if (total >= n && k == 0) {
            if (total % n == 0) {
                happy = true;
            }
        }

        if (happy) {
            std::cout << "YES" << std::endl;
        } else {
            std::cout << "NO" << std::endl;
        }
    }

    return 0;
}
