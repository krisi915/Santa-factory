package observer;

public class Santa {

	public Observable magicboard;
	private String command;
	
	public Santa() {
		this.magicboard = new MagicBoard();
	}
	
	public void writeOnMagicBoard(String command) {
		
		if (command.equals("Трябват ми кукли")) {
			magicboard.setMagicBoard("кукли");
		} else if (command.equals("Трябват ми колелета")) {
			magicboard.setMagicBoard("колелета");	
		}
	}
}
