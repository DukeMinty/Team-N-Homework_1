package hw1;

public class Homework_1 {
	public static void main(String[] args) {
		String[] teamMemberNames = {"Christian Kiner", "Jacob York", "Aaron Trebus", "Grant Spinks"};
		String[] githubUsernames = {"Frostee21", "Jyorkio", "DukeMinty", "GSpinks"};
		int[] githubUserIDs = {52237485, 36712378, 142760470, 111899656};
		for (int i=0; i < teamMemberNames.length; i++) {
			System.out.println("Name: " + teamMemberNames[i] + " | Github Username: " + githubUsernames[i] + " | UserID: " + githubUserIDs[i]);
		}
	}
}
