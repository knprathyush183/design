package lambdaexpressions;

public class ContainsAnalyser implements StringAnalyser{

    @Override
    public boolean analyse(String target, String searchString) {
        return target.contains(searchString);
    }
}
