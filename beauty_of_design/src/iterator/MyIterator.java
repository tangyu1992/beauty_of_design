/**
 * 
 */
package iterator;

/**
 * @author tangyu
 * @date 2017年11月16日 下午3:20:08
 */
public class MyIterator implements Iterator {
	private Collection collection;
	private int currentIndex = -1;

	/**
	 * @param collection
	 */
	public MyIterator(Collection collection) {
		super();
		this.collection = collection;
	}

	@Override
	public Object previous() {
		if (currentIndex > 1) {
			currentIndex--;
			return collection.get(currentIndex);
		}
		return null;
	}

	@Override
	public Object next() {
		if (currentIndex < collection.size() - 1) {
			currentIndex++;
			return collection.get(currentIndex);
		}
		return null;
	}

	@Override
	public boolean hasNext() {
		return currentIndex < collection.size() - 1;
	}
}
