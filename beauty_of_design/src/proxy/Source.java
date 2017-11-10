/**
 * 
 */
package proxy;

/**
 * @author tangyu
 * @date 2017年11月9日 下午10:18:14
 */
public class Source implements ProxyInterface {

	@Override
	public void say() {
		System.out.println("I can say!");

	}

}
