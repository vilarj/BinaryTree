package lab9BinaryTree;

import java.util.Iterator;

public class TreeEvaluator {

	public static void main(String[] args) {

		BinaryTreeInterface<String> emptyTree = new BinaryTree <>();


		BinaryTreeInterface<String> lTree = new BinaryTree <>();
		lTree.setTree("L");
		BinaryTreeInterface<String> iTree = new BinaryTree <>();
		iTree.setTree("I", emptyTree, lTree);
		BinaryTreeInterface<String> hTree = new BinaryTree <>();
		hTree.setTree("H");
		BinaryTreeInterface<String> dTree = new BinaryTree <>();
		dTree.setTree("D", hTree, iTree);
		BinaryTreeInterface<String> eTree = new BinaryTree <>();
		eTree.setTree("E");
		BinaryTreeInterface<String> bTree = new BinaryTree <>();
		bTree.setTree("B", dTree, eTree);

		BinaryTreeInterface<String> kTree = new BinaryTree <>();
		kTree.setTree("K");
		BinaryTreeInterface<String> jTree = new BinaryTree <>();
		jTree.setTree("J");
		BinaryTreeInterface<String> gTree = new BinaryTree <>();
		gTree.setTree("G", jTree, kTree);
		BinaryTreeInterface<String> fTree = new BinaryTree <>();
		fTree.setTree("F");
		BinaryTreeInterface<String> cTree = new BinaryTree <>();
		cTree.setTree("C", fTree, gTree);

		BinaryTreeInterface<String> aTree = new BinaryTree <>();
		aTree.setTree("A", bTree, cTree);

		System.out.println("The height of this tree is: " + aTree.getHeight());

		System.out.println("The number of nodes of this tree is: " + aTree.getNumberOfNodes());

		System.out.println("\n\nIteration of this tree with Preorder Iterator:");

		Iterator<String> it = aTree.getPreorderIterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("\n\nIteration of this tree with Postorder Iterator:");
		it = aTree.getPostorderIterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n\nIteration of this tree with Inorder Iterator:");
		it = aTree.getInorderIterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("\n\nIteration of this tree with Levelorder Iterator:");
		it = aTree.getLevelorderIterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n\nPlease scroll up to see tree information and iterations");
	}

}
