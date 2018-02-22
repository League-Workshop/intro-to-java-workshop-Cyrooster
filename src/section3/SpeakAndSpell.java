package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("Spell Mandlebrot or else you will have to die");
		// 2. Catch the user's answer in a String
String cyrus=JOptionPane.showInputDialog(null, "better get it right");
		// 3. If the user spelled the word correctly, speak "correct"
if(cyrus.equals ("mandlebrot")) {
	speak("good job.");
}
		// 4. Otherwise say "wrong"
else { 
speak ("wrong wrong wrong wrong wrong wrong wrong wrong wrong wrong wrong");
}
		// 5. repeat the process for other words
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


