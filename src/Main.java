import java.util.*;
import java.awt.Desktop;
import java.io.*;
import org.junit.Test;

public class Main {
    public static void main(String[] args) {

        Scanner keyin = new Scanner(System.in);
        PrintCourse AllCourse = new PrintCourse();
        Course[] course = new Course[6];
        course[0] = new Course("中文思辨與表達", "鄭慧如", "(一)03-04", "語207", 2399);
        course[1] = new Course("文字學(二)", "李綉玲", "(二)08-09", "語304", 2402);
        course[2] = new Course("文學概論(二)", "徐培晃", "(四)01-02", "人503", 2403);
        course[3] = new Course("漢字書寫與書法概論", "蕭世瓊", "(一)06-07", "圖116游翰堂", 2409);
        course[4] = new Course("文字與圖像創意傳達", "余風", "(三)03-04", "行政二館105", 2425);
        course[5] = new Course("文章寫作（二）", "劉梓潔", "(一)08-09", "人706", 2400);



        while(true) {
            System.out.println("1 查看可選課程");
            System.out.println("2 加選課程");
            System.out.println("3 刪除課程");
            System.out.println("4 列出已有課程");
            System.out.println("5 開啟語言測驗資料");
            System.out.println("6 顯示成績優良使用者的答案");
            System.out.println("7 退出");

            int choose;
            choose = keyin.nextInt();

            if(choose==1){      // 查看可選課程

                for(int i=0; i<6; i++){
                    AllCourse.ListCourse(course[i]);
                }
                System.out.println();
            }

            else if(choose==2){     // 加選課程
                System.out.println("請輸入選課代碼");
                int TheCode = keyin.nextInt();

                Add a = new Add();
                a.AddCourse(course[0], course[1], course[2], course[3], course[4], course[5], TheCode);


            }

            else if(choose==3){     // 刪除課程

                System.out.println("請輸入選課代碼");
                int TheCode = keyin.nextInt();

                Delete a = new Delete();
                a.DeleteCourse(course[0], course[1], course[2], course[3], course[4], course[5], TheCode);
            }

            else if(choose==4){     // 列出已有的課程

                PrintHaveCourse a = new PrintHaveCourse();
                a.HaveCourse(course[0], course[1], course[2], course[3], course[4], course[5]);
            }

            else if(choose==5){
                LanguageTest test = new LanguageTest();
                test.Print();
            }

            else if(choose==6){
                ExcellentAnswer answer = new ExcellentAnswer();
                answer.Print();

            }

            else if(choose==7)      // 退出
                break;
        }

    }
}


class Course{
    public String Name;
    public String Teacher;
    public String ClassTime;
    public String Room;
    public int EnrollmentCode;
    public boolean have=false;

    Course(String n, String t, String c, String r, int e){
        Name=n;
        Teacher=t;
        ClassTime=c;
        Room=r;
        EnrollmentCode=e;
    }

    public void set(){
        have=true;
    }



}

class PrintCourse{        // 列出可選課程

    public void ListCourse(Course course){
        System.out.println(course.EnrollmentCode+", "+course.Name+", "+course.Teacher+", "+course.ClassTime+", "+course.Room);

    }
}

class Add{      // 加選課程

    public void AddCourse(Course a, Course b, Course c, Course d, Course e, Course f,int TheCode){
        if(TheCode == a.EnrollmentCode && a.have==false) {
            a.have = true;
            System.out.println("加選成功");
        }
        else if(TheCode == b.EnrollmentCode && b.have==false) {
            b.have = true;
            System.out.println("加選成功");
        }
        else if(TheCode == c.EnrollmentCode && c.have==false) {
            c.have = true;
            System.out.println("加選成功");
        }
        else if(TheCode == d.EnrollmentCode && d.have==false) {
            d.have = true;
            System.out.println("加選成功");
        }
        else if(TheCode == e.EnrollmentCode && e.have==false) {
            e.have = true;
            System.out.println("加選成功");
        }
        else if(TheCode == f.EnrollmentCode && f.have==false) {
            f.have = true;
            System.out.println("加選成功");
        }
        else
            System.out.println("加選失敗");
    }
}

class Delete{       // 退選課程

    public void DeleteCourse(Course a, Course b, Course c, Course d, Course e, Course f,int TheCode){
        if(TheCode == a.EnrollmentCode && a.have==true) {
            a.have = false;
            System.out.println("退選成功");
        }
        else if(TheCode == b.EnrollmentCode && b.have==true) {
            b.have = false;
            System.out.println("退選成功");
        }
        else if(TheCode == c.EnrollmentCode && c.have==true) {
            c.have = false;
            System.out.println("退選成功");
        }
        else if(TheCode == d.EnrollmentCode && d.have==true) {
            d.have = false;
            System.out.println("退選成功");
        }
        else if(TheCode == e.EnrollmentCode && e.have==true) {
            e.have = false;
            System.out.println("退選成功");
        }
        else if(TheCode == f.EnrollmentCode && f.have==true) {
            f.have = false;
            System.out.println("退選成功");
        }
        else
            System.out.println("退選失敗");
    }
}

class PrintHaveCourse{      // 列出已有課程

    public void HaveCourse(Course a, Course b, Course c, Course d, Course e, Course f){

        if(a.have==true)
            System.out.println(a.EnrollmentCode+", "+a.Name+", "+a.Teacher+", "+a.ClassTime+", "+a.Room);
        if(b.have==true)
            System.out.println(b.EnrollmentCode+", "+b.Name+", "+b.Teacher+", "+b.ClassTime+", "+b.Room);
        if(c.have==true)
            System.out.println(c.EnrollmentCode+", "+c.Name+", "+c.Teacher+", "+c.ClassTime+", "+c.Room);
        if(d.have==true)
            System.out.println(d.EnrollmentCode+", "+d.Name+", "+d.Teacher+", "+d.ClassTime+", "+d.Room);
        if(e.have==true)
            System.out.println(e.EnrollmentCode+", "+e.Name+", "+e.Teacher+", "+e.ClassTime+", "+e.Room);
        if(f.have==true)
            System.out.println(f.EnrollmentCode+", "+f.Name+", "+f.Teacher+", "+f.ClassTime+", "+f.Room);

        else
            System.out.println("沒有課程");

    }

}

class LanguageTest{         // 語言測驗資料
    public void Print(){
        try{
            File file = new File("test.pdf");
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())         //checks file exists or not
                desktop.open(file);
            else
                System.out.println("FAIL");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

class ExcellentAnswer{          // 成績優良者的答案
    public void Print(){
        try{
            File file = new File("answer.pdf");
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())         //checks file exists or not
                desktop.open(file);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}