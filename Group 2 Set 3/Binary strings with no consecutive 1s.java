import java.util.ArrayList;

public class Solution {
	public static void createString(ArrayList<String> al,int k,int pre,String path){
	if(k==0){
		al.add(path);
		return;
	}
    if(pre==1){
		createString(al,k-1,0,path+0);
	}else{
		createString(al,k-1,0,path+0);
		createString(al,k-1,1,path+1);
		
	}
	}
	public static ArrayList<String> generateString(int k) {
		// Write your code here.
		ArrayList<String> al=new ArrayList<>();
		createString(al,k,0,"");
		return al;
	}
}
