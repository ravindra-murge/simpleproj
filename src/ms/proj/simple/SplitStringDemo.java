package ms.proj.simple;

import java.util.Arrays;
import java.util.List;

public class SplitStringDemo {

	String str = "Cov_islamic;cov_social_impact;cov_iva";
	
	public static void splitStr(String str) {
	String[] strArr = str.split(";");
	List<String> list =  Arrays.asList(strArr);
	for(String ele : list) {
		System.out.println(ele);		
	}

	
	if (list.contains("cov_iva")) {
		System.out.println("list contains IVA");
	}
	
	}
	
	public static void main(String[] args) {
		splitStr("Cov_islamic;cov_social_impact;cov_iva");
	}
}
