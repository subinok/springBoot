package https.com.kt.edu.firstproject.dto;

import https.com.kt.edu.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {

    private Long id; //신규로 추가
    private String title;
    private String content;

    public Article toEntity() {
        return new Article(id, title, content);
    }
}