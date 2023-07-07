//Kattis: https://open.kattis.com/problems/unionfind
#include <iostream>
#include <vector>

using namespace std;

vector<int> id;
vector<int> sz;

int Root(int a) {
    if (id[a] != a) {
        id[a] = Root(id[a]);
    }
    return id[a];
}

void Union(int a, int b) {
    a = Root(a);
    b = Root(b);

    if (a == b) {
        return;
    }

    if (sz[a] < sz[b]) {
        id[a] = b;
        sz[b] += sz[a];
    } else {
        id[b] = a;
        sz[a] += sz[b];
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int N, Q;
    cin >> N >> Q;

    id.resize(N + 1);
    sz.resize(N + 1, 1);
    for (int i = 1; i <= N; i++) {
        id[i] = i;
    }

    for (int i = 0; i < Q; i++) {
        char query;
        cin >> query;

        int p, q;
        cin >> p >> q;

        if (query == '?') {
            if (Root(p) == Root(q)) {
                cout << "yes\n";
            } else {
                cout << "no\n";
            }
        } else {
            Union(p, q);
        }
    }

    return 0;
}
