package org.springframework;

/**
 * @author: zhangwei
 * @date: 11:48/2018-12-30
 */
public class Wrapp {

	private String prefix = "+++";

	private String suffix = "---";


	public String wrap(String original){
		return prefix + original + suffix;
	}
}
