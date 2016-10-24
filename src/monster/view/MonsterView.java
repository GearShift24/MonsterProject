package monster.view;

import javax.swing.JOptionPane;

public class MonsterView
{

	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null,message);
		
	}
	
	public String collectResponse(String question)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, question);
		
		return answer;
	}
}
