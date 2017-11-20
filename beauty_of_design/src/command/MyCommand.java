/**
 * 
 */
package command;

/**
 * @author tangyu
 * @date 2017年11月20日 下午6:35:06
 */
public class MyCommand implements Command {
	private Executer executer;

	public MyCommand(Executer executer) {
		this.executer = executer;
	}

	@Override
	public void exec(String command) {
		executer.execute(command);

	}

}
