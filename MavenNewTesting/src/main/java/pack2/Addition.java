package pack2;

public class Addition extends Operation {
	
	static int j;
	static void xyz(int i) {
		
		boolean b;
		
		do {
			
			b=i--<10||methodabc(4);
			b=i<10&&methodabc(8);
			
		} while (!b);
		
	}
	
	private static boolean methodabc(int i) {
		// TODO Auto-generated method stub
		j+=i;
		return true;
	}

	public static void main(String[] args) {
		xyz(11);
		System.out.println(j);
		
	}

}
