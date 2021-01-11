import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
Diary diary;
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
        diary=null;
    }
    @Test
    void testThatDiaryEntriesCanBeInitialized(){
        diary=new Diary(2);
        assertEquals(2,diary.getNumberOfEntries());
    }
    @Test
    void testThatEntryCanBeAdded(){
        diary=new Diary(2);
        Entry entry=new Entry("first");
        entry.setEntryBody("1st");
        diary.addNewEntry(entry);
        assertEquals(entry,diary.getEntries()[0]);
        Entry entry1=new Entry("second");
        entry1.setEntryBody("2nd");
        diary.addNewEntry(entry1);
        assertEquals(entry1,diary.getEntries()[1]);
    }
    @Test
    void testThatEntriesCanBeDeleted(){
        diary=new Diary(2);
        Entry entry=new Entry("first");
        entry.setEntryBody("1st");
        diary.addNewEntry(entry);
        diary.deleteEntry(entry);
        assertNotEquals(entry,diary.getEntries()[0]);
        Entry entry1=new Entry("second");
        entry1.setEntryBody("2nd");
        diary.addNewEntry(entry1);
        diary.deleteEntry(entry1);
        assertNotEquals(entry1,diary.getEntries()[1]);
    }
    @Test
    void testThatEntriesCanBeUpdated(){
        diary=new Diary(1);
        Entry entry=new Entry("first");
        entry.setEntryBody("1");
        diary.addNewEntry(entry);
        entry.updateEntry("st");
        diary.addNewEntry(entry);
        assertEquals(entry,diary.getEntries()[0]);
    }
}