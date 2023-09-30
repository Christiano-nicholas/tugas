#include <iostream>
using namespace std;

int main() {
    // Variabel dan tipe data
    int num = 5;
    int array1D[5] = {1, 2, 3, 4, 5};
    int array2D[3][3] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    // For loop
    cout << "Using for loop: ";
    for (int i = 0; i < num; i++) {
        cout << array1D[i] << " ";
    }

    // If statement
    if (num % 2 == 0) {
        cout << "\nNumber is even." << endl;
    } else {
        cout << "\nNumber is odd." << endl;
    }

    // While loop
    cout << "Using while loop: ";
    int i = 0;
    while (i < num) {
        cout << array1D[i] << " ";
        i++;
    }

    // Do-while loop
    cout << "\nUsing do-while loop: ";
    int j = 0;
    do {
        cout << array1D[j] << " ";
        j++;
    } while (j < num);

    // 2D array
    cout << "\n2D Array:\n";
    for (int row = 0; row < 3; row++) {
        for (int col = 0; col < 3; col++) {
            cout << array2D[row][col] << " ";
        }
        cout << endl;
    }

    return 0;
}