class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);

        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);

        String sSorted= new String(sArray);
        String tSorted= new String(tArray);

        return sSorted.equals(tSorted) ? true : false;

    }
}
