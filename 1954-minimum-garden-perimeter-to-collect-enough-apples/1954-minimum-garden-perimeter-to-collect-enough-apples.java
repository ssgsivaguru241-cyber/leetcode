class Solution {
    public long minimumPerimeter(long neededApples) {
        // int n = 0;
        // long totalApples = 0;
        // while(totalApples <= neededApples){
        //     n = n + 1;
        //     totalApples += 12 * n * n;
        // }
        // return 8*n;
        // public long minimumPerimeter(long neededApples) {
    long n = 0;
    long apples = 0;
    
    while(apples < neededApples) {
        n++;
        apples = 2 * n * (n + 1) * (2 * n + 1);
    }
    
    return 8 * n;


        
    }
}