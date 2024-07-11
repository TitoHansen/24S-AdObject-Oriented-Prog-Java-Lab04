module org.example.week10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.week10 to javafx.fxml;
    exports org.example.week10;
    exports com.example.week10;
    opens com.example.week10 to javafx.fxml;
}