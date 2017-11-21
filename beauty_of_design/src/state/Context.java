/**
 * 
 */
package state;

/**
 * 状态模式，主要有两个类配合完成，一个类记录事物的某个状态，另外一个类持有该状态的实例，并且向外部提供一个方法，调用时根据当前状态执行不同的逻辑
 * 
 * @author tangyu
 * @date 2017年11月21日 下午3:44:46
 */
public class Context {
	private State state;

	public Context(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void method() {
		if (state.getValue().equals("online")) {
			state.methodOnline();
		} else if (state.getValue().equals("offline")) {
			state.methodOffline();
		}
	}
}
