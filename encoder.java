class encoder {

    public static String encode(String str) {

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result.append(str.charAt(i));
                result.append(count);
                count = 1;
            }
        }

        return result.toString();
    }

    public static String decode(String str2){

        StringBuilder decode_result = new StringBuilder(); 
        for(int i = 0 ; i < str2.length(); i+=2){
            char b1 = str2.charAt(i);
            char b2 = str2.charAt(i+1);
            String build = connect(b1 , b2);
            decode_result.append(build);
        }
        return decode_result.toString();
    }

    public static String connect(char n1 , char n2){
        
        String result_decode = "";
        int count_letter = n2 - '0';

        for(int i =0; i <count_letter; i++){
            result_decode = result_decode + n1;
        }
        return result_decode;
    }



    public static void main(String[] args) {

        String str = "wwwdddoooyythhhakkkbbbb";
        System.out.println(encode(str));
        String str2 = "w3k4b2v5";
        System.out.println(decode(str2));
    }
}
