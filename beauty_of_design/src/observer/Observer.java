/**
 * 
 */
package observer;

import java.util.HashMap;
import java.util.Map;

/**
 * 观察者模式最重要的就是观察者这个类，它可以理解为一个容器，所有的针对被观察的事项的处理类都会托管到它本身，然后事项过来的时候，通过处理类的处理条件
 * 判断并且取出来这个处理类，然后所有的事项都可以被对应的处理类处理了，这个模式特别实用，常用在事件变化以及一些状态机改变的环境中
 * 
 * @author tangyu
 * @date 2017年11月15日 下午6:21:01
 */
public class Observer {
	private static Map<String, Handel> handels = new HashMap<>();

	public static void addHandel(Handel handel) {
		handels.put(handel.handelType(), handel);
	}

	public static void handel(String handelType) {
		final Handel handel = handels.get(handelType);
		if (null != handel) {
			handel.handel();
		}
	}
}
