
public class Valley {
	
public int CountValley(int n,String s) {
	
	int alt=0,valleyCount=0;
	
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		
		if(ch=='U') {
			alt++;
			if(alt==0)
				valleyCount++;
		}
	
		else if(ch=='D')
			alt--;
	}
	return valleyCount;
	
}
}
