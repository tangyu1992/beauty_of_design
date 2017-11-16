/**
 * 
 */
package iterator;

/**
 * @author tangyu
 * @date 2017年11月16日 下午3:19:16
 */
public class MyCollection implements Collection {
	private int[] numbers = { 1, 2, 3, 4, 5 };

	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		return numbers[i];
	}

	@Override
	public int size() {
		return numbers.length;
	}

}
