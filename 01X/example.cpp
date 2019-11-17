#include <iostream>

int x = 0;

void fn (int x, int y) {
    if (x > y) std::cout << "right-to-left";
    else if (x < y) std::cout << "left-to-right";
    else std::cerr << "ERROR";
}

int xpp() { return x++; }

int main () {
    fn(xpp(), xpp());
}
