package hierarchical_Inheritance;

public class HierarchicalClassD extends HierarchicalClassA {
	
	
	// classD inherit property of class A, this is single inheritance
	// so here in this package we have performed hybrid inheritance, single as well as multilevel inheritance
	
	public void HierarchicalSample() {
		System.out.println("Hierarchical Sample");
	}
	public static void main(String[] args) {
		
		HierarchicalClassD obj =new HierarchicalClassD();
		obj.Hierarchicaltest();
	}
}
