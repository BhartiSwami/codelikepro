package javalove;

public class gharBuilding {

	public static void main(String[] args) {
		ghar g1=new ghar();
		ghar g2=new ghar();
		g1.size=10;
		g1.color="red";
		g1.prize=100;
		g2.size=20;
		g1.color="green";
		g1.prize=1000;
		gharBadlo(g1,g2);
		System.out.println(g1.size);
		System.out.println(g1.color);
		System.out.println(g1.prize);
		System.out.println(g2.size);
		System.out.println(g2.color);
		System.out.println(g2.prize);
	}
public static void gharBadlo(ghar g1,ghar g2) {
	g1.size=0;
	g1.color=null;
	g1.prize=0;
	g2.size=1000;
	g2.color="blue";
	g2.prize=1000000;
}
}
