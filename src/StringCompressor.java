public class StringCompressor {
    public static void main(String[] args) {
        String inputString = "aaabbccc";
        int count = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =1 ; i<inputString.length();i++){
             if(i == inputString.length()-1){
                count++;
                 stringBuilder.append(inputString.charAt(i-1)).append(count);
            }
            else if(inputString.charAt(i) == inputString.charAt(i-1)){
                count++;
            } else{
                 stringBuilder.append(inputString.charAt(i-1)).append(count);
                count =1;
            }
        }

        System.out.println(stringBuilder);
    }
}
