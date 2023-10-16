import ibcsutils.ReadViaURL;
public class Main {
    public static void main(String[] args) {
        String addr = "https://www-personal.umich.edu/~jlawler/wordlist";
        String []words= ReadViaURL.readWords(addr, true, true, true);
        int index = 7654;
        String key = words[index-1];
        System.out.println("Word to be found: " + key);
        int lo = 0;
        int hi = words.length-1;
        boolean found= false;
        int iterations = 0;
        while ( lo <= hi)
        {
            int mid = (lo+hi)/2;
            String v = words[mid];
            //System.out.println(v);
            iterations=iterations+1;
            if (v==key)
            {
                found=true;
                break;
            }
            //if the key  is greater
            else if (v.compareTo(key) < 0)
                lo=mid+1;
            else
                hi = mid-1;

        }
        System.out.println(found);
        System.out.println("number of rounds: " + iterations);
    }
}

 //0 if the string is equal to the other string.
//< 0 if the string is lexicographically less than the other string
//> 0 if the string is lexicographically greater than the other string (more characters)