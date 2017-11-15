/**
 * 
 */
package observer;

/**
 * @author tangyu
 * @date 2017年11月15日 下午6:23:12
 */
public class HandelBye implements Handel {

	@Override
	public String handelType() {
		return "bye";
	}

	@Override
	public void handel() {
		System.out.println("see you,bye!");
	}

}
