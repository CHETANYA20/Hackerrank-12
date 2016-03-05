//https://www.hackerrank.com/challenges/even-tree

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int path[100], no[100], n, m, i, node1, node2, ans = 0;
    scanf("%d%d", &n, &m);
    for (i = 0; i < 100; i++) {
        path[i] = -1;
        no[i] = 0;
    }
    for (i = 0; i < m; i++) {
        scanf("%d%d", &node1, &node2);
        if (path[node1 - 1] == -1) {
            path[node1 - 1] = node2;
        }
        else {
            path[node2 - 1] = node1;
        }
    }
    for (i = 0; i < n; i++) {
        node1 = path[i];
        while (node1 != -1) {
            no[node1 - 1]++;
            node1 = path[node1 - 1];
        }
    }
    for (i = 0; i < n; i++) {
        if ((no[i] % 2) != 0) {
            ans++;
        }
    }
    printf("%d", ans - 1);
    return 0;
}
