/**
 * 
 */
package chain;

/**
 * @author tangyu
 * @date 2017年11月17日 下午5:33:12
 */
public class ChainTest {
	public static void main(String[] args) {
		new FirstChain().secondChain().thirdChain().lastChain().end();
	}
}
