/**
 * 
 */
package observer;

/**
 * @author tangyu
 * @date 2017年11月15日 下午6:27:11
 */
public class ObserverTest {
	public static void main(String[] args) {
		Handel hello = new HandelHello();
		Handel bye = new HandelBye();
		Observer.addHandel(hello);
		Observer.addHandel(bye);
		Observer.handel("hello");
		Observer.handel("bye");
	}
}
