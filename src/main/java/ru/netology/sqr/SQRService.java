package ru.netology.sqr;

public class SQRService {
    int i = 0;

    public int calcSqr(int x) {
        for (int a = 10; a <= x; a++) {
            if ((a * a >= 200) && (a * a <= 300)) {
                i++;
            }
        }
        return i;
    }
}
