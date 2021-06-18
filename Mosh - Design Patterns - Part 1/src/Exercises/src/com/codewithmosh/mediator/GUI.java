package Exercises.src.com.codewithmosh.mediator;

public class GUI {
    private Button button = new Button();
    private CheckBox checkBox = new CheckBox();
    private TextBox usernameTextBox = new TextBox();
    private TextBox passwordTextBox = new TextBox();

    public GUI () {
        checkBox.attachEventHandler(this::checkValidForm);
        usernameTextBox.attachEventHandler(this::checkValidForm);
        passwordTextBox.attachEventHandler(this::checkValidForm);

    }

    public void simulateInteraction() {
        usernameTextBox.setContent("User 1");
        passwordTextBox.setContent("****");
        System.out.println(button.isEnabled());
        checkBox.setChecked(true);
        System.out.println(button.isEnabled());
        passwordTextBox.setContent("");
        System.out.println(button.isEnabled());
    }

    private void checkValidForm () {
        String username = usernameTextBox.getContent();
        String password = passwordTextBox.getContent();
        boolean isChecked = checkBox.isChecked();
        boolean enabled = username != "" && password != "" && isChecked;
        button.setEnabled(enabled);
    }
}
