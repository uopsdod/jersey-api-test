package entity;

import java.util.ArrayList;
import java.util.List;

public class MyStuff {
	private String name;
	private String nickname;
	private int age;
	private List<Coin> coins;
	
	public MyStuff() {
	}
	
	public MyStuff(String name, String nickname, int age) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.age = age;
		
		this.coins = new ArrayList<>();
		this.coins.add(new Coin(5,"five"));
		this.coins.add(new Coin(1,"one"));
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public List<Coin> getCoins() {
		return coins;
	}

	public void setCoins(List<Coin> coins) {
		this.coins = coins;
	}
	
	
}
