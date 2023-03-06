package seedu.address.logic.commands;

import seedu.address.model.Model;

public class CelebrateCommand extends Command{
    public static final String COMMAND_WORD = "celebrate";

    @Override
    public CommandResult execute(Model model) {
        return new CommandResult("＼(＾O＾)／");
    }
}
