import java.util.ArrayList;

public class InsiemeDiStringhe {
	private ArrayList<String> strings;

	public InsiemeDiStringhe(ArrayList<String> strings) {
		this.strings = strings;
	}

	public InsiemeDiStringhe() {
		this.strings = new ArrayList<String>();
	}

	public String stringaLunga() {
		String stringaLunga = "";
		for (int i = 0; i < strings.size(); i++) {
			if (strings.get(i).length() > stringaLunga.length())
				stringaLunga = strings.get(i);
		}
		return stringaLunga;
	}

	public String spaziStringa() {
		String stringaSpazi = "";
		long nSpazi = 0L;
		for (int i = 0; i < strings.size(); i++) {
			String s = strings.get(i);
			long n = s.chars().mapToObj(c -> (char) c).filter(c -> c == ' ').count();
			if (n > nSpazi) {
				nSpazi = n;
				stringaSpazi = s;
			}
		}
		return stringaSpazi;
	}

	public String preStringa(String prefix) {
		String out = "";

		for (int i = 0; i < strings.size(); i++) {
			if (strings.get(i).length() >= prefix.length()) {
				int j = 0;
				boolean samePrefix = true;
				while (j < (prefix.length()) && samePrefix) {
					if (prefix.charAt(j) != strings.get(i).charAt(j))
						samePrefix = false;
					j++;
				}
				if (samePrefix)
					out = out + strings.get(i) + "\n";
			}

		}

		return out;
	}

}
