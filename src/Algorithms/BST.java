package Algorithms;

public class BST<Key extends Comparable<Key>, Value> {
    private Node root; // корень ДБП

    private class Node {
        private Key key;
        private Value val;
        private Node left, right;
        private int N;

        public Node(Key key, Value val, int N) {
            this.key = key; this.val = val; this.N = N;
        }

        public int size() {
            return size(root);
        }

        private int size(Node x) {
            if (x == null) return 0;
            else return x.N;
        }

        public Value get(Key key) {
            return get(root, key);
        }

        private Value get(Node x, Key key) {
            // Возвращает значение, связанное с ключом в поддереве с корнем x;
            // возвращает null, если ключ в поддереве с корнем x отсутствует.
            if(x == null) return null;
            int cmp = key.compareTo(x.key);
            if(cmp < 0) return get(x.left, key);
            else if (cmp > 0) return get(x.right, key);
            else return x.val;
        }

        public void put(Key key, Value val) {
            // Поиск ключа. Если найден, изменяется значение; если нет - увеличивается дерево.
            root = put(root, key, val);
        }

        private Node put(Node x, Key key, Value val) {
            // Если ключ key присутствует в поддереве с корнем x,
            // его значение заменяется на val.
            // Иначе в поддерево добавляется новый узел с ключом key и значением val.
            if(x == null) return new Node (key, val, 1);
            int cmp = key.compareTo(x.key);
            if(cmp < 0) x.left = put(x.left, key, val);
            else if (cmp > 0) x.right = put(x.right, key, val);
            else x.val = val;
            x.N = size(x.left) + size(x.right) + 1;
            return x;
        }

        // min
        // delete
        // keys
    }
}
