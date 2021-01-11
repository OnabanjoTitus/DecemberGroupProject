import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
Entry entry;
    @BeforeEach
    void setUp() {
    entry=new Entry(null);
    }

    @AfterEach
    void tearDown() {
        entry=null;
    }
    @Test
    void testThatEntryTitleCanBeSet(){
        entry.setEntryTitle("Ginger");
        assertEquals("Ginger",entry.getEntryTitle());
    }
    @Test
    void testThatEntryBodyCanBeSet(){
        entry.setEntryTitle("Ginger");
        entry.setEntryBody("Ginger me");
        assertEquals("Ginger me",entry.getEntryBody());
    }
    @Test
    void testThatLocalDateAndTimeIsSet(){
        entry.setEntryTitle("Ginger");
        assertNotNull(entry.getDateAndTime());
    }
    @Test
    void testThatWholeEntryCanBeGotten(){
        entry.setEntryTitle("Ginger");
        entry.setEntryBody("Loading");
        String checker=(""+entry.getEntryTitle()+""+LocalDate.now()+""+entry.getEntryBody());
        assertEquals(checker,entry.viewEntry());
        assertEquals(checker,entry.toString());
    }

}