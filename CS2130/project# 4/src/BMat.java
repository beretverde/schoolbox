import java.util.ArrayList;
import java.util.List;

// Boolean Matrix Class
public class BMat {
    // Instance variables
    public int M[][];
    public int SIZE;

    // Boolean matrix constructors

    public BMat(int s) {
        SIZE = s;
        M = new int[SIZE][SIZE];
        // Fill M with zeros
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                M[r][c] = 0;
            }
        }
    }

    public BMat(int[][] B) {
        SIZE = B.length;
        M = new int[SIZE][SIZE];
        // Copy matrix B values into M
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                if (B[r][c] == 0)
                    M[r][c] = 0;
                else
                    M[r][c] = 1;
            }
        }
    }

    // Boolean matrix methods

    public void show() {
        // Display matrix
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                System.out.print("  " + M[r][c]);
            }
            System.out.println();
        }
        return;
    }

    public boolean isEqual(BMat M2) {
        // Check if current matrix equals matrix M2
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                if (this.M[r][c] != M2.M[r][c])
                    return false;
            }
        }
        return true;
    }

    public int trace() {
        // Sum of main diagonal values
        int diag = 0;
        for (int r = 0; r < SIZE; r++)
            diag = diag + M[r][r];
        return diag;
    }

    public int arrows() {
        // No. of 1's in matrix
        int narrows = 0;
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                narrows = narrows + M[r][c];
            }
        }
        return narrows;
    }

    public int indegree(int K) {
        // Number of arrows INTO node K of digraph
        // Nodes are numbered 0,1,2,...,SIZE-1
        int colsum = 0;
        for (int r = 0; r < SIZE; r++)
            colsum = colsum + M[r][K];
        return colsum;
    }

    public BMat complement() {
        // Logical NOT of current matrix
        BMat W1 = new BMat(SIZE);
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                if (this.M[r][c] == 0)
                    W1.M[r][c] = 1;
                else
                    W1.M[r][c] = 0;
            }
        }
        return W1;
    }

    public BMat join(BMat M2) {
        // Logical OR of current matrix with matrix M2
        BMat W1 = new BMat(SIZE);
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                W1.M[r][c] = this.M[r][c] | M2.M[r][c];
            }
        }
        return W1;
    }

    public BMat power(int N) {
        // Raise current matrix to Boolean Nth power (N >= 1)
        BMat W1 = new BMat(this.M);
        BMat W2 = new BMat(this.M);
        for (int k = 2; k <= N; k++) {
//            W1 = W1.product(W2);
        }
        return W1;
    }

    public BMat rclosure() {
        // Reflexive closure of current matrix
        BMat W1 = new BMat(this.M);
        // Put 1's on main diagonal
        for (int r = 0; r < SIZE; r++)
            W1.M[r][r] = 1;
        return W1;
    }

    public BMat sclosure() {
        // Symmetric closure of current matrix
        BMat W1 = new BMat(this.M);
//        BMat W2 = W1.transpose();
//        W1 = W1.join(W2);
        return W1;
    }

    // *********************************
    // Project #4 functions to add
    // *********************************

    public int outdegree(int K) {
        // Number of arrows FROM node K of digraph
        // Nodes are numbered 0,1,2,...,SIZE-1
        int rowsum = 0;
        for (int r = 0; r < SIZE; r++)
            rowsum = rowsum + M[K][r];
        return rowsum;

    }

    public BMat meet(BMat M2) {
        // Logical AND of current matrix with matrix M2
        BMat W1 = new BMat(SIZE);
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                W1.M[r][c] = this.M[r][c] & M2.M[r][c];
            }
        }
        return W1;
    }

    public BMat transpose() {
        // Transpose of current matrix
        BMat temp = new BMat(SIZE);

        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                temp.M[r][c] = this.M[c][r];
            }
        }
        return temp;
    }

    public BMat product(BMat M2) {
        BMat result = new BMat(SIZE);


        for (int r = 0; r < SIZE; r++) {

            for (int c = 0; c < SIZE; c++) {
                List<Integer> list = new ArrayList<>();

                for (int n = 0; n < SIZE; n++) {

                    list.add(this.M[r][n] & M2.M[n][c]);

                }
                result.M[r][c] = orMinTerms(list);
            }
        }

        return result;
    }

    public int orMinTerms(List<Integer> list) {

        int result = list.get(0);

        for (int x = list.size(); x > 0; x--) {

            result = result | list.get(x - 1);

        }
        return result;
    }


    public BMat tclosure() {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (this.M[j][i] == 1)
                    for (int k = 0; k < SIZE; k++)
                        if (this.M[j][i] == 1 & this.M[i][k] == 1) {
                            this.M[j][k] = 1;
                        }
            }
        }
        return this;
    }

    public int rootnode() {
        // Root node number (if any) of current matrix
        // Nodes are numbered 0,1,2,...,SIZE-1
        // Put code here...
       List<Integer> nodes= new ArrayList<>();
        for (int c = 0; c < SIZE; c++) {
            nodes.add(indegree(c));
        }
        return findZero(nodes);
    }

    public int findZero(List<Integer> nodes){

        int zeroCounter =0;
        int oneCounter=0;
        int location=0;
        for(int x=0;x<nodes.size();x++){
            if(nodes.get(x)==0){
                location=x;
                zeroCounter++;
            }else if(nodes.get(x)==1){
                oneCounter++;
            }
        }
        if(zeroCounter==1 && oneCounter==(SIZE-1)){
            return location;
        }
        return -1;
    }


} // end class

