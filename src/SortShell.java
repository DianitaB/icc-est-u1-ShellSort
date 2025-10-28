public class SortShell {
    public SortShell(){
        System.out.println("Estudiante : Diana Borja");
        System.out.println("--Método Shell--");
    }
    
    public void sort(int[] numeros,boolean ase){
        int n = numeros.length;

        for (int gap = n/2 ; gap > 0 ; gap/= 2){
            int cambios = 0;
            // 1I =  gap = 4
            for (int i = gap; i < n ; i++){
                // 1I -> i = 4 < 0 
                int temp = numeros[i];
                //1I -> 1II -> temp = 9 ; j = 4
                int j = i ;
                while(j >= gap && numeros[j - gap ] > temp){
                    numeros[j] = numeros[j-gap];
                    j -= gap ;
                    cambios++;
                }
                numeros[j] = temp;
            }

        }
    }
}
