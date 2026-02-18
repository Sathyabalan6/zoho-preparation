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

    public static String decode(Stirng str2){
        for(int i = 0 ; i < str2.length(); i++){
            
        }
    }



    public static void main(String[] args) {

        String str = "wwwdddoooyythhhakkkbbbb";
        System.out.println(encode(str));
        String str2 = "w3k4b2v5";
        System.out.println(decode(str2));
    }
}
