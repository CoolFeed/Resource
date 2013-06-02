package java.basic;

public class Cycle3Game {

	int n = 50;
	int[] a= new int[n+1];
	
	public void init(){
		java.util.Random r = new java.util.Random();
		for(int i=0;i<n;i++){
			a[i+1] = i+1;
		}
	}
	
	public void printA(){
		for(int i=0;i<n;i++){
			System.out.printf("%-2d ",i+1);
		}
		System.out.println();
		for(int i=0;i<n;i++){
			System.out.print(a[i+1] + " ");
		}
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	public void planGame(){
		int leftNum = n;
		int startNum = 0;
		int count = 0;
		while(leftNum > 1){
			count = startNum;
			for(int i=1; i<=n;i++){
				if(a[i] > 0)
				{	count +=1;
					startNum +=1;
					if(((count)%3) == 0){
						a[i] = -1;
						startNum =0;
						leftNum--;
					}
				}
			}
			printA();
		}
	}
	public static void main(String[] args) {
		Cycle3Game g = new Cycle3Game();
		g.init();
		g.planGame();
		java.util.concurrent.atomic.AtomicLong aLong = null;
		java.util.concurrent.atomic.AtomicReference<Object> a= null;
		java.util.concurrent.ConcurrentHashMap<String, Object> chm = null;
		java.util.concurrent.CopyOnWriteArrayList<Object> cowlist = null;
		java.util.concurrent.ConcurrentSkipListMap<String, Object> cskipMap = null;
		java.util.Collections.emptyList();
		Boolean bool = null;
		
		
	}

}
