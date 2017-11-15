/**
 * 
 */
package template;

/**
 * 模版方法模式，主要是针对于抽象类以及子类的调用关系，父类有多个方法，部分是实现乐的，并且在实现的方法里面调用了本身未实现的方法，子类实现了
 * 父类没有实现的方法之后，调用的时候子类实现的方法逻辑就可以被父类所调用，父类当中的未实现的方法，就可以理解为模版,也可以这么理解：子类创建对象
 * 之后，在调用的时候是把父类的一部分逻辑拿来自己用了，这个也可以称作为模版吧（个人理解）
 * 
 * @author tangyu
 * @date 2017年11月15日 下午6:12:40
 */
public abstract class Parent {
	public void eat() {
		System.out.println("I'm parent ,eat an apple!");
		run();
	}

	public abstract void run();
}
