import java.util.HashMap;
import java.util.HashSet;

public class WordGroup {
	String words;
	
	public WordGroup(String getwords) {
		this.words=getwords.toLowerCase();
	}
	
	public String[] getWordArray() {
		return this.words.split(" ");
	}
	
	public HashSet<String> getWordSet(WordGroup wordGroup) {
		 HashSet<String> set = new HashSet<String>();
		 String[] p = getWordArray();
		 String[] p1 = wordGroup.getWordArray();
		 for(String item:p) {
			 set.add(item);
		 }
		 for(String item:p1) {
			 set.add(item);
		 }
		 return set;
	}
	
	public HashMap<String, Integer> getWordCount(){
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(String word:getWordArray()) {
			if(map.containsKey(word)) {
				int current=map.get(word);
				map.put(word, current + 1);
			}
			else {
				map.put(word, 1);
			}
		}
		return map;
	}
}
