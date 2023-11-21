 class keza2 {
    public static void main(String[] args) {
        MyCalculator myCalc = new MyCalculator();
        myCalc.calculate();            
        myCalc.scientificFunctions();  
    }
}
interface Calculator {
    void calculate();
}


interface ScientificCalculator {
    void scientificFunctions();
}


class MyCalculator implements Calculator, ScientificCalculator {
    public void calculate() {
        System.out.println("Basic calculations performed.");
    }

    public void scientificFunctions() {
        System.out.println("Performing scientific calculations.");
    }
}









