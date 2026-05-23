module com.example.studentdb {
        requires javafx.controls;
        requires javafx.fxml;

        requires com.dlsc.formsfx;
        requires java.sql;

        opens com.example.studentdb to javafx.fxml;
        exports com.example.studentdb;
        }