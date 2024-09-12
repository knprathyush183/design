package lambdaexpressions;

public class StringAnalyserTest {

    public static void main(String[] args) {
        String[] strList1 = {"tommorow", "toto", "to", "timbukto", "the", "hello", "heat"};
        String searchStr = "to";
        System.out.println("Searching for : " + searchStr);

        StringAnalyser containsAnalyser = new ContainsAnalyser();
        System.out.println("---------Contains----------");
        searchArr(strList1, searchStr, containsAnalyser);

        System.out.println("-----------Contains using lambda------------");
        searchArr(strList1, searchStr,
                (a, b) -> a.contains(b)
                );
    }

    public static void searchArr(String[] strList, String searchStr, StringAnalyser stringAnalyser) {
        for (String currentString : strList) {
            if (stringAnalyser.analyse(currentString, searchStr)) {
                System.out.println("Match: " + currentString);
            }
        }
    }
}
