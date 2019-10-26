package _14_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Type in your height in inches");
		int respond = Integer.parseInt(answer);
		if (respond >= 48) {
			JOptionPane.showMessageDialog(null, "You can go on the roller coaster!");
		}else if (respond < 48){
			JOptionPane.showMessageDialog(null, "Sorry, you need to grow taller first!");
		}
	}
}
