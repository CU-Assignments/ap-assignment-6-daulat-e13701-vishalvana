public class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        Map<String, List<String>> memo = new HashMap<>();
        return wordBreakHelper(s, wordSet, memo);
    }

    private List<String> wordBreakHelper(String s, Set<String> wordSet, Map<String, List<String>> memo) {
        if (memo.containsKey(s)) {
            return memo.get(s);
        }
        
        if (s.isEmpty()) {
            return new ArrayList<>(Collections.singletonList(""));
        }
        
        List<String> result = new ArrayList<>();
        
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            if (wordSet.contains(prefix)) {
                List<String> restOfTheSentences = wordBreakHelper(s.substring(i), wordSet, memo);
                
                for (String sentence : restOfTheSentences) {
                    if (sentence.isEmpty()) {
                        result.add(prefix);  
                    } else {
                        result.add(prefix + " " + sentence);  
                    }
                }
            }
        }
        
        memo.put(s, result);
        
        return result;
    }
}
