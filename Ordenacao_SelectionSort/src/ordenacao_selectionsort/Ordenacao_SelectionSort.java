package ordenacao_selectionsort;

import javax.swing.JOptionPane;

public class Ordenacao_SelectionSort {
 
    public static void main(String[] args) {
        int v[] = {10,9,8,7,6,5,4,3,2,1}; 
        int n = v.length;
        String msg = "";
        SelectionSort(v,n);
        
        for(int i = 0; i<n; i++){
            msg += v[i] + " ";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
    public static void SelectionSort(int v[], int n){
        for (int i = 0; i<= n-2; i++){
            int min = i;
            for(int j = i+1; j<= n-1; j++){
                if(v[j] < v[min]){
                    min = j;
                }
            }
            int aux = v[i];
            v[i] = v[min];
            v[min] = aux;
        }
    }
}
