/**
 * 
 */
package strategy;

/**
 * @author tangyu
 * @date 2017年11月15日 下午5:59:43
 */
public class CustomerCheckoutStrategy implements CheckoutOperation {

	@Override
	public double checkout(double amount) {
		System.out.println(
				"you are just a customer,sorry,we cant give you any discount...,now you have to pay " + amount);
		return amount;
	}

}
