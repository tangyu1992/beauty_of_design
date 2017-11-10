/**
 * 
 */
package flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * 享元模式，看名字不太好理解，但是它的核心就是：管理很多公用的资源，谁要来拿一个 就从自己管理的资源里面拿出来一个给他，不够的时候自己再想办法
 * 创建，或者让别人先等一会儿,jdbc等连接池就运用了享元模式
 * 
 * @author tangyu
 * @date 2017年11月10日 上午10:11:17
 */
public class Flyweight {
	/****
	 * 自己维护的单词
	 */
	private List<String> words;

	/**
	 * 
	 */
	public Flyweight() {
		super();
		this.words = new ArrayList<String>();
	}

	/****
	 * 实际开发中视情况决定该方法的权限以及实现
	 */
	public synchronized void addWord(String word) {
		this.words.add(word);
	}

	/****
	 * 实际开发中这个方法的逻辑可能会比较复杂
	 * 
	 * @return
	 */
	public synchronized String getWord() {
		if (words.size() > 0) {
			return words.remove(0);
		}
		return null;
	}
}
