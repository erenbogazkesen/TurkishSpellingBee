module com.eren.spellingbee {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.eren.spellingbee to javafx.fxml;
    exports com.eren.spellingbee;
}