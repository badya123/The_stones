import java.util.List;

import com.company.controller.StoneController;
import com.company.entity.interfaces.IStone;

public class Application {
	
	public void start(StoneController controller) {
		List<IStone> stones = controller.getStones();
		int sum = 0;
		for(int i = 0; i < stones.size(); i++) {
			sum += stones.get(i).getPrice();
		}
		double weight = 0;
		for(int i = 0; i < stones.size(); i++) {
			weight += stones.get(i).getWeight();
		}
		System.out.println("Price of this necklace: " + sum);
		System.out.println("Weight of this necklace: " + weight);
	}
}
