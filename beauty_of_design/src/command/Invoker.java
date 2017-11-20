/**
 * 
 */
package command;

/**
 * 调用命令的类
 * 
 * @author tangyu
 * @date 2017年11月20日 下午6:38:08
 */
public class Invoker {
	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public void invok(String commandString) {
		command.exec(commandString);
	}

	public static void main(String[] args) {
		Executer executer = new Executer();
		Command command = new MyCommand(executer);
		Invoker invoker = new Invoker(command);
		invoker.invok("find some food.");
	}
}
