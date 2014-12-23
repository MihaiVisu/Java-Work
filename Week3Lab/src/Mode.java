
public class Mode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dataset = new int [args.length];
		int[] count = new int[10];
		
		for (int i = 0; i < dataset.length; i++) {
			dataset[i]=Integer.parseInt(args[i]);
			count[dataset[i]]++;
		}
		int nmax=-1;
		int mode=0;
		for (int i = 0; i < count.length; i++) {
			System.out.println("["+Integer.toString(i)+"s: "+Integer.toString(count[i])+"]");
			if(count[i]>nmax){
				nmax=count[i];
				mode=i;
			}
		}
		System.out.println(mode);
	}

}
