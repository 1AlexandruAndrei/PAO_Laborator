import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        //compareStr("ceas", "rolex");
        //characters("This is 1 string");
        //occurrence("abracadabra");
        System.out.println(duplicates(new int[]{1, 2, 3, 2, 4, 1, 5, 9, 5}));
    }

    private static void compareStr(String s1, String s2)
    {
        s1=s1.toLowerCase();
        if (s1.compareTo(s2)==0)
            System.out.println("the strings are equal");
        else if (s1.compareTo(s2)==-1)
            System.out.println("string 1 comes before string 2");
        else {
            System.out.println("string 2 comes before string 1");
        }
    }

    private static void characters(String s1){
        s1=s1.toLowerCase();
        int vowels=0;
        int consonants=0;
        int digits=0;
        int spaces=0;
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch>='a' && ch<='z')
            {
                if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
                    vowels+=1;
                else
                    consonants+=1;
            }
            else if(Character.isDigit(ch))
            {
                digits+=1;
            }
            else if(Character.isWhitespace(ch))
            {
                spaces+=1;
            }

        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);


    }

    private static void occurrence(String s1)
    {
        s1=s1.toLowerCase();
        int[] occ=new int[26];

        for(char ch: s1.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                occ[ch-'a']+=1;
            }
        }

        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
            if(occ[i]>0)
            {
                System.out.println(ch + ": " + occ[i]);
            }
        }
    }

    private static int duplicates(int[] v)
    {
        Arrays.sort(v);
        int index=0;

        for(int i = 0; i<v.length; i++)
        {
            if(i==0 || v[i]!=v[i-1])
               v[index++]=v[i];
        }
        return index;
    }

}