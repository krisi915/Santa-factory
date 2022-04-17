package observer;

public interface Observable {
	public void addElf(Observer elf);
	public void removeElf(Observer elf);
	
	public void notifyObservers();
	public void setMagicBoard(String string);
	 String getUpdate();
}
