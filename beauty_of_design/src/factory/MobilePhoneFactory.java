package factory;

import factory.model.MobilePhone;
import factory.model.Product;

/****
 * 生产手机的工厂类
 * 
 * @author tangyu
 * @date 2017年11月9日 下午5:00:41
 */
public class MobilePhoneFactory implements Factory {

	@Override
	public Product provide() {
		return new MobilePhone();
	}

}
