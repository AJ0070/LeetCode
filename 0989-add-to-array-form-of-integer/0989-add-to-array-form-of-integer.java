class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int n = num.length;
        int carry = 0;

        for (int i = n - 1; i >= 0 || k > 0 || carry > 0; i--) {
            int digit = carry;
            if (i >= 0) {
                digit += num[i];
            }
            if (k > 0) {
                digit += k % 10;
                k /= 10;
            }
            result.add(0, digit % 10);
            carry = digit / 10;
        }

        return result;
    }
}