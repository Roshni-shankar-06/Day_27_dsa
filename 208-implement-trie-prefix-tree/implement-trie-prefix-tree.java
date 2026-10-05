class Trie {
    private TrieNode root;

    // Helper inner class representing each node in the Trie
    private static class TrieNode {
        private TrieNode[] children;
        private boolean isWord;

        public TrieNode() {
            children = new TrieNode[26]; // 26 letters for lowercase English letters
            isWord = false;
        }
    }

    // Initializes the trie object
    public Trie() {
        root = new TrieNode();
    }
    
    // Inserts a word into the trie
    public void insert(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new TrieNode();
            }
            curr = curr.children[index];
        }
        curr.isWord = true;
    }
    
    // Returns true if the string word is in the trie
    public boolean search(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (curr.children[index] == null) {
                return false;
            }
            curr = curr.children[index];
        }
        return curr.isWord;
    }
    
    // Returns true if there is a previously inserted string word that has the prefix
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if (curr.children[index] == null) {
                return false;
            }
            curr = curr.children[index];
        }
        return true;
    }
}
  
      
         
