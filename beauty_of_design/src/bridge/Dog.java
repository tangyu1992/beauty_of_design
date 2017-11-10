/**
 * 
 */
package bridge;

/**
 * @author tangyu
 * @date 2017年11月10日 上午9:45:20
 */
public class Dog implements BridgeInterface {

	@Override
	public void say() {
		System.out.println("Dog say:wang!");

	}

}
