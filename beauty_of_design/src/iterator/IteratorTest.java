/**
 * 
 */
package iterator;

/**
 * @author tangyu
 * @date 2017年11月16日  下午3:27:44
 */
public class IteratorTest {
public static void main(String[] args) {
	Collection mycCollection=new MyCollection();
	Iterator iterator=mycCollection.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
		
	}
}
}
