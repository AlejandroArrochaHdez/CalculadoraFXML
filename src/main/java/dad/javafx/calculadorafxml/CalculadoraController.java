package dad.javafx.calculadorafxml;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.calculadora.Calculadora;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CalculadoraController implements Initializable {
	// Model
	
	private Calculadora model = new Calculadora();
	
	// View
	
	@FXML
	private GridPane view;
	
	@FXML
	private TextField numeroText;
	
	@FXML
	private Button button0;
	
	@FXML
	private Button button1;
	
	@FXML
	private Button button2;
	
	@FXML
	private Button button3;
	
	@FXML
	private Button button4;
	
	@FXML
	private Button button5;
	
	@FXML
	private Button button6;
	
	@FXML
	private Button button7;
	
	@FXML
	private Button button8;
	
	@FXML
	private Button button9;
	
	@FXML
	private Button buttonC;
	
	@FXML
	private Button buttonCE;
	
	@FXML
	private Button buttonMultiplicacion;
	
	@FXML
	private Button buttonDividir;
	
	@FXML
	private Button buttonResta;
	
	@FXML
	private Button buttonSuma;
	
	@FXML
	private Button buttonPunto;
	
	@FXML
	private Button buttonIgual;
	
	public CalculadoraController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraView.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	public GridPane getView() {
		return view;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
//		numeroText.textProperty().bind(model.pantallaProperty());
		model.pantallaProperty().bindBidirectional(numeroText.textProperty());

	}
	
	@FXML
	private void onSieteAction (ActionEvent e) {
		model.insertar('7');
	}
	
	@FXML
	private void onOchoAction (ActionEvent e) {
		model.insertar('8');
	}
	
	@FXML
	private void onNueveAction (ActionEvent e) {
		model.insertar('9');
	}
	
	@FXML
	private void onUnoAction (ActionEvent e) {
		model.insertar('1');
	}
	
	@FXML
	private void onDosAction (ActionEvent e) {
		model.insertar('2');
	}
	
	@FXML
	private void onTresAction (ActionEvent e) {
		model.insertar('3');
	}
	
	@FXML
	private void onCuatroAction (ActionEvent e) {
		model.insertar('4');
	}
	
	@FXML
	private void onCincoAction (ActionEvent e) {
		model.insertar('5');
	}
	
	@FXML
	private void onSeisAction (ActionEvent e) {
		model.insertar('6');
	}
	
	@FXML
	private void onCeroAction (ActionEvent e) {
		model.insertar('0');
	}
	
	@FXML
	private void onCEAction (ActionEvent e) {
		model.borrarTodo();
	}
	
	@FXML
	private void onCAction (ActionEvent e) {
		model.borrar();
	}
	
	@FXML
	private void onSumaAction (ActionEvent e) {
		model.operar(Calculadora.SUMAR);
	}
	
	@FXML
	private void onRestarAction (ActionEvent e) {
		model.operar(Calculadora.RESTAR);
	}
	
	@FXML
	private void onDividirAction (ActionEvent e) {
		model.operar(Calculadora.DIVIDIR);
	}
	
	@FXML
	private void onMultiplicacionAction (ActionEvent e) {
		model.operar(Calculadora.MULTIPLICAR);
	}
	
	@FXML
	private void onIgualAction (ActionEvent e) {
		model.operar(Calculadora.IGUAL);
	}
	
	@FXML
	private void onPuntoAction (ActionEvent e) {
		model.insertarComa();
	}
}
