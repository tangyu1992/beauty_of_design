/**
 * 
 */
package decorator;

/**
 * 被装饰的类
 * 
 * @author tangyu
 * @date 2017年11月9日 下午10:04:09
 */
public class Source implements CommonInterface {

	@Override
	public void say() {
		System.out.println("I'm Source,I just can say:hello!");

	}

}
