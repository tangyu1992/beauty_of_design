/**
 * 
 */
package bridge;

/**
 * 其实感觉桥接，代理和适配器等模式的核心思想都差不多，都是要么共同实现同一个接口，要么就是持有某些对象的实体，自己增加一部分逻辑，在实际开发中
 * 个人感觉不应该分的那么细，灵活运用就可以了，不要掉进设计模式的陷阱里面。
 * 
 * @author tangyu
 * @date 2017年11月10日 上午9:47:26
 */
public class Animal {
	private BridgeInterface bridgeInterface;

	public void say() {
		this.bridgeInterface.say();
	}

	public void setBridgeInterface(BridgeInterface bridgeInterface) {
		this.bridgeInterface = bridgeInterface;
	}
}
