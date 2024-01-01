module com.example.findthecup {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.findthecup to javafx.fxml;
    exports com.example.findthecup;
}