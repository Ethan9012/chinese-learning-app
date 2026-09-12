# 中文學習 App（原型）

軟體工程課程期末專題。以 Java 主控台程式實作中文學習 App 的核心流程，用 JUnit 5 撰寫單元測試，並附 UML 類別圖與循序圖。

## 功能

啟動後輸入選單編號：

| 編號 | 功能 |
| --- | --- |
| 1 | 查看可選課程（課名、教師、時間、教室、選課代碼） |
| 2 | 輸入選課代碼加選課程 |
| 3 | 輸入選課代碼退選課程 |
| 4 | 列出已選課程 |
| 5 | 開啟語言測驗資料 `test.pdf` |
| 6 | 開啟成績優良使用者的答案 `answer.pdf` |
| 7 | 離開 |

## 專案結構

```text
chinese-learning-app/
├── src/
│   ├── Main.java             主程式，以及 Course、Add、Delete、PrintCourse 等類別
│   └── *Test.java            各功能的 JUnit 5 單元測試
├── lib/                      JUnit 5.8.1 相關 jar
├── docs/
│   ├── class-diagram.pdf     UML 類別圖
│   └── sequence-diagram.pdf  UML 循序圖
├── A.iml                     IntelliJ IDEA 模組設定
└── .idea/                    IntelliJ IDEA 專案設定
```

## 執行

1. 用 IntelliJ IDEA 開啟這個資料夾，Project SDK 選 JDK 11。
2. 執行 `Main` 的 `main` 方法。
3. 在 `src` 上按右鍵選 **Run 'All Tests'** 執行單元測試。

`Main.java` 有一行沒用到的 `import org.junit.Test;`（JUnit 4），`A.iml` 會到本機 Maven 倉庫找 JUnit 4.13.1。如果 IntelliJ 找不到，在該行按 Alt+Enter 加入 JUnit 4 即可。

