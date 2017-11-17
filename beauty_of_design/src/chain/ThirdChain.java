/**
 * 
 */
package chain;

/**
 * @author tangyu
 * @date 2017年11月17日 下午5:26:06
 */
public class ThirdChain {
	LastChain lastChain() {
		System.out.println("I'm third chain,I'm calling last chain");
		return new LastChain();
	}
}
