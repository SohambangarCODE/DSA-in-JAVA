class Solution {
    public int reverse(int x) {
         long rev = 0;  // long can hold values way beyond int's range

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            rev = rev * 10 + digit;

            // If it's already out of int range, no point continuing
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) rev;
    }
    
    }