public class Solution {
	public static String amazingStrings(String first, String second,String third) {
		int[] freq = new int[26];
    	for (int i = 0; i < first.length(); i++) {
        	freq[first.charAt(i) - 'A']++;
   		}
    	for (int i = 0; i < second.length(); i++) {
        	freq[second.charAt(i) - 'A']++;
    	}
    	for (int i = 0; i < third.length(); i++) {
        	freq[third.charAt(i) - 'A']--;
    	}
    	for (int i = 0; i < 26; i++) {
        	if (freq[i] != 0) {
            	return "NO";
       		}
    	}
		return "YES";
	}
}
