package java_0710;

abstract class Unit{
	int hp;
	
}
interface Repairable{
	public void repair();
}
class Marine extends Unit{
	Marine(){ super.hp=50;	}
	
}
class Dropship extends Unit implements Repairable{
	Dropship(){ super.hp=100; }
	@Override
	public void repair() { System.out.println("scv가 수리");}
}
class Tank extends Unit implements Repairable{
	Tank(){ super.hp=150; }
	@Override
	public void repair() { System.out.println("scv가 수리");}
}

public class InterfaceTest3 {

	public static void main(String[] args) {
		
		Marine m = new Marine();
		Dropship d = new Dropship();
		Tank t = new Tank();
		
		m.hp -= 10;		// hp -> 40
		d.hp -= 20;		// hp -> 80
		t.hp -= 50;		// hp -> 100
		// hp가 줄어들어서 수리를 한다.

	}

}
