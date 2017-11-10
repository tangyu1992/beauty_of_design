/**
 * 
 */
package proxy;

/**
 * @author tangyu
 * @date 2017年11月9日 下午10:18:52
 */
public class Proxy implements ProxyInterface {
	/****
	 * 被代理的对象，在构造的时候创建其对象
	 */
	private Source source;

	/**
	 * 
	 */
	public Proxy() {
		super();
		this.source = new Source();
	}

	@Override
	public void say() {
		System.out.println("before say,I can do something!");
		source.say();
		System.out.println("also,after say,I can do something too!");
	}

	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		proxy.say();
	}
}
