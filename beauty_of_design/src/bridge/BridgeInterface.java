/**
 * 
 */
package bridge;

/**
 * 桥接模式，核心就在于：多个类有一个共同实现的接口，然后会有一个“容器”的角色类，持有这个接口的实例，通过调用这个实例（这里就可能是这些类中间的某一种）
 * 的实现的方法，实现各种条件下的不同逻辑的调用，jdbc中，设置driverManager就是使用的桥接模式，“桥接”也大概是这样理解的
 * 
 * @author tangyu
 * @date 2017年11月10日 上午9:41:17
 */
public interface BridgeInterface {
	public void say();
}
