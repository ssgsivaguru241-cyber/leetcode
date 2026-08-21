class Solution {
    public boolean isPrime(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        for(int i = 2 ; i*i <= n ;i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int c : nums) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        for(int count : frequencyMap.values())
        {
            if(isPrime(count))
            {
                return true;
            }
        }
        return false;
    }
}