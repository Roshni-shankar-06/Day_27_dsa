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
    

         
   
  
      
         
