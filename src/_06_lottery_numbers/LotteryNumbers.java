package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		Random rand = new Random();
		int nums = rand.nextInt(101);
		int nums2 = rand.nextInt(101);
		int nums3 = rand.nextInt(101);
		int nums4 = rand.nextInt(101);
		int nums5 = rand.nextInt(101);

		JOptionPane.showMessageDialog(null, "Lottery Ticket: " + nums + " " + nums2  + " " + nums3 + " " + nums4 + " " + nums5);
		
		int luckyNum = rand.nextInt(101);
		JOptionPane.showMessageDialog(null, "They lucky number is " +  luckyNum);
		if (luckyNum == nums) {
			JOptionPane.showMessageDialog(null, "You Won");
		} else if (luckyNum == nums2) {
			JOptionPane.showMessageDialog(null, "You Won");
		} else if (luckyNum == nums3) {
			JOptionPane.showMessageDialog(null, "You Won");
		} else if (luckyNum == nums4) {
			JOptionPane.showMessageDialog(null, "You Won");
		} else if (luckyNum == nums5) {
			JOptionPane.showMessageDialog(null, "You Won");
		} else {
			JOptionPane.showMessageDialog(null, "You lost, try again.");
		}
	}
}
