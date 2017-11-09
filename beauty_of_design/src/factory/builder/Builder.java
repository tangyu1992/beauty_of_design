/**
 * 
 */
package factory.builder;

import java.util.ArrayList;
import java.util.List;

import factory.ComputerFactory;
import factory.Factory;
import factory.MobilePhoneFactory;
import factory.model.Product;

/**
 * 建造者模式，跟工厂模式有点类似，区别就在于：工厂模式是生产单个产品，建造者模式可以根据自己的需求创建一批产品， 或者把一些产品组装起来（具体视业务而定）
 * 
 * @author tangyu
 * @date 2017年11月9日 下午5:37:10
 */
public class Builder {
	/****
	 * 简单写一个生产一个手机和一台电脑的建造方法，如果觉得不形象，可以自己按照工厂模式
	 * 实现一个键盘工厂类、显卡工厂类等等，最终组装一台电脑
	 * 
	 * @return
	 */
	public List<Product> buildComputerAndMobile() {
		Factory computerFactory = new ComputerFactory();// 生产电脑的工厂类
		Factory mobileFactory = new MobilePhoneFactory();// 生产手机的工厂类
		final List<Product> result = new ArrayList<Product>();
		result.add(computerFactory.provide());
		result.add(mobileFactory.provide());
		return result;
	}
}
