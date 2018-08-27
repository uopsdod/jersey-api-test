package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bundle{
	private int count = 3;
	private List<MyStuff> stuffs;
	
	public Bundle() {
		this.stuffs = new ArrayList<>();
		this.stuffs.add(new MyStuff("sam","sss",20));
		this.stuffs.add(new MyStuff("tomm","ttt",30));
		this.stuffs.add(new MyStuff("Jane","jjj",10));
	}

	public List<MyStuff> getStuffs() {
		return stuffs;
	}

	public void setStuffs(List<MyStuff> stuffs) {
		this.stuffs = stuffs;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}
