package training;


import java.util.*;
public class test {
	
	
	static String isValid(String s) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        ArrayList<Character> al = new ArrayList<Character>();
        ArrayList<Integer> bl = new ArrayList<Integer>();
        for(int i=0;i<s.length();i++){
            al.add(s.charAt(i));
        }
        al.forEach((x)->hm.put(x,Collections.frequency(al,x)));
        HashMap<Integer,Integer> set = new HashMap<Integer,Integer>(); 
        for(char c: hm.keySet()){
            bl.add(hm.get(c));
        }
        bl.forEach((z)->set.put(z,Collections.frequency(bl,z)));
        
//        System.out.println(set);
//        System.out.println(hm);
        
        if(set.size()==1){
            return "YES";
        }
        
        if(set.size()==2){
            for(int v: set.keySet()){
                if(set.get(v)==1){
                	int diff = Collections.max(set.keySet())-Collections.min(set.keySet());
                    if(diff>1){
                        return "NO";
                    }
                    return "YES";
                    }
                }
            }
            
        return "NO";
    }
	
	public static void main(String[] args) {
		
		String s ="aabbcd";
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        ArrayList<Character> al = new ArrayList<Character>();
        ArrayList<Integer> bl = new ArrayList<Integer>();
        for(int i=0;i<s.length();i++){
            al.add(s.charAt(i));
        }
        al.forEach((x)->hm.put(x,Collections.frequency(al,x)));
        HashMap<Integer,Integer> set = new HashMap<Integer,Integer>(); 
        for(char c: hm.keySet()){
            bl.add(hm.get(c));
        }
        bl.forEach((z)->set.put(z,Collections.frequency(bl,z)));
        
        System.out.println(set);
        System.out.println(hm);
        int diff = Collections.max(set.keySet())-Collections.min(set.keySet());
		System.out.println(isValid(s) + "     "+diff);
		
	}	

}





