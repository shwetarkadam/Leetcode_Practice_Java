class Solution {
    public String reverseWords(String s) {
       List<String> words= Arrays.asList(s.split(" "));   
     return  words.stream().map(e->new StringBuilder(e).reverse()).collect(Collectors.joining(" "));
    
    }
}
