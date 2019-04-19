import java.util.Scanner;

public class ProblemJ3_2015 {
	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		
		char alpha[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w',
						'x','y','z'};
		char con[] = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
		char vow[] = {'a','e','i','o','u'};
		char c1, c2 = '\0', c3;
		
		
		String sentence = thing.nextLine();
		StringBuilder output = new StringBuilder();
		
		for(int i = 0; i < sentence.length(); i++) {
			for(int j = 0; j < 21; j++) {
				if(sentence.charAt(i) == con[j]) {
					c1 = con[j];
					int min_v = 100;
					
					for(int k = 0; k < 5; k++){
						if(min_v > Math.abs(con[j]-vow[k])) {
							min_v = Math.abs(con[j]-vow[k]);
							c2 = vow[k];
							//System.out.println(c1 + "\t" + min_v);
						}
					}
					
					c3 = con[j+1];
					
					//System.out.println(c1);
					//System.out.println(c2);
					//System.out.println(c3);
					output = output.append(c1);
					output = output.append(c2);
					output = output.append(c3);
				}
			}
			
			for(int l = 0; l < 5; l++){
				if(sentence.charAt(i) == vow[l]){
					output = output.append(vow[l]);
				}
			}
		}
		System.out.println(output);
	}
}
