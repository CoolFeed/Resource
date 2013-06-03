package gerry.java.basic;

/**
 * 
 * �������ʵ��λ����,�������ϰ��1.6�ڶ���,ÿһ�����������Դ洢32��λ�ֱ����ڱ�ʾ32����.
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
