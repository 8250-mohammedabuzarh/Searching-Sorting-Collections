package LinearSearch;

public class CharecterOccurance{
    public static int Charecteroccur(String arr, char target)
    {
        int count = 0;
        for(int i=0;i< arr.length();i++)
        {
            if(arr.charAt(i)==target)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String arr = "abbu";
        char target = 'b';
        int result = Charecteroccur(arr,target);
        if(result!=0)
        {
            System.out.println("Charecter found "+result+" times");
        }
        else {
            System.out.println("Charecter not found");
        }
    }

}
