package principal;

import java.util.ArrayList;
import java.util.List;

class Datos2{
	//método que devuelva una lista con los 10 primeros números enteros
	public List<Integer> numeros(){
		/*ArrayList<Integer> lst=new ArrayList<>();//así lo haríamos antes del método of
		for(int i=1;i<=10;i++) {
			lst.add(i);
		}
		return lst;*/
		//return List.of(1,2,3,4,5,6,7,8,9,10);//inmutables
		Integer[] nums=new Integer[1000];//para calcular los 1000 primeros números
		for(int i=1;i<=1000;i++) {
			nums[i-1]=i;
		}
		return List.of(nums);
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		Datos2 dt=new Datos2();
		List<Integer> nums=dt.numeros();
		for(Integer n:nums) {
			System.out.println(n);
		}

	}

}
