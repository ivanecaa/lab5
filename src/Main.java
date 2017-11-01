import java.util.HashMap;
import java.util.HashSet;

public class Main {
		public static void main(String args[]) {
			WordGroup WordGroup1=new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
			WordGroup WordGroup2=new WordGroup("When you play play hard when you work dont play at all");

			String[] quote1=WordGroup1.getWordArray();
			String[] quote2=WordGroup2.getWordArray();
		
			for (String words1 : quote1){
				System.out.println(words1);
			}
		
			for (String words : quote2){
				System.out.println(words);
			}
			
			HashSet<String> set1=WordGroup1.getWordSet(WordGroup2);
			for(String word:set1) {
				System.out.println(word);
			}
			
			HashMap<String, Integer> map1=WordGroup1.getWordCount();
			HashMap<String, Integer> map2=WordGroup1.getWordCount();
			
			for(String map:map1.keySet()) {
				
			}
			
			for(String map:map2.keySet()) {
				
			}
			
		}
}
