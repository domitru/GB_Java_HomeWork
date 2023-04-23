package HomeWork_OOP_07;

import HomeWork_OOP_07.controllers.UserController;
import HomeWork_OOP_07.logger.Decorator;
import HomeWork_OOP_07.logger.LoggerTerminal;
import HomeWork_OOP_07.model.FileOperation;
import HomeWork_OOP_07.model.FileOperationImpl;
import HomeWork_OOP_07.model.Repository;
import HomeWork_OOP_07.model.RepositoryFile;
import HomeWork_OOP_07.utils.Validate;
import HomeWork_OOP_07.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("C:/SchoolGeekBrains/GB_Java_HomeWork/src/main/java/HomeWork_OOP_07/users.txt");
        // Repository repository = new RepositoryFile(fileOperation);
        Repository repository = new Decorator(new RepositoryFile(fileOperation), new LoggerTerminal());
        Validate validate = new Validate();
        UserController controller = new UserController(repository, validate);
        ViewUser view = new ViewUser(controller, validate);

        view.run();
    }
}
