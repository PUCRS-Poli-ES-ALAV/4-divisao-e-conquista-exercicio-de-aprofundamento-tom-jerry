// 3. O algoritmo a seguir (que utiliza divisão-e-conquista) encontra o maior valor em um vetor.

//     Assim, novamente:
   
//     * implemente o algortimo abaixo;
//     * teste-o para vetores de inteiros com conteúdos randômicos, e tamanho 32, 2048 e 1.048.576. Nestes testes, contabilize o número de iterações que o algoritmo executa, e o tempo gasto;
    
//    ```java
//    long maxVal2(long A[], int init, int end) {  
//        if (end - init <= 1)
//            return max(A[init], A[end]);  
//        else {
//              int m = (init + end)/2;
//              long v1 = maxVal2(A,init,m);   
//              long v2 = maxVal2(A,m+1,end);  
//              return max(v1,v2);
//             }
//    }


public class Ex3 {
    
    
    public static void main(String[] args) {
       
    }
}
