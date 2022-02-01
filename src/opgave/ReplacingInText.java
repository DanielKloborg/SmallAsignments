package opgave;

public class ReplacingInText {
	
	public static void main(String[] args) {
		
		StringBuilder text = new StringBuilder("It was a dark and stormfull night");
		int fill = 50;
		int space = 0;
		
		for (int spaceCounter = 0; spaceCounter < text.length(); spaceCounter++) {
			char currentChar = text.charAt(spaceCounter);
			if (currentChar == ' ') {
				space++;
			}
		}
		
		int fillAfter = fill - text.length();
		int fillPerSpace = fillAfter/space;
		
		for (int fillNumber = 0; fillNumber < text.length(); fillNumber++) {
			char currentCharTwo = text.charAt(fillNumber);
			if (currentCharTwo == ' ') {
				for (int moreSpace = 0; moreSpace < fillPerSpace; moreSpace++) {
					text.insert(fillNumber,' ');
				}
			}
		}
		System.out.println(text);
	}
}
