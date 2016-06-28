package cn.edu.nuc.io;

import java.io.Serializable;
import java.util.Map;

public class Cart implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2626424587708738206L;
	
	private String name;
	
	public Cart(){}
	public Cart(String name){
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	/*private Map<Integer, Item> 
	
	add(Goods g, int num){
		
		
		map.get(gid)
	}*/

}
