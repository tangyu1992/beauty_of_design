/**
 * 
 */
package memento;

/**
 * @author tangyu
 * @date 2017年11月21日 下午3:05:05
 */
public class Original {
	private String value;

	/**
	 * @param value
	 */
	public Original(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Memento createMemento() {
		return new Memento(value);
	}

	public void restoreMemento(Memento memento) {
		this.value = memento.getValue();
	}
}
