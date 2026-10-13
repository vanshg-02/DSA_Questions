class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int metal = 0, paper = 0, glass = 0;
        int house1 = 0, house2 = 0, house3 = 0;
        for (int i = 0; i < garbage.length; i++) {
            String s = garbage[i];
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (ch == 'M') {
                    metal++;
                    house1 = i;
                } else if (ch == 'P') {
                    paper++;
                    house2 = i;
                } else if (ch == 'G') {
                    glass++;
                    house3 = i;
                }
            }
        }
        int total = metal + paper + glass;
        for (int i = 0; i < house1; i++) {
            total += travel[i];
        }
        for (int i = 0; i < house2; i++) {
            total += travel[i];
        }
        for (int i = 0; i < house3; i++) {
            total += travel[i];
        }
        return total;
    }
}
