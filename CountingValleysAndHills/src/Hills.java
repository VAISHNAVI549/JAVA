
public class Hills {
	public int hillsCount(int n,String s) {
		int alt=0,countHills=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='U') {
				alt++;
			}
			else if(ch=='D') {
				alt--;
				if(alt==0)
					countHills++;
			}
		}
		return countHills;
	}

}
