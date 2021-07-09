To get git to stop telling you that, you've modified a local file, but don't want to push it up. (ie. application.properties)

Use the command: `git update-index --skip-worktree`

This is used when you want to modify files managed by git locally, but do not want git to manage that change.

The command: `git update-index --assume-unchanged`

is used to ignore files that do not need to change locally (or should not change).
This is useful for ignoring unecessary files.