/**
 * 
 */
package strategy;

/**
 * 策略模式，顾名思义，根据入参的不同性质，实现不同的调用，比如说总价在多少多少之间打几折，这样的场景，就可以用到，实现方式：实体类全部实现
 * 同一个接口，在实现的方法里面写入自己的逻辑，具体的调用是根据开发者自己决定的
 * 
 * @author tangyu
 * @date 2017年11月15日 下午5:49:29
 */
public interface CheckoutOperation {
	double checkout(double amount);
}
