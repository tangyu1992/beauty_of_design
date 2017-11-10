/**
 * 
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式，常用于一些数据机构的表达，如树，二叉树等等
 * 
 * @author tangyu
 * @date 2017年11月10日 上午9:59:35
 */
public class Tree {
	private String name;
	private List<Tree> chindrens;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Tree> getChindrens() {
		return chindrens;
	}

	public void setChindrens(List<Tree> chindrens) {
		this.chindrens = chindrens;
	}

	@Override
	public String toString() {
		return "Tree [name=" + name + ", chindrens=" + chindrens + "]";
	}

	public static void main(String[] args) {
		Tree root = new Tree();
		root.setName("root");
		final List<Tree> childrens = new ArrayList<Tree>();
		final Tree children = new Tree();
		children.setName("children");
		childrens.add(children);
		root.setChindrens(childrens);
		System.out.println(root);
	}

}
