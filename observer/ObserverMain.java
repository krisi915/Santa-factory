package observer;

public class ObserverMain {

	public static void main(String[] args) {
		
		
		Santa santa = new Santa();
		Observer Bushy = new Elf("Буши");
		Observer Alabaster = new Elf("Алабастър");
		
		santa.magicboard.addElf(Alabaster);
		santa.magicboard.addElf(Bushy);
	
		
		santa.writeOnMagicBoard("Трябват ми кукли");
		santa.writeOnMagicBoard("Трябват ми колелета");

	}

}
