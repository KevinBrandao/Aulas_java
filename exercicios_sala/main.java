package aulatp;

public static void main(String...strings) {
		
    Integer arrayA[] = new Integer[20];
    Integer arrayB[] = new Integer[20];
    
    preencherArray(arrayA);
    preencherArray(arrayB);
    
    somarArrays(arrayA, arrayB);
    
}

public static void somarArrays(Integer a[], Integer b[]) {

    System.out.println("------------------------");
    System.out.println("A    +   B   =  SOMA");
    System.out.println("------------------------");
    
    for(int i = 0; i < a.length; i++) {
        Integer soma = a[i] + b[i];
        System.out.printf("\n%d  +  %d  =  %d", a[i], b[i], soma);
    }

}

public static void preencherArray(Integer[] array) {
    
    for(int i = 0; i < array.length; i++) {
        
        array[i] = (int) (Math.random() * 100);
    }		
}