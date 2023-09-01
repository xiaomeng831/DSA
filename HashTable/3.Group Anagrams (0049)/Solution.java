class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hashMap = new HashMap<>();

        for(String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(!hashMap.containsKey(key)){
                hashMap.put(key, new ArrayList<>());
            }

            hashMap.get(key).add(word);  

            // if(!hashMap.containsKey(key)){
            //     List<String> value = new ArrayList<>();
            //     value.add(word);
            //     hashMap.put(key, value);
            // }else{
            //     hashMap.get(key).add(word);
            // }                        
        }

        return new ArrayList<>(hashMap.values());
    }
}
