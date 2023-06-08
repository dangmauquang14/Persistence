package test;

public class DaoNguocChuoi {
	public static void main(String[] args) {
		String s = "Welcome to   JAVA10 class";
		System.out.println("Revert String: " + revertString(s));
	}

	private static StringBuilder revertString(String s) {
		String text = s.replace("\\s+", " ");
		String[] texts = text.split("\\s+");
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < texts.length; i++) {
			StringBuilder sbText = new StringBuilder(texts[i]);
			sbText.reverse();
			sb.append(sbText + " ");
		}
		return sb;
	}
}