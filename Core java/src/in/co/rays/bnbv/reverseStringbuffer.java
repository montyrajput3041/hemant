package in.co.rays.bnbv;

public class reverseStringbuffer {
	public static void main(String[] args) {
		StringBuffer gh = new StringBuffer();
				gh.append("hemendramewada");
				
				System.out.println("Reverse:"+gh.reverse());
				System.out.println("Capacity:"+gh.capacity());
				System.out.println("Length:"+gh.length());
				System.out.println("Char at:"+gh.charAt(5));
				System.out.println("Replace:"+gh.replace(0,5,"nty"));
				System.out.println("Index Of:"+gh.indexOf("e"));
	}

}
