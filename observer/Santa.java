package observer;

public class Santa {

	public Observable magicboard;
	private String command;
	
	public Santa() {
		this.magicboard = new MagicBoard();
	}
	
	public void writeOnMagicBoard(String command) {
		
		if (command.equals("������� �� �����")) {
			magicboard.setMagicBoard("�����");
		} else if (command.equals("������� �� ��������")) {
			magicboard.setMagicBoard("��������");	
		}
	}
}
