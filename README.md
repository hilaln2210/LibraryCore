# LibraryCore

מודול ליבה למערכת ניהול ספרייה — Java, Maven. ניהול משתמשים (User, UserService).

## תכונות
- **User** — מודל משתמש
- **IUserService** / **UserService** — ממשק ושירות לניהול משתמשים
- חיפוש לפי שם
- JUnit tests

## טכנולוגיות
- **Java** · **Maven** · **JUnit**

## הרצה
```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.example.library.Main"
```

## בדיקות
```bash
mvn test
```

## מבנה
```
src/main/java/com/example/library/
├── User.java
├── IUserService.java
├── UserService.java
└── Main.java
```

© Hila · Java · Maven
