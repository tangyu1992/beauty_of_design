/**
 * 
 */
package adapter.ObjectAdapter;

import adapter.classAdapter.Source;
import adapter.classAdapter.Target;

/**
 * 对象的适配器，这里只是将类的适配器稍微修改一下，有一个set方法，把需要适配的类的实体注入之后调用即可
 * 
 * @author tangyu
 * @date 2017年11月9日 下午6:17:29
 */
public class ObjectAdapter implements Target {
	private Source source = null;

	@Override
	public void say() {
		this.source.say();

	}

	@Override
	public void sayBySelf() {
		System.out.println("hello!I'm ObjectAdapter!");

	}

	public void setSource(Source source) {
		this.source = source;
	}

	public static void main(String[] args) {
		final Source source = new Source();
		final ObjectAdapter objectAdapter = new ObjectAdapter();
		objectAdapter.setSource(source);
		objectAdapter.say();
		objectAdapter.sayBySelf();
	}
}
