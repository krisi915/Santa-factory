package observer;

public class Elf implements Observer {
	
	private String toy;
	private Observable magicBoard;
	
	public Elf(String toy) {
		this.toy = toy;
	}

	@Override
	public void update() {
		if (this.magicBoard == null) {
			System.out.println("No toy set");
			return;
		}
			
		String lastMagicBoard = this.magicBoard.getUpdate();
		System.out.println(toy + " " + "направи" + " " + lastMagicBoard);

	}

	@Override
	public void setMagicBoard(Observable magicboard) {
		this.magicBoard = magicboard;

	}

}
