package collection.tuvung;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class App {
	public static void main(String[] args) {
		List<Word> dictionary = getDictionary();
		Word addWord = new Word("Ocean", "Đại dương", "n", "'ouʃn");
		addDictionary(addWord, dictionary);
		System.out.println(dictionary);
		
		//=====================================
		
		System.out.println("\nSearch : " + searchVocab("Ocean", dictionary));
	}

	private static List<Word> getDictionary() {
		List<Word> dictionary = new ArrayList<>();
		dictionary.add(new Word("Baseball", "Bóng chày", "n", "ˈbāsˌbôl"));
		dictionary.add(new Word("Animal", "Động vật", "n", "'æniməl"));
		dictionary.add(new Word("Backyard", "Sân sau", "n", "'bækˈjɑːd"));
		dictionary.add(new Word("Around", "Xung quanh", "adv", "ə'raund"));
		dictionary.add(new Word("Center", "Trugn tâm", "n", "'sentə"));
		dictionary.add(new Word("University", "Trường đại học", "n", ",ju:ni'və:siti"));
		dictionary.add(new Word("Dependent", "Phụ thuộc", "adj", "di'pendənt"));
		dictionary.add(new Word("Capital", "Thủ đô", "n", "'kæpitl"));
		dictionary.add(new Word("Defuse", "Xoa dịu", "v", "ˌdiːˈfjuːz"));
		dictionary.add(new Word("Eliminate", "Loại bỏ", "v", "i'limineit"));
		dictionary.add(new Word("East", "Phía đông", "n", "ēst"));
		dictionary.sort(Comparator.comparing(Word::getVocab));
		return dictionary;
	}

	private static void addDictionary(Word e, List<Word> dictionary) {
		for (int i = 0; i < dictionary.size(); i++) {
			if(!e.equals(dictionary.get(i)))
			{
				dictionary.add(i,e);
				break;
			}
		}
	}
	private static Word searchVocab(String e,List<Word> dictionary)
	{
		for(Word word : dictionary)
		{
			if(word.getVocab().equals(e))
			{
				return word;
			}
		}
		return null;
	}
}