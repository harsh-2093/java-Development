package string;

public class basics {
	public static void main(String[] args) {
		String name=new String("harsh tripathi");
//		System.out.println("hello "+name);
////		System.out.println(name.hashCode());
//		System.out.println(name.charAt(0));
//		name=name.concat("raja ji");
//		System.out.println(name);
//		
		//mutable string
		
		//1.string buffer
		//2.string builder
		
		//1.string buffer
		StringBuffer sb =new StringBuffer("navin");
//		System.out.println(sb.capacity());
//		System.out.println(sb.length());
		sb.append(" tripathi");
		System.out.println(sb);
		String str=sb.toString();
		System.out.println(str);
		sb.deleteCharAt(3);
		System.out.println(sb);
		sb.insert(0, "java");
		System.out.println(sb);
		System.out.println(sb.substring(5,8));
		
		
		//the diffrence b/w string buffer thread safe and string builder is not thread safe
		
	}
}
