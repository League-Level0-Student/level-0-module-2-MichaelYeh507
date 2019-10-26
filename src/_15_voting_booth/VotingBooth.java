package _15_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Type in your age if you want to vote.");
		int respond = Integer.parseInt(answer);
		if (respond >= 18) {
			JOptionPane.showMessageDialog(null, "Who do you think the next president should be!");
		}else if (respond < 18){
			JOptionPane.showMessageDialog(null, "Sorry, no one cares about what you think!");
		}
	}
}
