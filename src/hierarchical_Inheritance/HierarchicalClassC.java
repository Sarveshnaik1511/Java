package hierarchical_Inheritance;

public class HierarchicalClassC extends HierarchicalClassB {
	
	// here class c gets a property of classA, B and C so this is multilevel inheritance
	
	public void HierarchicalDemo() {
		System.out.println("Hierarchical Demo");
	}
	public static void main(String[] args) {
		HierarchicalClassC obj =new HierarchicalClassC();
		obj.HierarchicalPractice();
		obj.Hierarchicaltest();
		obj.HierarchicalDemo();
	}
}
