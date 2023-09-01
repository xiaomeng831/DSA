class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dic = dict()
        for word in strs:
            char_array = list(word)
            char_array.sort()
            key = ''.join(char_array)

            if dic.get(key) is None:
                dic[key] = list()

            dic[key].append(word)
        return list(dic.values())           
