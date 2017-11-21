/**
 * 
 */
package state;

/**
 * @author tangyu
 * @date 2017年11月21日 下午3:47:38
 */
public class StateTest {
	public static void main(String[] args) {
		State state = new State();
		Context context = new Context(state);

		// 设置在线
		state.online();
		context.method();

		// 设置离线
		state.offline();
		context.method();
	}
}
