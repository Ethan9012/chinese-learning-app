import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteTest {

    Delete a = new Delete();
    @BeforeEach
    void setUp() {
        System.out.println("@@PrintCourseTest.setUp #12: setup");
    }

    Course c0 = new Course("中文思辨與表達", "鄭慧如", "(一)03-04", "語207", 2399);

    Course c1 = new Course("文字學(二)", "李綉玲", "(二)08-09", "語304", 2402);
    Course c2 = new Course("文學概論(二)", "徐培晃", "(四)01-02", "人503", 2403);
    Course c3 = new Course("漢字書寫與書法概論", "蕭世瓊", "(一)06-07", "圖116游翰堂", 2409);
    Course c4 = new Course("文字與圖像創意傳達", "余風", "(三)03-04", "行政二館105", 2425);
    Course c5 = new Course("文章寫作（二）", "劉梓潔", "(一)08-09", "人706", 2400);

    @AfterEach
    void tearDown() {
        System.out.println("@@PrintCourseTest.tearDown #25: tearDown");
    }

    @Test
    void deleteCourse() {
        c5.set();
        a.DeleteCourse(c0, c1, c2, c3, c4, c5, 2400);
    }
}