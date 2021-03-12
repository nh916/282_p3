import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class HashTable extends Read{

    private static final int DEFAULT_TABLE_SIZE = 101;

    private String[] hashEntry;
    private ArrayList<Character> firstAndLastLetter;

    // TODO: 4/22/2019 the hashtable needs to be set the the size of the key.txt

    public HashTable() {
        super();
        hashEntry = new String[DEFAULT_TABLE_SIZE];

        firstAndLastLetter = new ArrayList<Character>();
    }


    public int hash(String word){
        int hash;
        hash = word.length() + gValue(word.charAt(0)) + gValue(word.charAt(word.length() - 1)) % hashEntry.length;
        return hash;
    }

//    keeps track of the first and last letter in the arrayList and later we can get the frequency of that letter
    private void addALetter(String word){
//        if (!firstAndLastLetter.contains(word.charAt(0))){
//            firstAndLastLetter.add(word.charAt(0));
//        }
//        else {
//
//        }
//        if (!firstAndLastLetter.contains(word.charAt(word.length() - 1))){
//            firstAndLastLetter.add(word.charAt(word.length() - 1));
//        }
//        else {
//
//        }
        firstAndLastLetter.add(word.charAt(0));
        firstAndLastLetter.add(word.charAt(word.length() - 1));
    }

//    returns the frequency of the letter in the arrayList
    private int getFrequency(char letter){
        return Collections.frequency(firstAndLastLetter, letter);
    }


//    todo go through all the keys found from the file and then keep track of their frequency and then do a reverse order
    private void orderByFrequincyDescending(){
        firstAndLastLetter.sort(Collections.reverseOrder(), Collections.frequency());
    }

    private int frequencyValue(String word){
        return getFrequency(word.charAt(0)) + getFrequency(word.charAt(word.length() - 1));
    }

    private int gValue(char letter){

    }

    private boolean hasGValue(char word){

    }

    private boolean hashIsValid(String word){

    }

    private boolean cichelli(Stack<String> wordStack){
        String wordFromWordStack = "";

        while (!wordStack.isEmpty()){
            wordFromWordStack = wordStack.pop();
        }
        if (hasGValue(wordFromWordStack.charAt(0)) && hasGValue(wordFromWordStack.charAt(wordFromWordStack.length() -1))){
            if (hashIsValid(wordFromWordStack)){
//                todo recursively call cichelli returns true??
            }
            else {
//                todo detach hash value
            }
            wordStack.push(wordFromWordStack);
            return false;
        }

    }




    public void insert(int key, String toInsert){
        hashEntry[key] = toInsert;
    }




    public String find(String toFind){
        return find(hash(toFind));
    }



    public String find(int key){

        return hashEntry[key];
    }


    public void remove(int key){
        hashEntry[key] = null;
    }



}
