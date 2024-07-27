package LinearSearch;

public class FirstNonduplicate {
    public static String nonduplicate(String arr){
        for(int i=0;i<arr.length();i++)
        {
            boolean unique = true;
            for(int j=0;j<arr.length();j++)
            {
                if(i!=j && arr.charAt(i)==arr.charAt(j))
                {
                    unique = false;
                    break;
                }
            }
            if(unique)
            {
                return String.valueOf(arr.charAt(i));
            }
        }
        return "No unique element found";
    }

    public static void main(String[] args) {
        String arr = "abbuabbuabbaubauxi";
        String result = nonduplicate(arr);
        System.out.println("First non duplicate element is: "+result);

    }
}
