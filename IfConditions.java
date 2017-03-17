package elizaReplica;

public class IfConditions{
	
	public static String strgCon(String r){
		if(r.length() > 5){
			r = "We seem to be making great progress with " + r;	
		}
		if(r.length() < 3){
			r = "Is there something else you would like to discuss?";	
		}
		if(r.length() == 3){
			r = "Hmmm tell me more about your " + r;	
		}
		if(r.length() == 4){
			r = "Why do you feel " + r + " is important?";	
		}
		if(r.length() == 5){
			r = "How does " + r + " affect you?";	
		}
		return r;
	}
}