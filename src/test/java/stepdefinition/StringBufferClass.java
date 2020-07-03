package stepdefinition;

public class StringBufferClass {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer();
		
		String str="abc";
		str.concat("xyz");
		System.out.println("str= "+str);
		
		s.append(str);
		System.out.println(s);
		
		s.insert(2, "something");
		System.out.println(s);
		
		System.out.println(s.charAt(5));
		
		System.out.println(s.codePointAt(2));
		
		System.out.println(s.codePointBefore(2));
		
		System.out.println(s.codePointCount(2, 5));
		
		System.out.println(s.delete(2, 5));
		
		System.out.println(s.deleteCharAt(2));
		
		s.ensureCapacity(16);
		
		char[] c = new char[5];
		
		s.getChars(2, 7, c, 0);
		
		for (char d : c) {
			System.out.println(d);	
		}
		
		System.out.println(s.indexOf("a"));
		
		System.out.println(s.indexOf("t", 1));
		
		s.insert(2, c, 0, 3);
		System.out.println(s);
		
		System.out.println(s.lastIndexOf("t"));
		System.out.println(s.indexOf("t", 1));
		
		System.out.println(s.replace(2, 8, "some"));
		
		System.out.println(s.reverse());
		
		int i = s.capacity();
		System.out.println(i);
		
		
		
		
		
		
	}

}
