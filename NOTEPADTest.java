import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NOTEPADTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testDiaryEntryIsSet(){
        NOTEPAD myBreakUpNOTEPAD = new NOTEPAD(15);
        int numberOfDiaryEntries = myBreakUpNOTEPAD.getNumberOfDiaryEntries();
        assertEquals(15,numberOfDiaryEntries);
    }
    @Test
    void testDiaryEntryIsNotNull(){
        NOTEPAD myBreakUpNOTEPAD = new NOTEPAD(15);
        Entry[] entries= myBreakUpNOTEPAD.getEntries();
        assertNotNull(entries);
    }
    @Test
    void testDiaryEntryCanBeEntered(){
//        Diary myBreakUpDiary=new Diary(5);
//        Entry entry= new Entry("My Break up Story");
//        entry.setEntryBody("It just happened");
//        myBreakUpDiary.addNewEntry(entry);
//        Entry[]assertionEntry =new Entry[5];
//        assertionEntry[0]=entry;
//        assertEquals(assertionEntry,myBreakUpDiary.getEntries());
//        Entry secondEntry= new Entry("My Break up Story");
//        secondEntry.setEntryBody("It just happened again");
//        myBreakUpDiary.addNewEntry(secondEntry);
//        assertionEntry[1]=secondEntry;
//        assertEquals(assertionEntry,myBreakUpDiary.getEntries());
        NOTEPAD myBreakUpNOTEPAD = new NOTEPAD(5);
        Entry entry= new Entry("My break up story");
        entry.setEntryBody("It just happened");
        myBreakUpNOTEPAD.addNewEntry(entry);
        Entry[]assertionEntry= new Entry[5];
       assertionEntry[0]= entry;
        assertEquals(entry, myBreakUpNOTEPAD.getEntries()[0]);

        Entry entrySecond= new Entry("My break up story");
        entrySecond.setEntryBody("It just happened sha");
        myBreakUpNOTEPAD.addNewEntry(entrySecond);
        assertionEntry[1]=entrySecond;
        assertEquals(entrySecond, myBreakUpNOTEPAD.getEntries()[1]);
    }
    @Test
    void testDiaryEntryCanBeSearchedFor(){
        NOTEPAD myNewNOTEPAD = new NOTEPAD(3);
        Entry entry=new Entry("Flex");
        entry.setEntryBody("life");
        myNewNOTEPAD.addNewEntry(entry);
        Entry entry1=new Entry("Jam");
        entry1.setEntryBody("style");
        myNewNOTEPAD.addNewEntry(entry1);
        Entry entry2= new Entry("Chop");
        entry2.setEntryBody("calm");
        myNewNOTEPAD.addNewEntry(entry2);
        Entry entry3= new Entry("Vivid");
        entry2.setEntryBody("sharp");
        myNewNOTEPAD.addNewEntry(entry3);
        assertEquals(entry2, myNewNOTEPAD.getEntries()[2]);
    }
    @Test
    void testThatEntriesCanBeDeleted(){
        NOTEPAD NOTEPAD = new NOTEPAD(2);
        Entry entry= new Entry("first");
        entry.setEntryBody("Number1");
        NOTEPAD.addNewEntry(entry);
        Entry entry1=new Entry("Second");
        entry1.setEntryBody("Number2");
        NOTEPAD.addNewEntry(entry1);
        NOTEPAD.getEntries();
        NOTEPAD.deleteEntries(entry);
        assertEquals(2, NOTEPAD.getNumberOfDiaryEntries());
        assertEquals(null, NOTEPAD.getEntries()[0]);
        entry.setEntryBody("things");
        entry.setEntryTitle("title");
        NOTEPAD.addNewEntry(entry);
        assertEquals(entry, NOTEPAD.getEntries()[0]);
    }

}