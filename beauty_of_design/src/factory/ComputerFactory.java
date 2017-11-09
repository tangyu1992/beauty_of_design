/**
 * 
 */
package factory;

import factory.model.Computer;
import factory.model.Product;

/**
 * 生产电脑的工厂类
 * 
 * @author tangyu
 * @date 2017年11月9日 下午4:52:02
 */
public class ComputerFactory implements Factory {

	@Override
	public Product provide() {
		return new Computer();

	}

}
