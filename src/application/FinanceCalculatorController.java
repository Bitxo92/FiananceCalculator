package application;import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;

public class FinanceCalculatorController {

    @FXML
    private TextField taeInput;
    
    @FXML
    private TextField tinInput;
    
    @FXML
    private TextField priceInput;
    
    @FXML
    private Label finalPriceOutput;
    
    @FXML
    private Label interestOutput;
    
    @FXML
    private Button calculateButton;

    @FXML
    private void initialize() {
        // Añadir tooltips directamente a los TextFields
        Tooltip taeTooltip = new Tooltip("TAE (Tasa Anual Equivalente): es una referencia orientativa del coste o rendimiento efectivo anual de un producto financiero.");
        taeInput.setTooltip(taeTooltip);

        Tooltip tinTooltip = new Tooltip("TIN (Tipo de Interés Nominal): es el interés que se pacta como pago por el dinero prestado, sin tener en cuenta gastos ni comisiones.");
        tinInput.setTooltip(tinTooltip);

        calculateButton.setOnAction(event -> calculate());
    }

    private void calculate() {
        try {
            double tae = Double.parseDouble(taeInput.getText());
            double tin = Double.parseDouble(tinInput.getText());
            double price = Double.parseDouble(priceInput.getText());

            // Calcula los intereses y el precio final
            double interest = price * (tin / 100);
            double finalPrice = price + interest;

            // Muestra los resultados
            finalPriceOutput.setText(String.format("%.2f", finalPrice));
            interestOutput.setText(String.format("%.2f", interest));
        } catch (NumberFormatException ex) {
            finalPriceOutput.setText("Entrada no válida");
            interestOutput.setText("Entrada no válida");
        }
    }
}
