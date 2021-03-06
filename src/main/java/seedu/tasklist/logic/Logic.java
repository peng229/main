package seedu.tasklist.logic;

import javafx.collections.ObservableList;
import seedu.tasklist.logic.commands.CommandResult;
import seedu.tasklist.logic.commands.exceptions.CommandException;
import seedu.tasklist.model.task.ReadOnlyTask;

/**
 * API of the Logic component
 */
public interface Logic {
    /**
     * Executes the command and returns the result.
     * @param commandText The command as entered by the user.
     * @return the result of the command execution.
     * @throws CommandException If an error occurs during command execution.
     */
    CommandResult execute(String commandText) throws CommandException;

    /** Returns the filtered list of persons */
    ObservableList<ReadOnlyTask> getFilteredTaskList();

}
