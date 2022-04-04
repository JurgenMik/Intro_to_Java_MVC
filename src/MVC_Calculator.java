public class MVC_Calculator {
    // MVC separates the functionality of the "system" into classes
    // creating new obj to call upon the defined methods

    public static void main (String[] args){

        // instantiating all model , view , controller classes -> passing the methods

        CalculatorView view = new CalculatorView();
        CalculatorModel model =  new CalculatorModel();
        CalculatorController controller = new CalculatorController(view, model);

        view.setVisible(true);

    }



}
