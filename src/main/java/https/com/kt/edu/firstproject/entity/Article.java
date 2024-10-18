package https.com.kt.edu.firstproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@AllArgsConstructor
@NoArgsConstructor // Default 생성자 추가
@ToString
@Getter
public class Article {

    @Id   // 대표 값
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동생성
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    // 데이터가 있는 경우만 Update
    public void patch(Article article) {
        if (article.title != null)
            this.title = article.title;
        if (article.content != null)
            this.content = article.content;
    }
}