import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entry {
private String entryTitle;
private String entryBody;
private LocalDateTime entryDateAndTime;
    public Entry(String entryTitle) {
       this.entryTitle=entryTitle;
       entryDateAndTime=LocalDateTime.now();
    }

    public void setEntryTitle(String newEntryTitle) {
        entryTitle=newEntryTitle;
    }

    public String getEntryTitle() {
        return entryTitle;
    }

    public LocalDateTime getEnterDateAndTime() {
        return entryDateAndTime;
    }

    public void setEntryBody(String entryBody) {
        this.entryBody =entryBody;
    }

    public String getEntryBody() {
        return entryBody;
    }

    public String viewEntry() {
        String preview =("Title:"+ getEntryTitle()+"\n"+"Entry Date:"+ LocalDate.now()+"\n"+"Entry Body:"+getEntryBody());
        return preview;
    }

    public void updateEntry(String entryBody) {
        this.entryBody+=entryBody;
    }
    @Override
    public String toString(){
        return viewEntry();
    }
}
