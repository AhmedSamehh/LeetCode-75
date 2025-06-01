class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap();
        for(int x:arr){
            if(!map.containsKey(x)){
                map.put(x,1);
            }else{
                map.put(x, map.get(x)+1);
            }
        }
        System.out.println(map);

        Set set = new HashSet<Integer>();
        for(int i:map.keySet()){
            set.add(map.get(i));
        }
        
        return set.size() == map.size();
    }
}