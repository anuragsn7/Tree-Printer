
public class Test {
    
    public static void main(String[] args){
        TextNode root = new TextNode("abc");
        root.left = new TextNode("pq");          root.left.parent = root;
        root.right = new TextNode("ab");         root.right.parent = root;
        root.left.right = new TextNode("q");     root.left.right.parent = root.left;
        root.right.left = new TextNode("oye");   root.right.left.parent = root.right;
        
        System.out.println(TreePrinter.TreeString(root));
    }
}
