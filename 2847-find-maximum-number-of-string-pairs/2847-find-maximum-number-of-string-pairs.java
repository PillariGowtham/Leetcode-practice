class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int ans = 0;
        for (String word : words) {
            String reversed = "" + word.charAt(1) + word.charAt(0);
            if (set.contains(reversed)) {
                ans++;
            } else {
                set.add(word);
            }
        }
        return ans;
    }
}
