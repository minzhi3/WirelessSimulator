package view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame implements Observer{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4565490296424124055L;
	private JLabel stateText;
	public MainFrame(){
		super();
		this.setSize(800,600);
		this.getContentPane().setLayout(null);
		this.stateText=new JLabel("Ready");
		stateText.setBounds(100, 100, 200, 200);
		this.add(this.stateText);
		this.setTitle("Wireless Simulator");
	}
	public void setState(String s){
		this.stateText.setText(s);
	}

	@Override
	public void update(Observable o, Object arg) {
		DisplayData displayData=(DisplayData) o;
		this.setState(""+displayData.num);
	}

}
