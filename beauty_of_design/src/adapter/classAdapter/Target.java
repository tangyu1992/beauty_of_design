/**
 * 
 */
package adapter.classAdapter;

/**
 * 适配之后需要实现的接口
 * 
 * @author tangyu
 * @date 2017年11月9日 下午6:09:37
 */
public interface Target {
	public void say();

	/****
	 * 这个不是必须的，只是为了显现出差别
	 */
	public void sayBySelf();
}
