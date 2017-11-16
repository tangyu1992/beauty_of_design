/**
 * 
 */
package iterator;

/**
 * 迭代子模式，原理就是，一个持有集合对象的类A，可以调用自身的某一个方法得到一个自定义的迭代器类B，迭代器类B持有A的实例，通过操作A内部的集合元素
 * 实现一系列的方法定义
 * 
 * @author tangyu
 * @date 2017年11月16日 下午3:17:57
 */
public interface Collection {
	public Iterator iterator();

	public Object get(int i);

	public int size();
}
