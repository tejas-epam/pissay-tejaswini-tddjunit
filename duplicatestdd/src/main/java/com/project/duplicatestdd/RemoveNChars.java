package com.project.duplicatestdd;

public class RemoveNChars {

	public String remove(String string) {
		 String result=string;
	        int stringLength=string.length();
	        char k=string.charAt(0);
	        char p=string.charAt(1);
	        if(stringLength<=1)
	        {
	        	return result;
	        }
	        if(stringLength>=2) {
	        	if(k=='a')
	        	{
	        		result=string.substring(1,stringLength);
	        		return result;
	        	}
	        	else if(p=='a')
	        	{
	        		result=string.charAt(0)+string.substring(2,stringLength);
	        		return result;
	        	}

	}
			return result;
	}
}


