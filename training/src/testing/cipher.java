package testing;

public class cipher {

	public static void main(String[] args) {
		String s = "middle-Zutz";
		int k = 10;
		String st[] = s.split("-");
        StringBuilder res = new StringBuilder();
        for(String x : st){
            for(int i=0;i<x.length();i++){

                char c = (char)(x.charAt(i)+k);
                char ch=c;
                System.out.println(c);
                if(Character.isUpperCase(x.charAt(i))){
                    if(c>'Z'){
                        ch = (char)((c-'Z')+'A'-1);
                        System.out.println(ch);
                    }
                }
                else{
                    if(c>'z'){
                        ch = (char)((c-'z')+'a'-1);
                        System.out.println(ch);
                    }
                }                                                          

                res.append(ch);
            }
            res.append('-');
        }
        String temp = new String(res);
        System.out.println(temp);
        System.out.println(temp.substring(0,temp.length()-1));

	}

}
