public class Classement{

	public static void main(String[] arg){

		int tab[] = {60, 1, 24, 3, 45, 50, 8};
		int i = 0;
	//	int j = 0;
		int x;
		 
	//	while(i<tab.length){
		
			for(i=0; i<tab.length; i++){
                         //  System.out.println(i);	

				for(int j=i+1; j<tab.length; j++){
                                          	
					if(tab[i]>tab[j]){	
						x = tab[i];
						tab[i] = tab[j];
						tab[j] = x ;
					}
				}
				
			}

		for(i=0; i<tab.length; i++){

			System.out.print(tab[i]+" ");
		}

		System.out.println("une modification git1");
		
	//	}
	}	
}
