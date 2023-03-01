module com.example.palindromos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.palindromos to javafx.fxml;
    exports com.example.palindromos;
}