public class inorder_traversal {
    public static class Node{
        int data ;
        Node right ;
        Node left ;
        Node(int data){
            this.data= data;
            this.left = null;
            this.right = null;

        }
    }
        public static class binarytree{
            static int ind = -1;
            public static Node buildtree(int [] nodes ){
                ind++;
                if(nodes[ind]==-1){
                    return null;
                }
                Node newNode = new Node(nodes[ind]);
                newNode.left= buildtree(nodes);
                newNode.right= buildtree(nodes);
                return newNode;
            }
        }
            public static void inorder(Node root){
                if(root == null){
                    return  ;
                }
                inorder(root.left);
                System.out.print(root.data+" ");
                inorder(root.right);

            }   
    
    public static void main(String[]args){
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree tree = new binarytree();
        Node root = tree.buildtree(nodes);
        inorder(root);
    }
}
