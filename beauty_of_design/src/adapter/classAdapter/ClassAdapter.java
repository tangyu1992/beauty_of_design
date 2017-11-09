/**
 * 
 */
package adapter.classAdapter;

/**
 * 最终的适配器，原理就是：集成被适配的类，实现target类，就自动有被适配的类的方法了， 并且自己可以拓展其他的方法，“适配”这个词应该就是这么理解的
 * 
 * @author tangyu
 * @date 2017年11月9日 下午6:11:01
 */
public class ClassAdapter extends Source implements Target {

	@Override
	public void sayBySelf() {
		System.out.println("hello!I'm ClassAdapter!");

	}

	public static void main(String[] args) {
		Target adapter = new ClassAdapter();
		adapter.say();
		adapter.sayBySelf();
	}
}
