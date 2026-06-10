class Solution
 {
    public boolean isAnagram(String s, String t)
    {
        HashMap<Character,Integer> map= new HashMap<>();
        if(s.length() != t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            int m=0;
            char c=s.charAt(i);
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1); 
            }
            else 
            {
                map.put(c,1);
            }
        }
        for(int i=0; i<t.length(); i++)
        {
            char p = t.charAt(i);
            if(!map.containsKey(p) || map.get(p) == 0)
            return false;
            map.put(p, map.get(p) - 1); 
        }
        return true; 
    }
 }


