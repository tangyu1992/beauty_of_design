/**
 * 
 */
package adapter.interfaceAdapter;

/**
 * @author tangyu
 * @date 2017年11月9日 下午6:31:16
 */
public class InterfaceAdapter extends MiddleRole {
	@Override
	public void sleep() {
		System.out.println("haha!I'm InterfaceAdapter,I'm sleeping!");
	}

	public static void main(String[] args) {
		SourceInterface interfaceAdapter = new InterfaceAdapter();
		interfaceAdapter.say();
		interfaceAdapter.jump();
		interfaceAdapter.sleep();
	}
}
