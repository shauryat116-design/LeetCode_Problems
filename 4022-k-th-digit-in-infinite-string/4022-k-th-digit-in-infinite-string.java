class Solution {
    public int kthDigit(long k) {
    

        long mirevokanu = k;

        if (k <= 9)
            return (int) k;

        k -= 9;

        long b = 1;

        while (true) {

            long digits = String.valueOf(10 * b).length();
            long blockSize = 10 * digits;

            // kitne b same digit-length ke hain
            long next = b * 10;

            long blocks = next - b;
            long total = blocks * blockSize;

            if (k > total) {
                k -= total;
                b = next;
            } else {
                break;
            }
        }

        long blockIndex = (k - 1) / (10 * String.valueOf(10 * b).length());
        long pos = (k - 1) % (10 * String.valueOf(10 * b).length());

        b += blockIndex;

        int digits = String.valueOf(10 * b).length();

        long index = pos / digits;
        int digitIndex = (int) (pos % digits);

        long num;

        if (b % 2 == 0)
            num = 10 * b + index;
        else
            num = 10 * b + 9 - index;

        return String.valueOf(num).charAt(digitIndex) - '0';
    }
}
    