// MERGE-SORT(L: List with n elements) : Ordered list with n elements
// IF (list L has one element)
//     RETURN L.
// Divide the list into two halves A and B.
// A ← MERGE-SORT(A).
// B ← MERGE-SORT(B).
// L ← MERGE(A, B).
// RETURN L. 
package br.pucrs;
import java.util.Random;
public class App 
{
    static long maxVal2(long A[], int init, int end) { 
        int cont = 0; 
        if (end - init <= 1)
            return Math.max(A[init], A[end]);  
        else {
                int m = (init + end)/2;
                long v1 = maxVal2(A,init,m);   
                long v2 = maxVal2(A,m+1,end);  
                Math.max(v1,v2);
                return cont++;
            }
    }
    
    // List  mergeSort(List l){
    //     if(l.size() == 1){
    //         return l;
    //     }

    //     if(l.size() == 2){ //Ordenar lista com dois elementos
    //         if(l.get(0) > l.get(1)) {
    //             int temp = l.get(0);
    //             l.set(0, l.get(1));
    //             l.set(1, temp);
    //         }
    //         return l;
    //     }
    //     //Para listas com mais de 2 elementos
    //     ArrayList<Integer> A = new ArrayList<>(l.subList(0, l.size()/2));
    //     ArrayList<Integer> B = new ArrayList<>(l.subList(l.size()/2, l.size()));
    //     //List final = new ArrayList<>();        
    //     //return final.addFinal(mergeSort());
    //         return;
    //  }

    
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        Random rand = new Random();
        int op = maxVal2(rand.nextInt(32), 0, 31);
    }
}
