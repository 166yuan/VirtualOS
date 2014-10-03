package com.os.memory;

/**内存空闲表
 * @author 陈思远
 *
 */
public class Free_Table {
	private int index;//记录空闲区的起始坐标
	private int size;//记录空闲区的大小
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
}
