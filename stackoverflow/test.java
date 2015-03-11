package stackoverflow;

import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.maxent.*;
import java.util.*;
import gnu.trove.*;
import opennlp.tools.lang.english.*;
import java.awt.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paragraph = "Sahajanand is God. Gunatit is Akshar.";
		try{
		SentenceDetectorME sdetector = new SentenceDetector("D:\source\stackoverflow\stackoverflow\stackoverflow\person.bin.gz");
		String[] sents = sdetector.sentDetect(paragraph.toString());
		System.out.println(sents[0] + "\n" + sents[1]);
		}
		catch(Exception e)
		{}
	}
}