public class AccentReplacer {

	  public static final String getCleanText(String input)
	  {
	    String cleanText = input.toLowerCase();
	    cleanText = cleanText.trim();
	    cleanText = cleanText.replaceAll("[èéêëěėēę]", "e");
	    cleanText = cleanText.replaceAll("[ûùúůűüų]", "u");
	    cleanText = cleanText.replaceAll("[ïîíīį]", "i");
	    cleanText = cleanText.replaceAll("[àâáäǎåāăą]", "a");
	    cleanText = cleanText.replaceAll("[ǒóôőôöøōðò]", "o");
	    cleanText = cleanText.replaceAll("[ľĺłļ]", "l");
	    cleanText = cleanText.replace("ķ", "k");
	    cleanText = cleanText.replaceAll("[rřŕŗ]", "r");
	    cleanText = cleanText.replaceAll("[žźż]", "z");
	    cleanText = cleanText.replaceAll("[ďđ]", "d");
	    cleanText = cleanText.replaceAll("[ťțţ]", "t");
	    cleanText = cleanText.replaceAll("[ýŸÿ]", "y");
	    cleanText = cleanText.replaceAll("ģ", "g");
	    cleanText = cleanText.replaceAll("[čćç]", "c");
	    cleanText = cleanText.replaceAll("[šşśș]", "s");
	    cleanText = cleanText.replaceAll("ß", "ss");
	    cleanText = cleanText.replaceAll("[ňńñņ]", "n");
	    cleanText = cleanText.replace("æ", "ae");

	    cleanText = cleanText.replaceAll("[^a-zA-Z0-9]+", "-");
	    cleanText = cleanText.replaceAll("\\p{Punct}|\\p{Cntrl}|\\p{Space}+|–+|´+", "-");
	    cleanText = cleanText.replaceAll("\\p{Space}+|-+", "-");

	    cleanText = cleanText.replaceAll("^-|-$", "");

	    return cleanText.trim();
	  }
}

