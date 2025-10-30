public class SortShell {
    public SortShell(){
        System.out.println("Estudiante : Diana Borja");
        System.out.println("--Método Shell--");
    }

    public void sort(int[] numeros,boolean ase){
        int n = numeros.length;
        int comparaciones = 1;

        for (int gap = n/2 ; gap >=1 ; gap/= 2){
            comparaciones++;

            // 1I =  gap = 4
            for (int i = gap; i < n ; i++){
                comparaciones++;
                // 1I -> i = 4 < 0 
                int temp = numeros[i];
                //1I -> 1II -> temp = 9 ; j = 4
                int j = i ;
                
                while(j >= gap && numeros[j - gap ] > temp){
                    numeros[j] = numeros[j-gap];
                    j -= gap ;
                }
                numeros[j] = temp;
                comparaciones++;

            }
        }
        System.out.println();
        System.out.println("Comparaciones: " + comparaciones);
    }
}
