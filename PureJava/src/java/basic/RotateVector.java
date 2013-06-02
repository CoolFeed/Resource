package java.basic;

public class RotateVector {

	public char[] array;
	public char[][] matrix;
	char[][] destMatrix;
	/**
	 * 杂技算法, 考虑是否可以节省done数组，位向量？
	 */
	public void acrobaticsRotate(int pos){
		if(array == null || array.length == 0){
			return ;
		}
		
		if(pos <1 || pos > array.length){
			return;
		}
		
		boolean[] done = new boolean[pos];
		int totalSwap = 0;
		for(int i=0;i<done.length; i++){
			done[i]= false;
		}
		for(int i=0; i<done.length; i++){
			if(!done[i]){
				done[i] = true;
				char temp = array[i];
				int startIndex = i;
				array[i] = array[(i+pos)%array.length];
				i = (i + pos)%array.length;
				while(i != startIndex && totalSwap < array.length){
					array[i] = array[(i+pos)%array.length];
					i = (i + pos)%array.length;
					if(i < pos){
						done[i] = true;
					}
					totalSwap = totalSwap + 1;
				}
				array[(i-pos+array.length)%array.length] = temp;
				if( totalSwap == array.length){
					break;
				}
			}
		}
	}
	
	/**
	 * 求逆算法
	 */
	public void oppositeRotate(int startIndex, int endIndex){
		if((endIndex < startIndex)|| (startIndex < 0) || (endIndex < 0))
			return;
		if(array == null || array.length <2)
			return;
		for(int i=startIndex; i<=(endIndex + startIndex)/2; i++){
			char temp = array[i];
			array[i] = array[endIndex + startIndex-i];
			array[endIndex + startIndex - i] = temp;
		}
	}
	public void oppositeRotate(int pos){
		if(pos<0 || pos > array.length){
			return;
		}
		oppositeRotate(0,array.length-1);
		oppositeRotate(0,array.length-1-pos);
		oppositeRotate(array.length-pos,array.length-1);
	}
	
	/**
	 * 扩展1，把形状如abc的字串成为cba,其中a,b,c分别为子串
	 */
	public void rotateABC(int pos1, int pos2){
		if((pos2 < pos1)||(pos1<0)||(pos2>array.length -1)){
			return;
		}
		this.oppositeRotate(0, array.length -1);
		this.print();
		this.oppositeRotate(0,array.length-1-pos2);
		this.print();
		this.oppositeRotate(array.length-1-pos2+1,array.length-1-pos1);
		this.print();
		this.oppositeRotate(array.length-pos1,array.length-1);
		this.print();
	}
	
	/**
	 * 扩展2，把矩阵旋转90度
	 */
	public void rotateMatrix(){
		if((matrix == null) || (matrix.length == 0) || matrix[0] == null || matrix[0].length == 0){
			return ;
		}
		destMatrix = new char[matrix[0].length][matrix.length];
		for(int i=0;i< matrix[0].length;i++){
			for(int j=0;j<matrix.length;j++){
				destMatrix[i][j]=' ';
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				destMatrix[matrix[0].length-j-1][i] = matrix[i][j];
			}
		}
		return ;
	}
	
	/**
	 * 扩展2.1,用一维表示二维,如何旋转
	 */
	public void rotateMatrix2(int m, int n){
		if(array == null || array.length == 0 || m*n != array.length){
			return;
		}
		boolean[] done = new boolean[array.length];
		
		for(int i=0;i<done.length;i++){
			done[i] = false;
		}
		
		int totalCount = 0, curr=0,i,j,nextPos,startPos=0;
		char lastValue = array[curr],temp;
		i = curr / n;
		j = curr % n;
		nextPos = ((n - 1 - j) * m + i) % array.length;
		while(totalCount < array.length){
			
			//TODO fix the bug
			i = curr / n;
			j = curr % n;
			if(!done[curr] && !done[nextPos]){
			   temp = array[nextPos];
			   array[nextPos] = lastValue;
			   done[nextPos] = true;
			   lastValue = temp;
			   curr = nextPos;
			   nextPos = ((n - 1 - j) * m + i) % array.length;
			   totalCount = totalCount +1;
			}
			else if(!done[curr]){
			   array[curr] = lastValue;
			   done[curr] = true;
			   curr = (curr + 1)%array.length;
			   lastValue = array[curr];
			   startPos = curr;
			}
		}
	}
	
	/**
	 * 扩展3, 循环输出矩阵
	 */
	public void rotateOutputMatrx(){
		//TODO
	}
	public void print(){
		if(array == null || array.length == 0){
			System.out.println("Empty array");
		}
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		System.out.println("---------------------------------");
	}
	
	public void printMatrix(){
		if(matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0){
			return;
		}
		for(int i=0;i<destMatrix.length;i++){
			for(int j=0;j<destMatrix[0].length;j++){
				System.out.print(destMatrix[i][j]);
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		RotateVector rv = new RotateVector();
		char[] data = {'a','b','c','d','e','f','g'};
		rv.array = data;
//		rv.acrobaticsRotate(1);
//		rv.print();
//		rv.acrobaticsRotate(2);
//		rv.print();
//		rv.acrobaticsRotate(5);
//		rv.print();
		
//		char[] data1 = {'a','b','c','d','e','f','g'};
//		rv.array = data1;
//		rv.print();
//		rv.oppositeRotate(6);
//		rv.print();
		
//		rv.array =data1;
//		rv.print();
//		rv.rotateABC(2, 5);
//		rv.print();
		
//		char[][] matrix = {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','m'}};
//		rv.matrix = matrix;
//		rv.rotateMatrix();
//		rv.printMatrix();
		char[] data2 = {'a','b','c',
				        'd','e','f',
				        'g','h','i',
				        'j','m','n'};
		/*
		 * result:
		 * 
		 * c f i n
		 * b e h m
		 * a d g j
		 */
		rv.array = data2;
		rv.print();
		rv.rotateMatrix2(4, 3);
		rv.print();
	}

}
