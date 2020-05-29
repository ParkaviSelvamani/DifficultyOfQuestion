import java.io.*;
import java.util.*;
public class Difficulty {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\Parkavi\\Documents\\DifficultyofaQuestion.txt");
		Scanner sc = new Scanner(file);
		int q = 0;
		while(sc.hasNextLine()) {
			String[] s = sc.nextLine().split("\\s");
			int[] x = new int[4];
			int j = 0;
			for(int i=3;i<7;i++) {
				String[] a = s[i].split(",");
				int sum = 0;
				if(Character.isDigit(a[0].charAt(0))) {
					for(int k=0;k<a.length;k++) {
						sum += Integer.parseInt(a[k]);
					}
					x[j++] = sum;
				}
			}
			if(Character.isDigit(s[2].charAt(0))) {
				int z = Integer.parseInt(s[2]);
				System.out.print(++q + " ");
				switch(s[0].charAt(1)) {
					case 'a':
					case 'c':
					case 'i': int avg_time = 30,changed = 1,hint = 1;
						  if((x[0]/z)<=avg_time && (x[1]/z)<=changed && (x[3]/z)<=hint) {
					  		System.out.println("Easy");
					  	  }
					  	  else if((x[0]/z)<=(avg_time*2) && (x[1]/z)<=(changed*2) && (x[3]/z)<=(hint*2)) {
					  		System.out.println("Medium");
					  	  }
					  	  else {
					  		System.out.println("Hard");
					  	  }
						  break;
					case 'r': int avg_time1 = 120,compiled = 2,hint1 = 1;
						  if((x[0]/z)<=avg_time1 && (x[2]/z)<=compiled && (x[3]/z)<=hint1) {
					  	  	System.out.println("Easy");
					  	  }
					  	  else if((x[0]/z)<=(avg_time1*2) && (x[2]/z)<=(compiled*2) && (x[3]/z)<=(hint1*2)) {
					  		System.out.println("Medium");
					  	  }
					  	  else {
					  		System.out.println("Hard");
					  	  }
						  break;
				}
			}
		}
		sc.close();
	}
}
