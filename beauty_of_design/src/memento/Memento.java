/**
 * 
 */
package memento;

/**
 * 备忘录模式，其实就是存储某个实例的某个时刻的状态，回头可以进行一些恢复操作或者取值操作
 * 
 * @author tangyu
 * @date 2017年11月21日 下午3:27:17
 */
public class Memento {
	private String value;

	public Memento(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
