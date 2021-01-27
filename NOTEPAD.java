public class NOTEPAD {
private Entry[] entries;
    public NOTEPAD(int numberOfDiaryEntries) {
    entries= new Entry[numberOfDiaryEntries];
    }

    public int getNumberOfDiaryEntries() {
        return entries.length;
    }

    public Entry[] getEntries() {
        return entries;
    }

    public void addNewEntry(Entry newDiaryEntry) {
       for(int counter=0;counter<entries.length;counter++){
           if(entries[counter]==null){
               entries[counter]=newDiaryEntry;
               break;
           }
       }
   }
    public void deleteEntries(Entry newDiaryEntry) {
        for(int counter=0;counter<entries.length;counter++){
            if(entries[counter]==newDiaryEntry){
                entries[counter]=null;
                break;
            }
        }
        }
}

