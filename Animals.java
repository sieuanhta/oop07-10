import java.util.ArrayList;
public class Animals {

	String name;
	int year_old;
	int dibo = 0;
	int boi = 1;
	ArrayList<Integer> move;
	void printDibo() {
		boolean co = false;
		for (int i = 0; i < move.size(); i++) {
			if (move.get(i) == dibo) co = true;
		}
		if (co == true) System.out.println(this.name + "co the di bo");
	}
	
	void printBoi() {
		boolean co = false;
		for (int i = 0; i < move.size(); i++) {
			if (move.get(i) == boi) co = true;
		}
		if (co == true) System.out.println(this.name + "co the boi");
	}
	
	void printBoiHoacDiBo() {
		int co = 0;
		for (int i = 0; i < move.size(); i++) {
			if (move.get(i) == boi || move.get(i) == dibo ) co++;
		}
		if (co == 2) System.out.println(this.name + "ca di bo ca boi");
	}
}
