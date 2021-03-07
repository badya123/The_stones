import com.company.controller.StoneController;
import com.company.data.PostgresDB;
import com.company.interfaces.IDB;

public class Main {
	public static void main(String[] args) {
		IDB idb = new PostgresDB();
		StoneController controller = new StoneController(idb);
		Application app = new Application();
		app.start(controller);
	}
}
