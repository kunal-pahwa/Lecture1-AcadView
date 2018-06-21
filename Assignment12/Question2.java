package Assignment12;

import java.util.HashMap;
public class Question2 {
	public static void main(String args) {
		HashMap<String , Integer> map=new HashMap<String,Integer>();
		map.put("kunal", 134);
		map.put("abc", 4131);
		map.put("sabjdas", 546);
		map.put("asre", 54453);
		map.put("qwewe", 14884);
		for(HashMap.Entry i:map.entrySet()){
			System.out.println(i.getKey()+" "+i.getValue());
		}
	}
}
