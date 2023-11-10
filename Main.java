import java.util.Scanner; 
public class Main {
 public static void main(String[] args){
	 System.out.println("自分のBMIを知ろう！！");
	 System.out.println("身長:");
	 Scanner scanner= new Scanner(System.in);
	 double sintyou = Integer.parseInt(scanner.nextLine());
	 System.out.println("体重:");
	 double taizyuu = Integer.parseInt(scanner.nextLine());
	 sintyou = sintyou / 100;
	 	double nizyou = sintyou * sintyou;
		double BBmi = taizyuu / nizyou;
		System.out.println(String.format("%.2f",BBmi));
		if(25 <= BBmi){
			System.out.println("あなたは太っています。痩せましょう！");
	 }else{
		 System.out.println("あなたは太っていません！この調子で頑張りましょう(>-<)");
	 }
}
}
