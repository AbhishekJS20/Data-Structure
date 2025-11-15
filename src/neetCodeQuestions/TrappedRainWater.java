package neetCodeQuestions;

public class TrappedRainWater {
    public static int trappedrainWater(int [] hight){
        //calculate left MAX boundaries
        int n = hight.length;
        int leftMAX[] = new int[n];
        leftMAX[0] = hight[0];
        for(int i =1;i <n;i++){
            leftMAX[i] = Math.max(hight[i],leftMAX[i-1]);
        }
        //calculate right MAX boundaries
        int rightMAX[] = new int[n];
        leftMAX[n-1] = hight[n-1];
        for(int i =n-2;i >= 0;i--){
            rightMAX[i] = Math.max(hight[i],rightMAX[i+1]);
        }
        // loop
        int trappedwater =0;
        for (int i = 0; i < n; i++) {
            int waterlevel =  Math.min(leftMAX[i], rightMAX[i]);
            // waterlevel
            trappedwater += waterlevel-hight[i];
        }
        return trappedwater;

    }

    public static void main(String[] args) {
        int [] hight = {4,2,0,6,3,2,5};
        System.out.println(trappedrainWater(hight));
    }
}
