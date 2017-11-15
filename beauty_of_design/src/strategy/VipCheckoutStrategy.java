/**
 * 
 */
package strategy;

/**
 * @author tangyu
 * @date 2017年11月15日 下午5:57:01
 */
public class VipCheckoutStrategy implements CheckoutOperation {

	@Override
	public double checkout(double amount) {
		System.out.println("you are vip,have a fifty percent discount!you just need to pay " + amount * 0.5);
		return amount * 0.5;
	}

}
