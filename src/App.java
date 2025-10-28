public class App {
    public static void main(String[] args) throws Exception {
        int [ ] numeros ={ 5, 0, -1, 4, 9, 6, -5 , 2 ,3}; 
        SortShell sortShell = new SortShell();
        View view = new View();
    
        System.out.println("Original_: ");
        view.printArray(numeros);
        sortShell.sort(numeros, false);
        System.out.println();
        System.out.println("Ordenado: ");
        view.printArray(numeros);

    }
}
