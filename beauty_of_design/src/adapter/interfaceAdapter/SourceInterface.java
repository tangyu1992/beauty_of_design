package adapter.interfaceAdapter;

/****
 * 接口的适配器，有的时候一个接口的方法可能会有特别大的一串，但是我们只是想实现某一个，这个时候就需要一个抽象类充当媒人，他来实现所有的，我们想改写的
 * 只需要集成这个媒人，重写我们想要改写的方法就可以了
 * 
 * @author tangyu
 * @date 2017年11月9日 下午6:27:06
 */
public interface SourceInterface {
	public void say();

	public void jump();

	public void sleep();
}
