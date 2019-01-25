package org.springframework.study;

/**
 * @author: zhangwei
 * @date: 21:43/2018-12-29
 */
public class Bean {

	public Bean() {
		System.out.println("init Bean");
	}

	private Wrapp wrapp;

	private String name = "a";

	public String getName() {
		return wrapp.wrap(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public Wrapp getWrapp() {
		return wrapp;
	}

	public void setWrapp(Wrapp wrapp) {
		this.wrapp = wrapp;
	}
}
