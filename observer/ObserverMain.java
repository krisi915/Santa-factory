package observer;

public class ObserverMain {

	public static void main(String[] args) {
		
		
		Santa santa = new Santa();
		Observer Bushy = new Elf("����");
		Observer Alabaster = new Elf("���������");
		
		santa.magicboard.addElf(Alabaster);
		santa.magicboard.addElf(Bushy);
	
		
		santa.writeOnMagicBoard("������� �� �����");
		santa.writeOnMagicBoard("������� �� ��������");

	}

}
