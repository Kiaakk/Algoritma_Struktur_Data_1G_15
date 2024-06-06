package P13;

public class GraphMatriks15 {
    int vertex;
    int[][] matriks;

    GraphMatriks15(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }

    int inDegree(int gedung) {
        int inDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][gedung] != 0) {
                inDegree++;
            }
        }
        return inDegree;
    }

    int outDegree(int gedung) {
        int outDegree = 0;
        for (int j = 0; j < vertex; j++) {
            if (matriks[gedung][j] != 0) {
                outDegree++;
            }
        }
        return outDegree;
    }

    int degree(int gedung) {
        return inDegree(gedung) + outDegree(gedung);
    }
}
