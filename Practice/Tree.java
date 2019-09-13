public class Trees {
    public static void main(String[] args){
        Trees tree = new Trees();
        Node node = null;
        node = tree.insertNewNode(node, 28);
        node = tree.insertNewNode(node, 18);
        node = tree.insertNewNode(node, 10);
        node = tree.insertNewNode(node, 3);
        node = tree.insertNewNode(node, 9);
        node = tree.insertNewNode(node, 12);
        node = tree.insertNewNode(node, 13);
        
        int size  = size(node);
        System.out.println(size);
        
    }
    
    public Node createNewNode(int data){
        Node node = new Node(data);
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }
    
    public Node insertNewNode(Node node, int val){
        if(node == null){
            return createNewNode(val);
        }
        else if(node.data < val){
            node.right = insertNewNode(node.right, val);
        }
        else if(node.data > val){
            node.left = insertNewNode(node.left, val);
        }
        return node;
    }
    

    static boolean lookup(Node node, int target){
        if(node == null){
            return false;
        }
        
        else{
            if(target == node.data){
                System.out.println("Found 0!");
            }
            else{
              
                if(target < node.data){
                    return lookup((node.left), target);
                }
                else{
                    return lookup((node.right), target);
                }
            }  
        }
        
        return false;
    }
        
    static int size(Node node){
        int count = 0;
        if(node != null){
          return size(node.left) + 1 + size(node.right);
        }
        return 0;
    }
    
    public void inOrderTraverse(Node focus){
        if(focus != null){
            inOrderTraverse(focus.left);
            System.out.println(focus);
            inOrderTraverse(focus.right);
        }
    }
}

class Node{
    Node left;
    Node right;
    int data;
    
    Node(int data){
        this.data = data;
    }
    
    public String toString(){
        return "" + data;
    }
}