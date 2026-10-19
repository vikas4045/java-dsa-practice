/*
  Problem: Reverse Words in a String
  Problem Number: 151
  Source: LeetCode
  Link: https://leetcode.com/problems/reverse-words-in-a-string/
*/

class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        
        String result = "";
        s = s.trim();
        String word[] = s.split("\\s+");

        for(String str : word){
            stack.push(str);
        }

        while(!stack.isEmpty()){
            result += stack.pop()+ " ";
    
        }
        return result.trim();
    }
}




