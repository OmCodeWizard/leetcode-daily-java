class Solution {
    int i=0;

    public List<String> braceExpansionII(String expression) {
        Set<String> result = parse(expression);
        List<String> res = new ArrayList<>(result);
        Collections.sort(res);
        return res;
    }
    private Set<String> parse(String s){
        Set<String> result=new HashSet<>();
        result.add("");

        while (i < s.length() && s.charAt(i) != '}') {
            char ch = s.charAt(i);

            if (ch == ',') {
                i++;
                Set<String> next = parse(s);
                result.addAll(next);
            } else {
                Set<String> part;

                if (ch == '{') {
                    i++;
                    part = parse(s);
                    i++;
                } else {
                    part = new HashSet<>();
                    part.add(String.valueOf(ch));
                    i++;
                }

                result = combine(result, part);
            }
        }

        return result;
    }
    private Set<String> combine(Set<String> a, Set<String> b) {
        Set<String> result = new HashSet<>();

        for (String x : a) {
            for (String y : b) {
                result.add(x + y);
            }
        }

        return result;
    }
}