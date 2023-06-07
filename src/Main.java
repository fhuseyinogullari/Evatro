import level1.LongestPalindromeSubstring;
import level2.FibonacciPrime;

public class Main {
    public static void main(String[] args) {
        // level1
        String level1 = "FourscoreandsevenyearsagoourfaathersbroughtforthonthiscontainentanewnationconceivedinzLibertyanddedicatedtothepropositionthatallmenarecreatedequalNowweareengagedinagreahtcivilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        System.out.println("The longest palindrome of a substring is: " + LongestPalindromeSubstring.longestPalindrome(level1));
        // level2
        int level2 = FibonacciPrime.getFibonacciPrime(227000);
        System.out.println("Smallest prime fibonacci number greater than 227000 is  "+ level2);
        int levelDivisor = level2 + 1;
        System.out.println("Number of divisor for X+1 ("+(levelDivisor)+ ") is  " + FibonacciPrime.primeDivisorOfNumberPlusOne(level2));
        // level3
        // Greplin subset problem diye internet uzerinden buldum kodu
        // tam olarak kavramadigim icin buraya paylasmiyorum.
    }

}