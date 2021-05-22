package Sorting;

public class QuizQuestion {
    public static void main(String[] args) {


        int i, k, j;
        int r = 5;
        int[] a = new int[10];
        for (i = 0; i < r; i++){
            for (k = r; k > i; k--){
                System.out.print("-");
            }
            a[i] = 1;
            for (j = 0; j <= i; j++){
                System.out.print(a[i] + "-");
                a[i] = a[i] * (i - j) / (j + 1);
            }
            for(int l=i;l<r-1;l++){
                System.out.print("-");
            }
            System.out.println();   
        }

    }
}

