/**
 * 
 */
package factory.test;

import factory.ComputerFactory;
import factory.Factory;
import factory.MobilePhoneFactory;
import factory.model.Product;

/**
 * 工厂模式测试类
 * 
 * @author tangyu
 * @date 2017年11月9日 下午5:00:36
 */
public class FactoryTest {
	public static void main(String[] args) {
		/******
		 * 这里使用Factory接口指代不同的工厂类，好处就在于，以后如果还需要一个键盘工厂类或者其他工厂类，
		 * 只需要增加一个键盘实体（实现product接口）和键盘工厂类就可以了，对老代码的侵入性很小甚至没有
		 */
		Factory computerFactory = new ComputerFactory();// 生产电脑的工厂类
		Factory mobileFactory = new MobilePhoneFactory();// 生产手机的工厂类
		/****
		 * 生产手机和电脑，这里也用Product接口指代电脑和手机，咱们不用关心他真正的实体是什么
		 */
		Product mobile = mobileFactory.provide();
		Product computer = computerFactory.provide();
		/****
		 * 测试工厂类生产的产品的工作
		 */
		mobile.work();
		computer.work();
	}
}
