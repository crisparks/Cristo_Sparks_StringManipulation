
public class StringManipulation{ 
    
    public String trimAndConcat( String a, String b){
        String string1 = a.trim();
        String string2 = b.trim();
        String string3 = string1.concat(string2);
        return string3;    
    }

    public Integer getIndexOrNull(String a, char b){
        int c = a.indexOf(b);
        if( c < 0){
            return null;
        }
        else{
            return c;
        }
    }

    public Integer getIndexOrNull(String a, String b){
        int c = a.indexOf(b);
        if( c < 0){
            return null;
        }
        else{
            return c;
        }
    }
    
    public String concatSubstring(String a, int b, int c, String d){
        String string1 = a.substring(b, c);
        String string2 = string1.concat(d);
        return string2;
    }
}
