/**
 * 
 */
package state;

/**
 * @author tangyu
 * @date 2017年11月21日 下午3:43:50
 */
public class State {
	private String value;

	public String getValue() {
		return value;
	}

	public void online() {
		this.value = "online";
	}

	public void offline() {
		this.value = "offline";
	}

	public void methodOnline() {
		System.out.println("I'm online");
	}

	public void methodOffline() {
		System.out.println("I'm offline");
	}
}
