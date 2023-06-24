package oopproject.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.time.LocalDate;
public class HelloApplication extends Application {
     private Stage primaryStage;

     //greeting page
    @Override
    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;
        AnchorPane pane = new AnchorPane();

        //greeting
        Label label = new Label("Welcome to Hall Booking System");
        label.setAlignment(Pos.CENTER);
        label.setFont(javafx.scene.text.Font.font("Arial", FontWeight.BOLD, 45));
        label.setLayoutX(150);
        label.setLayoutY(276);
        //button
        Button btn_continue = new Button("Click to continue");
        btn_continue.setLayoutX(430);
        btn_continue.setLayoutY(460);
        btn_continue.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 15));
        btn_continue.setOnAction(e-> bookHall());
        pane.getChildren().addAll(label, btn_continue);
        Scene scene = new Scene(pane, 1000, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //booking page
    public void bookHall(){
        AnchorPane pane = new AnchorPane();
        Label label = new Label("Hall list");
        label.setAlignment(Pos.CENTER);
        label.setFont(javafx.scene.text.Font.font("Arial", FontWeight.BOLD, 30));
        label.setLayoutX(420);
        label.setLayoutY(10);

        //image and label for main audi
        Image main_audi_image = new Image("file:main audi.jpg");
        ImageView main_audi = new ImageView(main_audi_image);
        main_audi.setFitHeight(250);
        main_audi.setFitWidth(243);
        main_audi.setLayoutX(77);
        main_audi.setLayoutY(90);
        Label label_main_audi = new Label(HallBookingSystem.halls[0]);
        label_main_audi.setAlignment(Pos.CENTER);
        label_main_audi.setFont(javafx.scene.text.Font.font("Arial", FontWeight.BOLD, 20));
        label_main_audi.setLayoutX(100);
        label_main_audi.setLayoutY(355);
        //button book
        Button btn_book_main_audi = new Button("Book");
        btn_book_main_audi.setLayoutX(150);
        btn_book_main_audi.setLayoutY(400);
        btn_book_main_audi.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 15));
        btn_book_main_audi.setOnAction(actionEvent -> addBooking(1));

        //image and label for chancellor hall
        Image chancellor_hall_image = new Image("file:chancellor hall.jpg");
        ImageView chancellor_hall = new ImageView(chancellor_hall_image);
        chancellor_hall.setFitHeight(250);
        chancellor_hall.setFitWidth(243);
        chancellor_hall.setLayoutX(400);
        chancellor_hall.setLayoutY(90);
        Label label_chancellor_hall = new Label(HallBookingSystem.halls[1]);
        label_chancellor_hall.setAlignment(Pos.CENTER);
        label_chancellor_hall.setFont(javafx.scene.text.Font.font("Arial", FontWeight.BOLD, 20));
        label_chancellor_hall.setLayoutX(450);
        label_chancellor_hall.setLayoutY(355);
        //button book
        Button btn_book_chancellor_hall = new Button("Book");
        btn_book_chancellor_hall.setLayoutX(500);
        btn_book_chancellor_hall.setLayoutY(400);
        btn_book_chancellor_hall.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 15));
        btn_book_chancellor_hall.setOnAction(actionEvent -> addBooking(2));

        //image and label for culture centre
        Image culture_centre_image = new Image("file:culture centre.jpg");
        ImageView culture_centre = new ImageView(culture_centre_image);
        culture_centre.setFitHeight(250);
        culture_centre.setFitWidth(243);
        culture_centre.setLayoutX(700);
        culture_centre.setLayoutY(90);
        Label label_culture_centre = new Label(HallBookingSystem.halls[2]);
        label_culture_centre.setAlignment(Pos.CENTER);
        label_culture_centre.setFont(javafx.scene.text.Font.font("Arial", FontWeight.BOLD, 20));
        label_culture_centre.setLayoutX(750);
        label_culture_centre.setLayoutY(355);
        //button book
        Button btn_book_cultural_centre = new Button("Book");
        btn_book_cultural_centre.setLayoutX(800);
        btn_book_cultural_centre.setLayoutY(400);
        btn_book_cultural_centre.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 15));
        btn_book_cultural_centre.setOnAction(actionEvent -> addBooking(3));

        //image and label for rector hall
        Image rector_hall_image = new Image("file:rector hall.jpg");
        ImageView rector_hall = new ImageView(rector_hall_image);
        rector_hall.setFitHeight(250);
        rector_hall.setFitWidth(243);
        rector_hall.setLayoutX(77);
        rector_hall.setLayoutY(450);
        Label label_rector_hall = new Label(HallBookingSystem.halls[3]);
        label_rector_hall.setAlignment(Pos.CENTER);
        label_rector_hall.setFont(javafx.scene.text.Font.font("Arial", FontWeight.BOLD, 20));
        label_rector_hall.setLayoutX(140);
        label_rector_hall.setLayoutY(715);
        //button book
        Button btn_book_rector_hall  = new Button("Book");
        btn_book_rector_hall.setLayoutX(150);
        btn_book_rector_hall.setLayoutY(760);
        btn_book_rector_hall.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 15));
        btn_book_rector_hall.setOnAction(actionEvent -> addBooking(4));

        //image and label for great hall
        Image great_hall_image = new Image("file:greathallharrypotter.jpeg");
        ImageView great_hall = new ImageView(great_hall_image);
        great_hall.setFitHeight(250);
        great_hall.setFitWidth(243);
        great_hall.setLayoutX(400);
        great_hall.setLayoutY(450);
        Label label_great_hall = new Label(HallBookingSystem.halls[4]);
        label_great_hall.setAlignment(Pos.CENTER);
        label_great_hall.setFont(javafx.scene.text.Font.font("Arial", FontWeight.BOLD, 20));
        label_great_hall.setLayoutX(470);
        label_great_hall.setLayoutY(715);
        //button book
        Button btn_book_great_hall = new Button("Book");
        btn_book_great_hall.setLayoutX(500);
        btn_book_great_hall.setLayoutY(760);
        btn_book_great_hall.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 15));
        btn_book_great_hall.setOnAction(actionEvent -> addBooking(5));

        //button check availability
        Button btn_check_availability = new Button("Check Availability");
        btn_check_availability.setLayoutX(770);
        btn_check_availability.setLayoutY(650);
        btn_check_availability.setOnAction(actionEvent -> checkAvailability());
        pane.getChildren().addAll(label, main_audi, label_main_audi, chancellor_hall, label_chancellor_hall, culture_centre, label_culture_centre, rector_hall, label_rector_hall, great_hall, label_great_hall, btn_check_availability, btn_book_chancellor_hall, btn_book_cultural_centre, btn_book_great_hall, btn_book_main_audi, btn_book_rector_hall);
        Scene scene = new Scene(pane, 1000, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //method to check availability
    public static void checkAvailability(){
        Stage stage = new Stage();
        AnchorPane pane = new AnchorPane();
        for (int i = 0; i < HallBookingSystem.halls.length; i++) {
            Label hall = new Label("Hall");
            hall.setLayoutX(50);
            hall.setLayoutY(50);
            Label availability = new Label("Availability");
            availability.setLayoutX(150);
            availability.setLayoutY(50);
            Label capacity = new Label("Capacity");
            capacity.setLayoutX(250);
            capacity.setLayoutY(50);
            Label label_hall = new Label(HallBookingSystem.halls[i]);
            label_hall.setLayoutX(50);
            label_hall.setLayoutY(100+(i*20));
            Label label_availability = new Label(
                    Boolean.TRUE.equals(Hall.getAvailability(i)) ? "Available" : "Not Available"
            );
            label_availability.setLayoutX(150);
            label_availability.setLayoutY(100+(i*20));
            Label label_capacity = new Label(
                    Hall.getCapacity(i).toString()
            );
            label_capacity.setLayoutX(250);
            label_capacity.setLayoutY(100+(i*20));
            Button btn_back = new Button("Back");
            btn_back.setLayoutX(50);
            btn_back.setLayoutY(350);
            btn_back.setOnAction(actionEvent -> stage.close());
            pane.getChildren().addAll(hall, availability, capacity, label_hall, label_availability, label_capacity, btn_back);
        }

        Scene scene = new Scene(pane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
    //method to book hall
    public void addBooking(int num){
        Booking booking = new Booking();
        Student student = new Student();
        Staff staff = new Staff();
        Person person = new Person();
        Label label = new Label("Booking Details");
        Label label_hall= new Label();
        Label label_capacity = new Label();
        Label label_availability = new Label();
        AnchorPane addBookingPane = new AnchorPane();
        if (num == 1){ //if booking for main audi
            label = new Label("Booking Details");
            label_hall = new Label("Hall: "+HallBookingSystem.halls[0]);
            label_capacity = new Label("Capacity: "+Hall.getCapacity(0));
            label_availability = new Label("Availability: "+(Boolean.TRUE.equals(Hall.getAvailability(0)) ? "Available" : "Not Available"));
            addBookingPane.getChildren().addAll(label, label_hall, label_capacity, label_availability);
        } else if (num == 2){ //if booking for chancellor hall
            label = new Label("Booking Details");
            label_hall = new Label("Hall: "+HallBookingSystem.halls[1]);
            label_capacity = new Label("Capacity: "+Hall.getCapacity(1));
            label_availability = new Label("Availability: "+(Boolean.TRUE.equals(Hall.getAvailability(1)) ? "Available" : "Not Available"));
            addBookingPane.getChildren().addAll(label, label_hall, label_capacity, label_availability);
        } else if (num == 3){ //if booking for cultural centre
            label = new Label("Booking Details");
            label_hall = new Label("Hall: "+HallBookingSystem.halls[2]);
            label_capacity = new Label("Capacity: "+Hall.getCapacity(2));
            label_availability = new Label("Availability: "+(Boolean.TRUE.equals(Hall.getAvailability(2)) ? "Available" : "Not Available"));
            addBookingPane.getChildren().addAll(label, label_hall, label_capacity, label_availability);
        } else if (num == 4){ //if booking for rector hall
            label = new Label("Booking Details");
            label_hall = new Label("Hall: "+HallBookingSystem.halls[3]);
            label_capacity = new Label("Capacity: "+Hall.getCapacity(3));
            label_availability = new Label("Availability: "+(Boolean.TRUE.equals(Hall.getAvailability(3)) ? "Available" : "Not Available"));
            addBookingPane.getChildren().addAll(label, label_hall, label_capacity, label_availability);
        } else if (num == 5){ //if booking for great hall
            label = new Label("Booking Details");
            label_hall = new Label("Hall: "+HallBookingSystem.halls[4]);
            label_capacity = new Label("Capacity: "+Hall.getCapacity(4));
            label_availability = new Label("Availability: "+(Boolean.TRUE.equals(Hall.getAvailability(4)) ? "Available" : "Not Available"));
            addBookingPane.getChildren().addAll(label, label_hall, label_capacity, label_availability);
        }
        //set layout
        label.setLayoutX(95);
        label.setLayoutY(30);
        label.setFont(javafx.scene.text.Font.font("Arial", FontWeight.BOLD, 45));
        label.setPadding(new Insets(0, 0, 70, 0));
        label_hall.setLayoutX(100);
        label_hall.setLayoutY(100);
        label_hall.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 20));
        label_capacity.setLayoutX(100);
        label_capacity.setLayoutY(150);
        label_capacity.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 20));
        label_availability.setLayoutX(100);
        label_availability.setLayoutY(200);
        label_availability.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 20));

        //fill in details
        Label label_name = new Label("Name: ");
        TextField text_name = new TextField();
        label_name.setLayoutX(100);
        label_name.setLayoutY(250);
        label_name.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 20));
        text_name.setLayoutX(200);
        text_name.setLayoutY(250);

        Label faculty = new Label("Faculty: ");
        TextField text_faculty = new TextField();
        faculty.setLayoutX(100);
        faculty.setLayoutY(300);
        faculty.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 20));
        text_faculty.setLayoutX(200);
        text_faculty.setLayoutY(300);

        Label email = new Label("Email: ");
        TextField text_email = new TextField();
        email.setLayoutX(100);
        email.setLayoutY(350);
        email.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 20));
        text_email.setLayoutX(200);
        text_email.setLayoutY(350);

        Label label_date = new Label("Date: ");
        label_date.setLayoutX(100);
        label_date.setLayoutY(400);
        label_date.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 20));

        DatePicker bookingDate = new DatePicker(); //date picker
        bookingDate.setLayoutX(200);
        bookingDate.setLayoutY(400);

        Label position_question = new Label("Are you a student or as a staff? ");
        position_question.setLayoutX(100);
        position_question.setLayoutY(450);
        position_question.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 20));


        Label label_student = new Label("Student ID: ");
        Button btn_student = new Button("Student"); //button to choose student
        TextField text_student = new TextField(); //text field to enter student ID
        btn_student.setLayoutX(100);
        button(addBookingPane, label_student, btn_student, text_student);

        TextField text_staff = new TextField(); //text field to enter staff ID
        Label label_staff = new Label("Staff ID: ");
        Button btn_staff = new Button("Staff"); //button to choose staff
        btn_staff.setLayoutX(200);
        button(addBookingPane, label_staff, btn_staff, text_staff);

        Button btn_book = new Button("Book"); //button to book
        btn_book.setLayoutX(100);
        btn_book.setLayoutY(600);
        btn_book.setOnAction(e -> {
            person.setNamePerson(text_name.getText()); //set name
            person.setFaculty(text_faculty.getText()); //set faculty
            person.setEmail(text_email.getText()); //set email
            booking.setBookingDate(bookingDate.getValue()); //set date

            // Check and parse student ID
            String studentIDText = text_student.getText();
            if (!studentIDText.isEmpty() && studentIDText.matches("\\d+")) {
                int studentID = Integer.parseInt(studentIDText);
                student.setStudentID(String.valueOf(studentID)); //set student ID
            } else {
                student.setStudentID(""); // set empty student ID if not provided or invalid
            }

            // Check and parse staff ID
            String staffIDText = text_staff.getText();
            if (!staffIDText.isEmpty() && staffIDText.matches("\\d+")) {
                int staffID = Integer.parseInt(staffIDText);
                staff.setStaffID(String.valueOf(staffID)); //set staff ID
            } else {
                staff.setStaffID(""); // set empty staff ID if not provided or invalid
            }

            //testing
            System.out.println("testing..");
            System.out.println(person.getNamePerson());
            System.out.println(person.getFaculty());
            System.out.println(person.getEmail());
            System.out.println(booking.getBookingDate());
            System.out.println("staff: "+staff.getStaffID());
            System.out.println("student: "+student.getStudentID());

            System.out.println("staff id: "+staff.getStaffID());
            System.out.println("student id: "+student.getStudentID());

            int studentID = !student.getStudentID().isEmpty() ? Integer.parseInt(student.getStudentID()) : 0; //get student ID
            int staffID = !staff.getStaffID().isEmpty() ? Integer.parseInt(staff.getStaffID()) : 0; //get staff ID

            //after parse, the value is null, fucek sial

            displayBooking(num, person.getNamePerson(), person.getFaculty(), person.getEmail(), booking.getBookingDate(), staffID,studentID); //go to display booking page
        });

        addBookingPane.getChildren().addAll(label_name, text_name, faculty, text_faculty, email, text_email, label_date, bookingDate, position_question, btn_student, btn_staff, btn_book   );

        Scene scene = new Scene(addBookingPane, 1000, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void button(AnchorPane addBookingPane, Label label_student, Button btn_student, TextField text_student) {
        btn_student.setLayoutY(500);
        btn_student.setOnAction(k -> {
            label_student.setLayoutX(100);
            label_student.setLayoutY(550);
            label_student.setFont(Font.font("Arial", FontWeight.LIGHT, 20));
            text_student.setLayoutX(200);
            text_student.setLayoutY(550);
            addBookingPane.getChildren().addAll(label_student, text_student);
        });
    }

    //display booking
    public void displayBooking(int hall_num, String name, String faculty, String email, LocalDate date, int staff_id, int student_id){

        System.out.println("student id after parse: "+student_id);
        System.out.println("staff id after parse: "+staff_id);

        AnchorPane pane = new AnchorPane();
        ImageView hall_image_view = null;
        Student student = new Student();
        Staff staff = new Staff();
        Label label = new Label("Your Booking");
        label.setLayoutX(95);
        label.setLayoutY(30);
        label.setFont(javafx.scene.text.Font.font("Arial", FontWeight.BOLD, 45));
        label.setPadding(new Insets(0, 0, 70, 0));
        Label label_hall_name = new Label();
        Label person_id = new Label();

        if (student_id >= 1000000 && student_id <= 9999999){ //if student ID is valid
            if (hall_num == 1){
                hall_image_view = new ImageView(new Image("file:main audi.jpg"));
                hall_image_view.setFitHeight(250);
                hall_image_view.setFitWidth(243);
                hall_image_view.setLayoutX(100);
                hall_image_view.setLayoutY(100);
                label_hall_name = new Label(HallBookingSystem.halls[0]);
                label_hall_name.setLayoutX(100);
                label_hall_name.setLayoutY(500);
                label_hall_name.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 20));
                person_id = new Label(student.getStudentID());
                displayBookingPersonDetails(pane, name, faculty, email, date);

            } else if (hall_num == 2){
                hall_image_view = new ImageView(new Image("file:chancellor hall.jpg"));
                hall_image_view.setFitHeight(300);
                hall_image_view.setFitWidth(300);
                hall_image_view.setLayoutX(100);
                hall_image_view.setLayoutY(100);
                label_hall_name = new Label(HallBookingSystem.halls[1]);
                label_hall_name.setLayoutX(100);
                label_hall_name.setLayoutY(500);
                label_hall_name.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 20));
                person_id = new Label(student.getStudentID());
                displayBookingPersonDetails(pane, name, faculty, email, date);

            } else if (hall_num == 3){
                hall_image_view = new ImageView(new Image("file:culture centre.jpg"));
                hall_image_view.setFitHeight(300);
                hall_image_view.setFitWidth(300);
                hall_image_view.setLayoutX(100);
                hall_image_view.setLayoutY(100);
                label_hall_name = new Label(HallBookingSystem.halls[2]);
                label_hall_name.setLayoutX(100);
                label_hall_name.setLayoutY(500);
                label_hall_name.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 20));
                person_id = new Label(student.getStudentID());
                displayBookingPersonDetails(pane, name, faculty, email, date);

            } else if (hall_num == 4){
                hall_image_view = new ImageView(new Image("file:rector hall.jpg"));
                hall_image_view.setFitHeight(300);
                hall_image_view.setFitWidth(300);
                hall_image_view.setLayoutX(100);
                hall_image_view.setLayoutY(100);
                label_hall_name = new Label(HallBookingSystem.halls[3]);
                label_hall_name.setLayoutX(100);
                label_hall_name.setLayoutY(500);
                label_hall_name.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 20));
                person_id = new Label(student.getStudentID());
                displayBookingPersonDetails(pane, name, faculty, email, date);

            } else if (hall_num == 5){
                hall_image_view = new ImageView(new Image("file:greathallharrypotter.jpeg"));
                hall_image_view.setFitHeight(300);
                hall_image_view.setFitWidth(300);
                hall_image_view.setLayoutX(100);
                hall_image_view.setLayoutY(100);
                label_hall_name = new Label(HallBookingSystem.halls[4]);
                label_hall_name.setLayoutX(100);
                label_hall_name.setLayoutY(500);
                label_hall_name.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 20));
                person_id = new Label(student.getStudentID());
                displayBookingPersonDetails(pane, name, faculty, email, date);

            }
        }
        if (staff_id > 0 && staff_id <=9999) { //if staff ID is valid
            if (hall_num == 1){
                hall_image_view = new ImageView(new Image("file:main audi.jpg"));
                hall_image_view.setFitHeight(300);
                hall_image_view.setFitWidth(300);
                hall_image_view.setLayoutX(100);
                hall_image_view.setLayoutY(100);
                label_hall_name = new Label(HallBookingSystem.halls[0]);
                label_hall_name.setLayoutX(100);
                label_hall_name.setLayoutY(500);
                label_hall_name.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 20));
                person_id = new Label(staff.getStaffID());
                displayBookingPersonDetails(pane, name, faculty, email, date);

            } else if (hall_num == 2){
                hall_image_view = new ImageView(new Image("file:chancellor hall.jpg"));
                hall_image_view.setFitHeight(300);
                hall_image_view.setFitWidth(300);
                hall_image_view.setLayoutX(100);
                hall_image_view.setLayoutY(100);
                label_hall_name = new Label(HallBookingSystem.halls[1]);
                label_hall_name.setLayoutX(100);
                label_hall_name.setLayoutY(500);
                label_hall_name.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 20));
                person_id = new Label(staff.getStaffID());
                displayBookingPersonDetails(pane, name, faculty, email, date);

            } else if (hall_num == 3){
                hall_image_view = new ImageView(new Image("file:culture centre.jpg"));
                hall_image_view.setFitHeight(300);
                hall_image_view.setFitWidth(300);
                hall_image_view.setLayoutX(100);
                hall_image_view.setLayoutY(100);
                label_hall_name = new Label(HallBookingSystem.halls[2]);
                label_hall_name.setLayoutX(100);
                label_hall_name.setLayoutY(500);
                label_hall_name.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 20));
                person_id = new Label(staff.getStaffID());
                displayBookingPersonDetails(pane, name, faculty, email, date);

            } else if (hall_num == 4){
                hall_image_view = new ImageView(new Image("file:rector hall.jpg"));
                hall_image_view.setFitHeight(300);
                hall_image_view.setFitWidth(300);
                hall_image_view.setLayoutX(100);
                hall_image_view.setLayoutY(100);
                label_hall_name = new Label(HallBookingSystem.halls[3]);
                label_hall_name.setLayoutX(100);
                label_hall_name.setLayoutY(500);
                label_hall_name.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 20));
                person_id = new Label(staff.getStaffID());
                displayBookingPersonDetails(pane, name, faculty, email, date);

            } else if (hall_num == 5){
                hall_image_view = new ImageView(new Image("file:greathallharrypotter.jpeg"));
                hall_image_view.setFitHeight(300);
                hall_image_view.setFitWidth(300);
                hall_image_view.setLayoutX(100);
                hall_image_view.setLayoutY(100);
                label_hall_name = new Label(HallBookingSystem.halls[4]);
                label_hall_name.setLayoutX(100);
                label_hall_name.setLayoutY(500);
                label_hall_name.setFont(javafx.scene.text.Font.font("Arial", FontWeight.LIGHT, 20));
                person_id = new Label(staff.getStaffID());
                displayBookingPersonDetails(pane, name, faculty, email, date);
            }

        }
        label_hall_name.setLayoutX(100);
        label_hall_name.setLayoutY(450);
        label_hall_name.setFont(Font.font("Arial", FontWeight.LIGHT, 20));
        person_id.setLayoutX(100);
        person_id.setLayoutY(450);
        pane.getChildren().addAll(label, person_id, hall_image_view, label_hall_name);

        Scene scene = new Scene(pane, 1000, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void displayBookingPersonDetails(AnchorPane pane, String name, String faculty, String email, LocalDate date){
        Button confirm = new Button("Confirm");

        Label label_person_name = new Label("Name: " + name);
        Label label_faculty = new Label("Faculty: " + faculty);
        Label label_email = new Label("Email: " + email);
        Label label_date = new Label("Date: " + date.toString());

        label_person_name.setLayoutX(100);
        label_person_name.setLayoutY(500);
        label_person_name.setFont(Font.font("Arial", FontWeight.LIGHT, 20));
        label_faculty.setLayoutX(100);
        label_faculty.setLayoutY(550);
        label_faculty.setFont(Font.font("Arial", FontWeight.LIGHT, 20));
        label_email.setLayoutX(100);
        label_email.setLayoutY(600);
        label_email.setFont(Font.font("Arial", FontWeight.LIGHT, 20));
        label_date.setLayoutX(100);
        label_date.setLayoutY(650);
        label_date.setFont(Font.font("Arial", FontWeight.LIGHT, 20));
        confirm.setLayoutX(100);
        confirm.setLayoutY(700);
        confirm.setOnAction(e -> closingPage());

        pane.getChildren().addAll(label_person_name, label_faculty, label_email, label_date, confirm);
    }

    public void closingPage(){
        AnchorPane pane = new AnchorPane();
        Label label = new Label("Thank you for booking");
        label.setLayoutX(230);
        label.setLayoutY(300);
        label.setFont(Font.font("Arial", FontWeight.BOLD, 50));
        pane.getChildren().add(label);
        Scene scene = new Scene(pane, 1000, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

//hall booking system
class HallBookingSystem {
    public static String[] halls = {"Main Auditorium", "Chancellor Hall", "Culture Centre", "Rector Hall", "Great Hall"};
    public static void main(String[] args) {

    }
}

//Hall
class Hall {
    static int[] capacity = {1000, 500, 2000, 1500, 3000};
    static boolean[] availability={true, true, true, true, true};

    public Hall() {
    }
    public static Integer getCapacity(int i) {
        for (int k : capacity) {
            return k;
        }
        return null;
    }
    public static Boolean getAvailability(int i) {
        for (boolean b : availability) {
            return b;
        }
        return null;
    }
}

//Booking
class Booking {
    LocalDate bookingDate;

    Booking(){

    }
    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }
}

//Person
class Person {
    String namePerson;
    String faculty;
    String email;
    public Person() {

    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

 class Staff extends Person {
    private String staffID;
     public Staff() {
        super();
        staffID = "";
     }

     public String getStaffID() {
         return staffID;
     }

     public void setStaffID(String staffID) {
         this.staffID = staffID;
     }

}

class Student extends Person{
    private String studentID;
    public Student() {
        super();
        studentID = "";
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}

