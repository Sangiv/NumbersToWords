
public class Func {
	
	public void Convert(int num) {
		
		String ans = "";
		
		if(num >= 1000) {
			ans += Ones(num/1000) + " Thousand";
			num= num % 1000;
		}
		
		if(num >= 100) {
			ans += Ones(num/100) + " Hundred";
			num= num % 100;
		}		
		
		if(num >= 20) {
			ans += Tens((num/10)*10);
			num= num % 10;
		}
		
		if(num >= 1) {
			ans += Ones(num);
		}
		
		System.out.println(ans);
	}
	
	private String Ones(int num) {
		
		String ans = "";
				
		switch(num) {
		
		case 1: ans = " One"; break;
		case 2: ans = " Two"; break;
		case 3: ans = " Three"; break;
		case 4: ans = " Four"; break;
		case 5: ans = " Five"; break;
		case 6: ans = " Six"; break;
		case 7: ans = " Seven"; break;
		case 8: ans = " Eight"; break;
		case 9: ans = " Nine"; break;
		case 10: ans = " Ten"; break;
		case 11: ans = " Eleven"; break;
		case 12: ans = " Twelve"; break;
		case 13: ans = " Thirteen"; break;
		case 14: ans = " Fourteen"; break;
		case 15: ans = " Fifteen"; break;
		case 16: ans = " Sixteen"; break;
		case 17: ans = " Seventeen"; break;
		case 18: ans = " Eighteen"; break;
		case 19: ans = " Nineteen"; break;
		default: ans = " Zero";
		}
		return ans;
	}
	
	private String Tens(int num) {
		
		String ans = "";
		
		switch(num) {
		
		case 20: ans = " Twenty"; break;
		case 30: ans = " Thirty"; break;
		case 40: ans = " Fourty"; break;
		case 50: ans = " Fifty"; break;
		case 60: ans = " Sixty"; break;
		case 70: ans = " Seventy"; break;
		case 80: ans = " Eighty"; break;
		case 90: ans = " Ninty"; break;
		}
		return ans;
	}
}
