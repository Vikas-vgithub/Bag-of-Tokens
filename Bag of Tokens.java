class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i = 0;
        int j =tokens.length-1;
        int score = 0;
        int max = 0;

        while(i<=j){
            if(power>=tokens[i]){
                power -= tokens[i++];
                score++;
                max = Math.max(max, score);
            }else if(score>0){
                power += tokens[j--];
                score--;
            }else{
                break;
            }
        }
        return max;
    }
}
