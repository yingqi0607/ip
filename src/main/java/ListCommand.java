/**
 * present commands in a list
 */
public class ListCommand extends Command{
    /**
     * Execute the command
     * @param inputTasks the list of tasks used
     * @param storage the storage used
     */
    public void execute(TaskList inputTasks, Storage storage, Ui ui){
        inputTasks.showTaskList(ui);
        storage.writeToFile(inputTasks);
    }
}
