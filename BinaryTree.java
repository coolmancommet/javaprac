
import java.util.Scanner;
public class BinaryTree
{
  class Node
  {
    int key;
    Node left, right;
      Node (int item)
    {
      key = item;
      left = right = null;
    }
  }
  Node root;
  BinaryTree ()
  {
    root = null;
  }

  void insert (int k)
  {
    root = insertcorp (root, k);
  }
  Node insertcorp (Node root, int kay)
  {
    if (root == null)
      {
	root = new Node (kay);
	return root;

      }

    if (root.key < kay)
      {
	root.right = insertcorp (root.right, kay);
      }
    else if (root.key > kay)
      {
	root.left = insertcorp (root.left, kay);
      }

    return root;
  }
  // This method mainly calls InorderRec() 
  void inorder ()
  {
    inorderRec (root);
  }

  // A utility function to do inorder traversal of BST 
  void inorderRec (Node root)
  {
    if (root != null)
      {
	inorderRec (root.left);
	System.out.println (root.key);
	inorderRec (root.right);
      }
  }


  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    BinaryTree t = new BinaryTree ();
    int x;
    int s =0;
    while (s != 10)
      {
	System.out.println ("enter the next number:");
	x = sc.nextInt ();
	t.insert (x);
	s=s+1;
      }
    t.inorder ();
  }
}

