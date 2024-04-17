
package hashmap;
import java.util.HashMap;
public class Firstone {

	public static void main(String[] args) {
		HashMap <Integer,String> words=new HashMap<>();
		words.put(1, "apple");
		words.put(2, "orange");
		words.put(3, "banana");
		words.put(4, "grapes");
		System.out.println(words.get(4));
		System.out.println(words.remove(2));
		System.out.println(words.keySet());
		System.out.println(words.values());
		System.out.println(words.size());
		for(String x:words.values()) {
			char c=x.charAt(0);
			System.out.println(c);
		}
		for(int x:words.keySet()) {
			if(x%2==0) {
				System.out.println(x);
			}
		}
	    words.values().forEach(x->{
	    	if(x.contains("a")||x.contains("e")||x.contains("o")||x.contains("i")||x.contains("u")) {
	    		System.out.println(x);
	    	}
	    	
	    });
		}
	}


