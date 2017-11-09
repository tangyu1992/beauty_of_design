package singleton;

/****
 * 单例模式，jvm整个生命周期只会创建一个该类的实体
 * 
 * @author tangyu
 * @date 2017年11月9日 下午5:17:16
 */
public class Singleton {
	private static Singleton instance = null;

	/****
	 * 私有实例方法，避免外部创建对象
	 */
	private Singleton() {

	}

	/****
	 * 为了线程安全和性能，在getInstance的时候如果发现内部的实体为空才开始加锁实例化
	 */
	private static synchronized void syncInit() {
		if (instance == null) {
			instance = new Singleton();
		}
	}

	/****
	 * 获取实体
	 * 
	 * @return
	 */
	public static Singleton getInstance() {
		if (instance == null) {
			syncInit();
		}
		return instance;
	}

	/****
	 * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
	 */
	public Object readResolve() {
		return getInstance();
	}
}
