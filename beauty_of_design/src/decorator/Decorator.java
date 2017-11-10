/**
 * 
 */
package decorator;

/**
 * 装饰的类
 * 
 * @author tangyu
 * @date 2017年11月9日 下午10:05:20
 */
public class Decorator implements CommonInterface {
	private Source source;

	/**
	 * @param source
	 */
	public Decorator(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void say() {
		System.out.println("I'm Decorator,I can jump before say hello!");
		source.say();
	}

	/****
	 * 这里也可以通过set进行注入，形式而已
	 * 
	 * @param source
	 */
	public void setSource(Source source) {
		this.source = source;
	}

	public static void main(String[] args) {

		final Source source = new Source();
		final Decorator decorator = new Decorator(source);
		decorator.say();
	}

}
