/**
 * 
 */
package facade;

/**
 * 外观模式的精髓就在于，外观类（核心）一定程度上代理了其他类的一些功能，并且在内部对这些功能进行了组装，这样对于程序的解耦是很好的实践
 * 
 * @author tangyu
 * @date 2017年11月9日 下午10:48:09
 */
public class Room {
	private Light light;
	private Power power;

	public Room() {
		super();
		this.light = new Light();
		this.power = new Power();
	}

	public void lightTheRoom() {
		power.start();
		light.start();
		System.out.println("the room is light now");
	}

	public void leaveRoom() {
		light.Stop();
		power.off();
		System.out.println("leaving the room");
	}
}
