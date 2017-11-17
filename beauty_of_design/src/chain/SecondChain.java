/**
 * 
 */
package chain;

/**
 * @author tangyu
 * @date 2017年11月17日 下午5:25:51
 */
public class SecondChain {
	ThirdChain thirdChain() {
		System.out.println("I'm second chain,I'm calling third chain");
		return new ThirdChain();
	}
}
