import java.util.Scanner;

class TreeNode {
    private char expression;
    private TreeNode leftNode, rightNode;

    public TreeNode() {
    }

    public TreeNode(char expression, TreeNode leftNode, TreeNode rightNode) {
        this.expression = expression;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public void postOrderTraversal() {
        if (this.leftNode != null)
            leftNode.postOrderTraversal();

        if (this.rightNode != null)
            rightNode.postOrderTraversal();

        System.out.print(this.expression);
    }
}

class RecursiveDescentParser {
    private String expressionString;
    private int indexInEquation = 0;

    public RecursiveDescentParser(String expressionString) {
        this.expressionString = expressionString;
        this.indexInEquation = 0;
    }

    public TreeNode proc_E() {
        TreeNode leftNode = null, rightNode = null;
        leftNode = proc_T();

        while (indexInEquation < expressionString.length() && expressionString.charAt(indexInEquation) == '+') {
            this.indexInEquation++;
            rightNode = proc_T();

            if (rightNode == null)
                return null;

            leftNode = new TreeNode('+', leftNode, rightNode);
        }
        return leftNode;
    }

    public TreeNode proc_T() {
        TreeNode leftNode = null, rightNode = null;
        leftNode = proc_V();

        while (indexInEquation < expressionString.length() && expressionString.charAt(indexInEquation) == '*') {
            this.indexInEquation++;
            rightNode = proc_V();

            if (rightNode == null)
                return null;

            leftNode = new TreeNode('*', leftNode, rightNode);
        }
        return leftNode;
    }

    public TreeNode proc_V() {
        if (indexInEquation < expressionString.length() && expressionString.charAt(indexInEquation) != '*'
                && expressionString.charAt(indexInEquation) != '+')
            return new TreeNode(expressionString.charAt(indexInEquation++), null, null);

        else {
            System.out.println("\nInvalid Expression!");
            return null;
        }
    }
}

public class RDTest {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Expression: ");
        String expression = scanner.nextLine();
        RecursiveDescentParser recursiveDescentParsing = new RecursiveDescentParser(expression);
        TreeNode rootNode;

        rootNode = recursiveDescentParsing.proc_E();

        if (rootNode != null) {
            rootNode.postOrderTraversal();
        }
    }
}
