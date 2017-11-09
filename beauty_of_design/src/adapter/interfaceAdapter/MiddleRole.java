/**
 * 
 */
package adapter.interfaceAdapter;

/**
 * @author tangyu
 * @date 2017年11月9日 下午6:29:47
 */
public abstract class MiddleRole implements SourceInterface {
	public void say() {
		System.out.println("this is MiddleRole!I'm say!");
	}

	public void jump() {
		System.out.println("this is MiddleRole!I'm jump!");
	}

	public void sleep() {
		System.out.println("this is MiddleRole!I'm sleep!");
	}
}
