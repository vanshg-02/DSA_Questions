class Solution {
    public List<String> removeInvalidParentheses(String s) {

        List<String> ans = new ArrayList<>();

        int left = 0;
        int right = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                left++;
            } 
            else if (c == ')') {

                if (left > 0) {
                    left--;
                } 
                else {
                    right++;
                }
            }
        }

        backtrack(s, 0, left, right, ans);

        return ans;
    }

    public void backtrack(String s, int index, int left,
                           int right, List<String> ans) {

        if (left == 0 && right == 0) {

            if (isValid(s)) {
                if (!ans.contains(s)) {
                    ans.add(s);
                }
            }

            return;
        }

        for (int i = index; i < s.length(); i++) {

            if (i > index && s.charAt(i) == s.charAt(i - 1)) {
                continue;
            }

            if (left + right > s.length() - i) {
                return;
            }

            char ch = s.charAt(i);

            if (left > 0 && ch == '(') {
                String next = s.substring(0, i) + s.substring(i + 1);

                backtrack(next, i, left - 1, right, ans);
            }

            if (right > 0 && ch == ')') {
                String next = s.substring(0, i) + s.substring(i + 1);

                backtrack(next, i, left, right - 1, ans);
            }
        }
    }

    public boolean isValid(String s) {

        int count = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                count++;
            } 
            else if (c == ')') {
                count--;

                if (count < 0) {
                    return false;
                }
            }
        }

        return count == 0;
    }
}