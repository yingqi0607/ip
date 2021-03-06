/**
 * Delete task according to command given
 */
public class DeleteCommand extends Command{
    int taskIndex;

    /**
     * DeleteCommand Constructor
     * @param taskIndex the index of the task to be deleted
     */
    public DeleteCommand(int taskIndex){
        super();
        this.taskIndex = taskIndex;
    }
    /**
     * Execute the command
     * @param inputTasks the list of tasks used
     * @param storage the storage used
     */
    public void execute(TaskList inputTasks, Storage storage, Ui ui){
        assert taskIndex > 0;
        inputTasks.deleteTask(taskIndex, ui);
        storage.writeToFile(inputTasks);
    }
}
