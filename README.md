# Evatro Code Challenge
## Level 1
İlk problemde sorunun direkt bir palindrome tipi soru olduğunu anladım daha önce karşılaştığım bir soru tipiydi. Ve substringi char yapısı altında array olarak tuttum. </br>
* maxLen ve lo adında iki adet static değişken tanımladım. Ve değişkenlerden lo substring başlangıç index ini tutmak için, maxLen ise uzunluğunu tutmak için tasarlandı.</br>
* expandPalindrome metodunun işlevi merkezi bir index alarak sağ ve sol olmak üzere genişleyip verilen substringteki (char[]) en büyük palindrome u bulmaktır. </br>
* longestPalindrome metodunun işlevi ise bu expandPalindrome fonksiyonunu çağırarak (tek ve çift) palindrome taramalarından elde ediler static variablelar yardımı ile bize bir sonuç sunmaktır.</br>

## Level 2
> En keyif aldığım bölüm.
Bu problemimizi daha önceden algoritma analizi derslerimde incelidiğin için hakim olduğum bir problemdi. Aşama aşama olaylara yaklaşmak ve kod bağımsızlığını sağlamak amacıyla</br>
ayrı ayrı parçalara böldüm ve her methoda kendi işlevini yazdım. Methodlar sırasıyla;
* isPrime(int number); bir numaranın asal sayı olup olmadığını ve buna göre boolean ifade döndüren basit sade bir method.</br> ( Method biraz daha iyileştirebilirdi. Number/2 den sonrakileri test etmeyerek. Ama acele bu kadar oldu :) )
* isFibonacci(int number); bu method her çağrıldığında girdiğimiz sayıya göre fibonacci serisinin o sayısının çıktısını bize veriyor. Bu methodta iyileştirebilmeye açık.
* biggerFibonacciNumber(int number); bu metodumuzda bize verilen sayıdan bir büyük fibonacci hesaplanır.
* getFibonacciPrime(int number); yukaridaki metodlari kullanarak bu metodumuzla eger hesaplanan fibonacci asal degilse. bigger methodu tekrar cagrilir. (Recursive method)
* primeDivisorOfNumberPlusOne(int number); prime ve fibonacci olup verilen numaranin x+1 yani bir fazlasinin bolunenlerini hesapliyor. Bu bolunenlerden tam olanlari ise toplayip return olarak bize veriyor. </br>
Methodlar statik tanimlandi. Tum islemler main uzerinden gerceklesti. Ufak tefek iyilestirmeler yaptigim icin bu kod en cok zamanimi aldi.

## Level 3
Bu soruyu aslinda çözebilirdim. Fakat soruyu anlamam biraz uzun sürdü. Çözümü elime ulaştı fakat tam olarak anlamadığım çözümü sırf çözmek adına şu aşamada paylaşmak istemedim.
Greplin Subset Challenge.
### Resources
* https://stackoverflow.com/questions/6353218/count-all-subsets-of-an-array-where-the-largest-number-is-the-sum-of-the-remaini
* https://leetcode.com/problems/longest-palindromic-substring/solutions/3401644/detailed-recursive-explaination-with-pictures-in-c-java-python-dp-two-pointers/ 
* https://www.geeksforgeeks.org/backtracking-to-find-all-subsets/
* https://www.geeksforgeeks.org/subset-sum-problem-dp-25/
* https://stackoverflow.com/questions/21049622/get-a-sublist-of-a-hashmap
* https://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/
* https://stackoverflow.com/questions/5439267/greplin-programming-challenge-level-3-matlab
* https://www.geeksforgeeks.org/print-all-prime-numbers-less-than-or-equal-to-n/
* https://www.geeksforgeeks.org/check-number-fibonacci-number/
* https://stackoverflow.com/questions/15627400/java-based-library-to-provide-prime-numbers-of-a-certain-specified-length
* https://www.baeldung.com/java-prime-numbersM</br></br>
> Son soru için chatgpt den yararlandım. Bulduğum çözümü çevircektim. Python -> Java vesaire. </br>Ama dediğim gibi bu aşamada sadece elimden geleni yaptım. Sizlerin benim problem çözme yeteneğimi daha iyi analiz edebilmeniz için  fakat normal şartlarda bir task olsaydı bu sorunu çözerdim.


