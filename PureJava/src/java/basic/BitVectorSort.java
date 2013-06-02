package java.basic;

/**
 * 位向量排序，O(n),O(n)时间空间复杂度，如何生成不重复的随机数？
 * @author ThinkPad
 *
 */
public class BitVectorSort {
	private int[] data;
	private int maxNum;
	public BitVector bitVector;
	
    public BitVectorSort(int maxNum, int count){
    	this.maxNum = maxNum;
    	this.data = new int[count];
    	this.bitVector = new BitVector(maxNum);
    }
    
    /*
     * 自己写的获取0~ceiling范围的的随机数，有可能重复
     */
	public int getRandNum(int ceiling){
		double ramdom = Math.random();
		int lastBit = 0, num = 0, iterator = (int)(Math.log10(ceiling)/Math.log10(2));
		while (iterator > 0) {
			ramdom = Math.random();
			if (ramdom > 0.5)
				lastBit = 1;
			else
				lastBit = 0;
			int temp_num = num << 1;
			num = temp_num;
			num |= lastBit;
			iterator--;
		}
		if(ceiling < num)
			num = getRandNum(ceiling);
		return num;
	}
	
	public void init(){
		for(int i = 0; i< data.length; i++){
			data[i] = getRandNum(maxNum);
			System.out.println(data[i]);
		}
		System.out.println("Inited.");
	}
	
	public void print(){
		for(int i=0;i<maxNum;i++){
			if(bitVector.get(i) > 0)
				System.out.println(i);
		}
	}
	public void sort(){
		for(int i=0;i<data.length;i++){
			bitVector.set(data[i]);
		}
		System.out.println("Sorted");
	}
	
	public static void main(String args[]){
		BitVectorSort bvs = new BitVectorSort(100,20);
		bvs.init();
		bvs.sort();
		bvs.print();
	}
}
