package java.basic;

/**
 * 
 * 与或运算实现位向量,编程珠玑习题1.6第二题,每一个整型数可以存储32个位分别用于表示32个数.
 * @author ThinkPad
 *
 */
public class BitVector {

	private final int bitPerWord = 32;
	private final int digital = 5;
	private final int mask = 0x1F;
	private int maxValue;
	private int[] bitsArray;
	
	public void set(int i){
		bitsArray[i >> digital] |= (1 << (i & mask));
	}
	
	public void clear(int i){
		bitsArray[i >> digital] &= ~(i << (i & mask));
	}
	
	public int get(int i){
		return bitsArray[i >> digital] & (1 << (i & mask));
	}
	
	public BitVector(int max){
		this.maxValue = max;
		bitsArray = new int[1+maxValue/bitPerWord];
	}
	
    public BitVector(){
    	this.maxValue = Integer.MAX_VALUE;
    	bitsArray = new int[1+maxValue/bitPerWord];
    }
}
