/**
 * 
 */
package strategy;

/**
 * @author tangyu
 * @date 2017年11月15日 下午6:01:30
 */
public class StrategyTest {
	public static void main(String[] args) {
		double totalAmount = 5000;
		final CheckoutOperation customerCheckoutStrategy = new CustomerCheckoutStrategy();
		final CheckoutOperation vipCheckoutStrategy = new VipCheckoutStrategy();
		customerCheckoutStrategy.checkout(totalAmount);
		vipCheckoutStrategy.checkout(totalAmount);
	}
}
