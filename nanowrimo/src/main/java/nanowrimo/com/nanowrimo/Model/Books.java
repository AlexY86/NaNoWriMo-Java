package nanowrimo.com.nanowrimo.Model;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "bookName")
    private String bookName;

    @Column(name = "date")
    private String getDate;

    @Column(name = "chapters")
    private Integer getChapters;

    @Column(name = "records")
    private Integer getRecords;

    @Column(name = "wordCount")
    private Integer getWordCount;


    // @Bean
    // public ModelMapper modelMapper() {
    //     return new ModelMapper();
    // }


    

    // public Long getId(){
    //     return id;
    // }

    // public void setId(Long id){
    //     this.id = id;
    // }

    // public String getbookName(){
    //     return bookName;
    // }

    // public void setbookName(String bookName){
    //     this.bookName = bookName;
    // }

    // public String getDate(){
    //     return date;
    // }

    // public void setDate(String date){
    //     this.date = date;
    // }

    // public Integer getChapters(){
    //     return chapters;
    // }

    // public void setChapters(Integer chapters){
    //     this.chapters = chapters;
    // }

    // public Integer getRecords(){
    //     return records;
    // }

    // public void setRecords(Integer records){
    //     this.records = records;
    // }

    // public Integer getWordCount(){
    //     return wordCount;
    // }

    // public void setWordCount(Integer wordCount){
    //     this.wordCount = wordCount;
    // }
    

    
    // public Books(String bookName, Date date, Integer chapters, Integer records, Integer wordCount){
    //     this.bookName = bookName;
    //     this.date = date;
    //     this.chapters = chapters;
    //     this.records = records;
    //     this.wordCount = wordCount;

    // }

    

    
}




