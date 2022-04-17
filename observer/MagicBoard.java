package observer;

import java.util.ArrayList;
import java.util.List;

public class MagicBoard implements Observable {
	
	private List<Observer> elfs;
	private String magicBoard;

	public MagicBoard() {
		this.elfs = new ArrayList<>();
	}
	
	@Override
	public void addElf(Observer elf) {
		this.elfs.add(elf);
		elf.setMagicBoard(this);
}

	@Override
	public void removeElf(Observer elf) {
		this.elfs.remove(elf);
		elf.setMagicBoard(null);
	}

	@Override
	public void notifyObservers() {
		for(Observer elf: this.elfs) {
			elf.update();
		}

	}

	@Override
	public String getUpdate() {
		
		return this.magicBoard;
	}


	public void setMagicBoard(String magicBoard) {
		this.magicBoard = magicBoard;
		this.notifyObservers();
	}

}
