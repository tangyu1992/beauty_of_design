/**
 * 
 */
package chain;

/**
 * 责任链模式，就是说当前对象，持有或者能够自身创造出另外一个对象，通过某个方法能够get到持有或者创建的对象，调用其方法，我们经常看到的api链式调用
 * 就是这样的原理
 * 
 * @author tangyu
 * @date 2017年11月17日 下午5:25:38
 */
public class FirstChain {
	SecondChain secondChain() {
		System.out.println("I'm first chain,I'm calling second chain");
		return new SecondChain();
	}
}
