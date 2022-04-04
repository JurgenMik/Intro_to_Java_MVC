public class CalculatorModel {
    // Model: Use data and methods to interact with the model

    private int calculationValue;

    public void addTwoNumbers(int firstNumber, int secondNumber){

         calculationValue = firstNumber + secondNumber;

    }

    public int getCalculationValue(){

        return calculationValue;
    }

 }
