public class Solution {
    public static TreeNode<Integer> constructTree(ArrayList<Integer> arr, int low, int high) {
        if (low > high) {
            return null;
        }

        int mid = (low + high) / 2;
        TreeNode<Integer> root = new TreeNode<>(arr.get(mid));

        root.left = constructTree(arr, low, mid - 1);
        root.right = constructTree(arr, mid + 1, high);

        return root;
    }

    public static TreeNode<Integer> sortedArrToBST(ArrayList<Integer> arr, int n) {
        return constructTree(arr, 0, n - 1);
    }
}
