class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Comparator<int[]> mycomp = new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                double ad = Math.pow((Math.pow(a[0],2) + Math.pow(a[1],2)), 0.5);
                double bd = Math.pow((Math.pow(b[0],2) + Math.pow(b[1],2)), 0.5);
                if(ad-bd < 0){return -1;}
                else if(ad - bd > 0){return 1;}
                return 0;
            }
            
        };
        
        
        Arrays.sort(points, mycomp);
        int[][] ret = new int[k][2];
        for(int i = 0; i < k; i ++){
            ret[i] = points[i];
        }
        return ret;
        
    }
}