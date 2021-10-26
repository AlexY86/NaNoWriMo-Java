package nanowrimo.com.nanowrimo.DTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public class BooksDTO {

    private long id;
    

    private String bookName;

    private String date;

    private Integer chapters;

    private Integer records;

    private Integer wordCount;
    
// date conversion back and forth from client and server
    private static final SimpleDateFormat dateFormat
      = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public Date getSubmissionDateConverted(String timezone) throws ParseException {
        dateFormat.setTimeZone(TimeZone.getTimeZone(timezone));
        return dateFormat.parse(this.date);
    }

    public void setSubmissionDate(Date date, String timezone) {
        dateFormat.setTimeZone(TimeZone.getTimeZone(timezone));
        this.date = dateFormat.format(date);
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getbookName(){
        return bookName;
    }

    public void setbookName(String bookName){
        this.bookName = bookName;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }

    public Integer getChapters(){
        return chapters;
    }

    public void setChapters(Integer chapters){
        this.chapters = chapters;
    }

    public Integer getRecords(){
        return records;
    }

    public void setRecords(Integer records){
        this.records = records;
    }

    public Integer getWordCount(){
        return wordCount;
    }

    public void setWordCount(Integer wordCount){
        this.wordCount = wordCount;
    }

}