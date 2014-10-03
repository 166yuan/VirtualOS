package com.os.memory;

/**内存已分配表
 * @author chensiyuan
 *
 */
class Alloc_Table {
	private int index;//记录分配的起始坐标
	private int size;//记录分配的大小
	
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
