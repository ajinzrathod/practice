import java.util.Stack;

class OperatorPrecedenceParser {
    public static class TreeNode {
        char data;
        TreeNode left, right;

        TreeNode(char value) {
            data = value;
            left = right = null;
        }
    }

    private static short getPriority(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;

            case '/':
            case '*':
                return 2;

            default:
                return 0;
        }
    }

    private static boolean isOperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/');
    }

    private static boolean isOperand(char ch) {
        return ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'));
    }

    private static boolean isOpeningBracket(char ch) {
        return (ch == '(' || ch == '{' || ch == '[');
    }

    private static boolean isClosingBracket(char ch) {
        return (ch == ')' || ch == '}' || ch == ']');
    }

    private static char getPair(char bracket) {
        switch (bracket) {
            case '(':
                return ')';
            case '{':
                return '}';
            case '[':
                return ']';
            case ')':
                return '(';
            case '}':
                return '{';
            case ']':
                return '[';
            default:
                return (char) 0;
        }
    }

    private static String toPostFix(String equation) {
        Stack<Character> operators = new Stack<>();
        String postfix = "";
        for (int i = 0; i < equation.length(); i++) {
            char ch = equation.charAt(i);

            if (isOpeningBracket(ch))
                operators.push(ch);
            else if (isClosingBracket(ch)) {
                char op = operators.pop();
                char openingPair = getPair(ch);

                while (op != openingPair) {
                    postfix += op;
                    op = operators.pop();
                }
            } else if (isOperator(ch)) {
                short previousPriority = operators.isEmpty() ? 0 : getPriority(operators.peek());
                short currentPriority = getPriority(ch);

                while (previousPriority != 0 && previousPriority >= currentPriority) {
                    postfix += operators.pop();
                    previousPriority = operators.isEmpty() ? 0 : getPriority(operators.peek());
                }

                operators.push(ch);
            } else if (isOperand(ch))
                postfix += ch;
        }

        while (!operators.isEmpty())
            postfix += operators.pop();

        return postfix;
    }

    private static TreeNode getExpressionTree(String equation) {
        Stack<TreeNode> stack = new Stack<>();
        for (int i = 0; i < equation.length(); i++) {
            char ch = equation.charAt(i);

            if (isOperator(ch)) {
                TreeNode operand2 = stack.pop();
                TreeNode operand1 = stack.pop();
                TreeNode parentNode = new TreeNode(ch);
                parentNode.left = operand1;
                parentNode.right = operand2;

                stack.push(parentNode);
            } else if (isOperand(ch))
                stack.push(new TreeNode(ch));
        }

        return stack.pop();
    }

    public static void inOrder(TreeNode root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }

    public static void postOrder(TreeNode root) {
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }

    public TreeNode parse(String equation) {
        return getExpressionTree(toPostFix(equation));
    }
}

class OPTest {
    public static void main(String[] args) {
        String equation = "a + b * c";
        OperatorPrecedenceParser a = new OperatorPrecedenceParser();
        OperatorPrecedenceParser.TreeNode tree = a.parse(equation);

        System.out.println("Equation: " + equation);
        System.out.print("InOrder Traversal: ");
        OperatorPrecedenceParser.inOrder(tree);

        System.out.print("\nPostOrder Traversal: ");
        OperatorPrecedenceParser.postOrder(tree);
        System.out.println();

    }
}
