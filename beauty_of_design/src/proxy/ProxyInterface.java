/**
 * 
 */
package proxy;

/**
 * 代理模式，很重要的一种设计模式，跟装饰模式有点像，二者的区别为：代理模式，从类对象被创建的时候就已经确定被代理的是谁了，但是
 * 装饰模式是后续动态添加的，代理模式 被代理的类对外是隐藏的，后者不是
 * 
 * @author tangyu
 * @date 2017年11月9日 下午10:14:33
 */
public interface ProxyInterface {
	public void say();
}
