/**
 * 
 */
package factory;

import factory.model.Product;

/**
 * 所有工厂类都需要实现此类，以便于在调用的地方使用这个接口代表任何工厂实现类（为了遵循开闭原则）
 * 
 * @author tangyu
 * @date 2017年11月9日 下午4:49:45
 */
public interface Factory {
	/****
	 * 工厂生产物品
	 */
	public Product provide();
}
