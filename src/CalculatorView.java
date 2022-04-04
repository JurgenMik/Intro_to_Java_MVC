import java.awt.event.ActionListener;
// catch and perform action events

import javax.swing.*;
// swing components for creating an interface


public class CalculatorView  extends JFrame {

    // defining the "calculator" interface
    // Handle everything on View
    // JFrame

    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcResult = new JTextField(10);

    CalculatorView() {

        // creating the calculator interface

        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcResult);

        this.add(calcPanel);

    }

    public int getFirstNumber(){

        // get entered data from field

        return Integer.parseInt(firstNumber.getText());

    }
    public int getSecondNumber(){

        // get entered data from field

        return Integer.parseInt(secondNumber.getText());

    }

    public int getCalcResult(){

        // get entered data from field
        return Integer.parseInt(calcResult.getText());
    }

    public void setCalcResult(int solution){
        calcResult.setText(Integer.toString(solution));
    }

    // e.{action: click} listener on the button

    void addCalculationListener(ActionListener CalButton ){
        calculateButton.addActionListener(CalButton);
    }

    // validation feedback
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}