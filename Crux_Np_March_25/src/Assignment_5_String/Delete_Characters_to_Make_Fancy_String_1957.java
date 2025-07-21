package Assignment_5_String;

public class Delete_Characters_to_Make_Fancy_String_1957 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "leeetcode";
		System.out.println(name(st));
	}

	public static String name(String st) {
	    int count = 1;
	    StringBuilder ans = new StringBuilder();
	    ans.append(st.charAt(0));
	    
	    for (int i = 1; i < st.length(); i++) {
	        if (st.charAt(i) == st.charAt(i - 1)) {
	            ++count;
	        } else {
	            count = 1;
	        }

	        if (count < 3) {
	            ans.append(st.charAt(i));
	        }
	    }
	    return ans.toString();
	}

}
