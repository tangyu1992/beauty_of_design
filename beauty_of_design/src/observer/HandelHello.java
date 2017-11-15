/**
 * 
 */
package observer;

/**
 * @author tangyu
 * @date 2017年11月15日 下午6:23:00
 */
public class HandelHello implements Handel {
	@Override
	public String handelType() {
		return "hello";
	}

	@Override
	public void handel() {
		System.out.println("hello！nice to meet you！");
	}
}
