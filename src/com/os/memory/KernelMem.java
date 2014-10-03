package com.os.memory;

/**内存管理系统部分，pcb区域，分配表
 * @author chensiyuan
 */
public class KernelMem {
	
	static int n=10;//内存最大pcb容量
	public static char[] memory = new char[1024];//模拟内存1gb
}
