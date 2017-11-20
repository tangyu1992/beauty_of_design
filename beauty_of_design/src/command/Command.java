/**
 * 
 */
package command;

/**
 * 命令的接口，所有的命令都应该实现该接口，实现类内部自己维护一个任务的执行者，当收到命令的时候交由该执行者执行，其实也就是代理该对象做一部分事情
 * 
 * @author tangyu
 * @date 2017年11月20日 下午6:33:27
 */
public interface Command {
	public void exec(String command);
}
