package elizaReplica;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PsychoTherapy extends JApplet implements ActionListener{
	
	JLabel quesLabel;
	JLabel requeLabel;
	JTextField sentence1;
	JButton entBtn;
	JButton requestBtn;
	
public void init(){
	JPanel suazo = new JPanel();
	suazo.setLayout(new GridLayout(5,1));
	
	sentence1 = new JTextField("");
	entBtn = new JButton("ENTER");
	entBtn.addActionListener(this);
	requestBtn = new JButton("REQUEST");
	requestBtn.addActionListener(this);
		
	quesLabel = new JLabel("Tell me what's on your mind.");
	requeLabel = new JLabel("To show words used, click on the REQUEST button");
	suazo.add(sentence1);
	suazo.add(entBtn);
	suazo.add(requestBtn);
	suazo.add(quesLabel);
	suazo.add(requeLabel);
	add(suazo);
		
}
	

@Override
public void actionPerformed(ActionEvent ks) {
	// TODO Auto-generated method stub
	
	String userInput = sentence1.getText();
	String [] comboStrg = userInput.split(" ");
	
	int maxSize = 0;
	String longestWord = "";
	for(int i = 0; i < comboStrg.length; i++){
		if(comboStrg[i].length() > maxSize){
			longestWord = comboStrg[i];
			maxSize = comboStrg[i].length();}
	}
	
	if(ks.getActionCommand().equalsIgnoreCase("ENTER")){
		quesLabel.setText(IfConditions.strgCon(longestWord));
	}
	
	if(ks.getActionCommand().equalsIgnoreCase("REQUEST")){
		String longestWords = "";
		longestWords = longestWords + longestWord;
		requeLabel.setText(longestWords);
	}
}
}