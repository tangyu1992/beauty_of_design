/**
 * 
 */
package memento;

/**
 * @author tangyu
 * @date 2017年11月21日 下午3:34:18
 */
public class Storage {
	private Memento memento;

	public Storage(Memento memento) {
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
