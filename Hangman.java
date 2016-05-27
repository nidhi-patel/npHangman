//===================================================
// Name              : Nidhi Patel
// SID               : 31379144
// Course            : IT114
// Section           : 452
// Instructor 	      : Maura Deek
// Assignment #      : Programming Assignment 3
// Date        	   :  03/25/2016
// Description       : This program is a Hangman game
//===================================================

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.Random;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.control.TextArea;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.text.Font;
import java.lang.*;

public class Hangman extends Application  {

	public static void main(String[]args){
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception{

			primaryStage.setTitle("Hangman");
			primaryStage.setResizable(true);
			GridPane layout = new GridPane();
			layout.setPadding(new Insets(10));
			layout.setHgap(5);
			layout.setVgap(5);

			layout.getColumnConstraints().add(new ColumnConstraints(50));
			layout.getColumnConstraints().add(new ColumnConstraints(50));
			layout.getColumnConstraints().add(new ColumnConstraints(50));
			layout.getColumnConstraints().add(new ColumnConstraints(50));
			layout.getColumnConstraints().add(new ColumnConstraints(50));
			layout.getColumnConstraints().add(new ColumnConstraints(50));
			layout.getColumnConstraints().add(new ColumnConstraints(50));
			layout.getColumnConstraints().add(new ColumnConstraints(50));
			layout.getColumnConstraints().add(new ColumnConstraints(50));
			layout.getColumnConstraints().add(new ColumnConstraints(50));

			TextArea txtArea = new TextArea();
			txtArea.setPrefColumnCount(50);
			txtArea.setWrapText(true);
			txtArea.setEditable(false);
			txtArea.setFont(Font.font("Courier", 14));
			layout.add(txtArea,0,0,6,5);

			TextArea txtArea2 = new TextArea();
			txtArea2.setPrefColumnCount(50);
			txtArea2.setEditable(false);
			txtArea2.setPadding(new Insets(70,10,70,10));
			txtArea2.setFont(Font.font("Courier", 15));
			layout.add(txtArea2,6,0,4,5);

			Button btnA = new Button("A");
			Button btnB = new Button("B");
			Button btnC = new Button("C");
			Button btnD = new Button("D");
			Button btnE = new Button("E");
			Button btnF = new Button("F");
			Button btnG = new Button("G");
			Button btnH = new Button("H");
			Button btnI = new Button("I");
			Button btnJ = new Button("J");
			Button btnK = new Button("K");
			Button btnL = new Button("L");
			Button btnM = new Button("M");
			Button btnN = new Button("N");
			Button btnO = new Button("O");
			Button btnP = new Button("P");
			Button btnQ = new Button("Q");
			Button btnR = new Button("R");
			Button btnS = new Button("S");
			Button btnT = new Button("T");
			Button btnU = new Button("U");
			Button btnV = new Button("V");
			Button btnW = new Button("W");
			Button btnX = new Button("X");
			Button btnY = new Button("Y");
			Button btnZ = new Button("Z");
			Button btnNewGame = new Button("NewGame");

			btnA.setMaxWidth(Double.MAX_VALUE);
			btnA.setDisable(true);
			btnB.setMaxWidth(Double.MAX_VALUE);
			btnB.setDisable(true);
			btnC.setMaxWidth(Double.MAX_VALUE);
			btnC.setDisable(true);
			btnD.setMaxWidth(Double.MAX_VALUE);
			btnD.setDisable(true);
			btnE.setMaxWidth(Double.MAX_VALUE);
			btnE.setDisable(true);
			btnF.setMaxWidth(Double.MAX_VALUE);
			btnF.setDisable(true);
			btnG.setMaxWidth(Double.MAX_VALUE);
			btnG.setDisable(true);
			btnH.setMaxWidth(Double.MAX_VALUE);
			btnH.setDisable(true);
			btnI.setMaxWidth(Double.MAX_VALUE);
			btnI.setDisable(true);
			btnJ.setMaxWidth(Double.MAX_VALUE);
			btnJ.setDisable(true);
			btnK.setMaxWidth(Double.MAX_VALUE);
			btnK.setDisable(true);
			btnL.setMaxWidth(Double.MAX_VALUE);
			btnL.setDisable(true);
			btnM.setMaxWidth(Double.MAX_VALUE);
			btnM.setDisable(true);
			btnN.setMaxWidth(Double.MAX_VALUE);
			btnN.setDisable(true);
			btnO.setMaxWidth(Double.MAX_VALUE);
			btnO.setDisable(true);
			btnP.setMaxWidth(Double.MAX_VALUE);
			btnP.setDisable(true);
			btnQ.setMaxWidth(Double.MAX_VALUE);
			btnQ.setDisable(true);
			btnR.setMaxWidth(Double.MAX_VALUE);
			btnR.setDisable(true);
			btnS.setMaxWidth(Double.MAX_VALUE);
			btnS.setDisable(true);
			btnT.setMaxWidth(Double.MAX_VALUE);
			btnT.setDisable(true);
			btnU.setMaxWidth(Double.MAX_VALUE);
			btnU.setDisable(true);
			btnV.setMaxWidth(Double.MAX_VALUE);
			btnV.setDisable(true);
			btnW.setMaxWidth(Double.MAX_VALUE);
			btnW.setDisable(true);
			btnX.setMaxWidth(Double.MAX_VALUE);
			btnX.setDisable(true);
			btnY.setMaxWidth(Double.MAX_VALUE);
			btnY.setDisable(true);
			btnZ.setMaxWidth(Double.MAX_VALUE);
			btnZ.setDisable(true);

			layout.add(btnA,0,7);
			layout.add(btnB,4,8);
			layout.add(btnC,2,8);
			layout.add(btnD,2,7);
			layout.add(btnE,2,6);
			layout.add(btnF,3,7);
			layout.add(btnG,4,7);
			layout.add(btnH,5,7);
			layout.add(btnI,7,6);
			layout.add(btnJ,6,7);
			layout.add(btnK,7,7);
			layout.add(btnL,8,7);
			layout.add(btnM,6,8);
			layout.add(btnN,5,8);
			layout.add(btnO,8,6);
			layout.add(btnP,9,6);
			layout.add(btnQ,0,6);
			layout.add(btnR,3,6);
			layout.add(btnS,1,7);
			layout.add(btnT,4,6);
			layout.add(btnU,6,6);
			layout.add(btnV,3,8);
			layout.add(btnW,1,6);
			layout.add(btnX,1,8);
			layout.add(btnY,5,6);
			layout.add(btnZ,0,8);
			layout.add(btnNewGame,7,8,2,1);

			Game newGame = new Game();

			btnNewGame.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent event){
					btnNewGame.setDisable(false);
					btnA.setDisable(false);
					btnB.setDisable(false);
					btnC.setDisable(false);
					btnD.setDisable(false);
					btnE.setDisable(false);
					btnF.setDisable(false);
					btnG.setDisable(false);
					btnH.setDisable(false);
					btnI.setDisable(false);
					btnJ.setDisable(false);
					btnK.setDisable(false);
					btnL.setDisable(false);
					btnM.setDisable(false);
					btnN.setDisable(false);
					btnO.setDisable(false);
					btnP.setDisable(false);
					btnQ.setDisable(false);
					btnR.setDisable(false);
					btnS.setDisable(false);
					btnT.setDisable(false);
					btnU.setDisable(false);
					btnV.setDisable(false);
					btnW.setDisable(false);
					btnX.setDisable(false);
					btnY.setDisable(false);
					btnZ.setDisable(false);

					newGame.newGame();
					txtArea2.setText(newGame.getAsterisk());
					txtArea.setText(newGame.displayHangman());
			}
		});

		btnA.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnA.setDisable(true);
				txtArea2.setText(newGame.displayChar("A",'A'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnB.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnB.setDisable(true);
				txtArea2.setText(newGame.displayChar("B",'B'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnC.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnC.setDisable(true);
				txtArea2.setText(newGame.displayChar("C",'C'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnD.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnD.setDisable(true);
				txtArea2.setText(newGame.displayChar("D",'D'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnE.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnE.setDisable(true);
				txtArea2.setText(newGame.displayChar("E",'E'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnF.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnF.setDisable(true);
				txtArea2.setText(newGame.displayChar("F",'F'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnG.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnG.setDisable(true);
				txtArea2.setText(newGame.displayChar("G",'G'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnH.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnH.setDisable(true);
				txtArea2.setText(newGame.displayChar("H",'H'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnI.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnI.setDisable(true);
				txtArea2.setText(newGame.displayChar("I",'I'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnJ.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnJ.setDisable(true);
				txtArea2.setText(newGame.displayChar("J",'J'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnK.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnK.setDisable(true);
				txtArea2.setText(newGame.displayChar("K",'K'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnL.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnL.setDisable(true);
				txtArea2.setText(newGame.displayChar("L",'L'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnM.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnM.setDisable(true);
				txtArea2.setText(newGame.displayChar("M",'M'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnN.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnN.setDisable(true);
				txtArea2.setText(newGame.displayChar("N",'N'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnO.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnO.setDisable(true);
				txtArea2.setText(newGame.displayChar("O",'O'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnP.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnP.setDisable(true);
				txtArea2.setText(newGame.displayChar("P",'P'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnQ.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnQ.setDisable(true);
				txtArea2.setText(newGame.displayChar("Q",'Q'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnR.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnR.setDisable(true);
				txtArea2.setText(newGame.displayChar("R",'R'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnS.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnS.setDisable(true);
				txtArea2.setText(newGame.displayChar("S",'S'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnT.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnT.setDisable(true);
				txtArea2.setText(newGame.displayChar("T",'T'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnU.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnU.setDisable(true);
				txtArea2.setText(newGame.displayChar("U",'U'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnV.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnV.setDisable(true);
				txtArea2.setText(newGame.displayChar("V",'V'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnW.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnW.setDisable(true);
				txtArea2.setText(newGame.displayChar("W",'W'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnX.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnX.setDisable(true);
				txtArea2.setText(newGame.displayChar("X",'X'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnY.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnY.setDisable(true);
				txtArea2.setText(newGame.displayChar("Y",'Y'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		btnZ.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				txtArea2.setText("");
				btnZ.setDisable(true);
				txtArea2.setText(newGame.displayChar("Z",'Z'));
				txtArea.setText(newGame.displayHangman());
			}
		});

		Scene scene = new Scene(layout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
