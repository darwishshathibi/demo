package oopproject.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;



public class HelloApplication extends Application {

     private Stage primaryStage;
    @Override
    public void start(Stage primaryStage) throws IOException {
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
        btn_continue.setOnAction(actionEvent -> {
            bookHall();
        });
        pane.getChildren().addAll(label, btn_continue);
        Scene scene = new Scene(pane, 1000, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void bookHall(){
        AnchorPane pane = new AnchorPane();
        Label label = new Label("Hall list");
        label.setAlignment(Pos.CENTER);
        label.setFont(javafx.scene.text.Font.font("Arial", FontWeight.BOLD, 30));
        label.setLayoutX(420);
        label.setLayoutY(10);

        //image and label for main audi
        Image main_audi_image = new Image("https://upload.wikimedia.org/wikipedia/commons/2/2f/Wien_-_Staatsoper%2C_Zuschauerraum_mit_B%C3%BChne.JPG");
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
        btn_book_main_audi.setOnAction(actionEvent -> {
            addBooking(1);
        });

        //image and label for chancellor hall
        Image chancellor_hall_image = new Image("https://sagigurlz.files.wordpress.com/2009/07/chancellor.jpg");
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
        btn_book_chancellor_hall.setOnAction(actionEvent -> {
            addBooking(2);
        });

        //image and label for culture centre
        Image culture_centre_image = new Image("https://www.rbsothailand.com/wp-content/uploads/2021/05/Group-136.jpg");
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
        btn_book_cultural_centre.setOnAction(actionEvent -> {
            addBooking(3);
        });

        //image and label for rector hall
        Image rector_hall_image = new Image("https://ballroomatuva.org/wp-content/uploads/2014/08/facing-main-lounge-1024x679.jpg");
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
        btn_book_rector_hall.setOnAction(actionEvent -> {
            addBooking(4);
        });

        //image and label for great hall
        Image great_hall_image = new Image("https://media.wired.com/photos/593311acf682204f7369847a/master/w_2560%2Cc_limit/greathall.jpg");
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
        btn_book_great_hall.setOnAction(actionEvent -> {
            addBooking(5);
        });

        //button check availability
        Button btn_check_availability = new Button("Check Availability");
        btn_check_availability.setLayoutX(770);
        btn_check_availability.setLayoutY(650);
        btn_check_availability.setOnAction(actionEvent -> {
            checkAvailability();
        });

        pane.getChildren().addAll(label, main_audi, label_main_audi, chancellor_hall, label_chancellor_hall, culture_centre, label_culture_centre, rector_hall, label_rector_hall, great_hall, label_great_hall, btn_check_availability, btn_book_chancellor_hall, btn_book_cultural_centre, btn_book_great_hall, btn_book_main_audi, btn_book_rector_hall);
        Scene scene = new Scene(pane, 1000, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //method to check availability
    public static void checkAvailability(){
        Stage stage = new Stage();
        GridPane pane = new GridPane();
        Label label = new Label("Check Availability");
        for (int i = 0; i < HallBookingSystem.halls.length; i++) {
            Label hall = new Label("Hall");
            Label availability = new Label("Availability");
            Label capacity = new Label("Capacity");
            Label label_hall = new Label(HallBookingSystem.halls[i]);
            Label label_availability = new Label(
                    Hall.availability[i] ? "Available" : "Not Available"
            );
            Label label_capacity = new Label(String.valueOf(Hall.capacity[i]));
            pane.add(hall, 0, 0);
            pane.add(availability, 1, 0);
            pane.add(capacity, 2, 0);
            pane.add(label_hall, 0, i + 1);
            pane.add(label_availability, 1, i + 1);
            pane.add(label_capacity, 2, i + 1);
        }

        Scene scene = new Scene(pane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
    //method to book hall
    public void addBooking(int num){
        Label label = new Label("Booking Details");
        Label label_hall= new Label();
        Label label_capacity = new Label();
        Label label_availability = new Label();
        AnchorPane pane = new AnchorPane();
        if (num == 1){
            label = new Label("Booking Details");
            label_hall = new Label("Hall: "+HallBookingSystem.halls[0]);
            label_capacity = new Label("Capacity: "+Hall.getCapacity(0));
            label_availability = new Label("Availability: "+(Boolean.TRUE.equals(Hall.getAvailability(0)) ? "Available" : "Not Available"));
            pane.getChildren().addAll(label, label_hall, label_capacity, label_availability);
        } else if (num == 2){
            label = new Label("Booking Details");
            label_hall = new Label("Hall: "+HallBookingSystem.halls[1]);
            label_capacity = new Label("Capacity: "+Hall.getCapacity(1));
            label_availability = new Label("Availability: "+(Boolean.TRUE.equals(Hall.getAvailability(1)) ? "Available" : "Not Available"));
            pane.getChildren().addAll(label, label_hall, label_capacity, label_availability);
        } else if (num == 3){
            label = new Label("Booking Details");
            label_hall = new Label("Hall: "+HallBookingSystem.halls[2]);
            label_capacity = new Label("Capacity: "+Hall.getCapacity(2));
            label_availability = new Label("Availability: "+(Boolean.TRUE.equals(Hall.getAvailability(2)) ? "Available" : "Not Available"));
            pane.getChildren().addAll(label, label_hall, label_capacity, label_availability);
        } else if (num == 4){
            label = new Label("Booking Details");
            label_hall = new Label("Hall: "+HallBookingSystem.halls[3]);
            label_capacity = new Label("Capacity: "+Hall.getCapacity(3));
            label_availability = new Label("Availability: "+(Boolean.TRUE.equals(Hall.getAvailability(3)) ? "Available" : "Not Available"));
            pane.getChildren().addAll(label, label_hall, label_capacity, label_availability);
        } else if (num == 5){
            label = new Label("Booking Details");
            label_hall = new Label("Hall: "+HallBookingSystem.halls[4]);
            label_capacity = new Label("Capacity: "+Hall.getCapacity(4));
            label_availability = new Label("Availability: "+(Boolean.TRUE.equals(Hall.getAvailability(4)) ? "Available" : "Not Available"));
            pane.getChildren().addAll(label, label_hall, label_capacity, label_availability);
        }
        label.setLayoutX(100);
        label.setLayoutY(50);
        label.setFont(javafx.scene.text.Font.font("Arial", FontWeight.BOLD, 40));
        label_hall.setLayoutX(100);
        label_hall.setLayoutY(100);
        label_capacity.setLayoutX(100);
        label_capacity.setLayoutY(150);
        label_availability.setLayoutX(100);
        label_availability.setLayoutY(200);

        //fill in details
        Label label_name = new Label("Name: ");
        TextField text_name = new TextField();
        label_name.setLayoutX(100);
        label_name.setLayoutY(250);
        text_name.setLayoutX(200);
        text_name.setLayoutY(250);
        Label faculty = new Label("Faculty: ");
        TextField text_faculty = new TextField();
        faculty.setLayoutX(100);
        faculty.setLayoutY(300);
        text_faculty.setLayoutX(200);
        text_faculty.setLayoutY(300);
        Label contact = new Label("Contact: ");
        TextField text_contact = new TextField();
        contact.setLayoutX(100);
        contact.setLayoutY(350);
        text_contact.setLayoutX(200);
        text_contact.setLayoutY(350);
        Button btn_book = new Button("Book");
        btn_book.setLayoutX(200);
        btn_book.setLayoutY(400);
        pane.getChildren().addAll(label_name, text_name, faculty, text_faculty, contact, text_contact, btn_book);

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

//        bookHall();
//        addBooking();
//        checkAvailability();
//        displayBooking();

    }

    public static void cancelBooking(){
        System.out.println("Cancel Booking");
    }

    public static void displayBooking(){
        System.out.println("Display Booking");
    }
}

//Hall
class Hall {
    private String hallName;
    static int[] capacity = {1000, 500, 2000, 1500, 3000};
    static boolean[] availability={true, true, true, true, true};
    private Booking bookingDetails;

    public Hall() {
    }

    public Hall(String hallName, int capacity, boolean availability, Booking bookingDetails) {
        this.hallName = hallName;
        this.capacity = new int[]{capacity};
        this.availability = new boolean[]{availability};
        this.bookingDetails = bookingDetails;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public static Integer getCapacity(int i) {
        for (int j = 0; j < capacity.length; j++) {
            return capacity[i];
        }
        return null;
    }

    public void setCapacity(int capacity) {
        this.capacity = new int[]{capacity};
    }

    public static Boolean getAvailability(int i) {
        for (int j = 0; j < availability.length; j++) {
            return availability[i];
        }
        return null;
    }

    public void setAvailability(boolean availability) {
        this.availability = new boolean[]{availability};
    }

    public Booking getBookingDetails() {
        return bookingDetails;
    }

    public void addBookingDetails(Booking bookingDetails) {
        this.bookingDetails = bookingDetails;
    }
    public void removeBookingDetails(Booking bookingDetails) {
        this.bookingDetails = bookingDetails;
    }

    @Override
    public String toString() {
        return "Hall{" +
                "hallName='" + hallName + '\'' +
                ", capacity=" + capacity +
                ", availability=" + Arrays.toString(availability) +
                ", bookingDetails=" + bookingDetails +
                '}';
    }
}

//Booking
class Booking {
    int bookingID;
    Date bookingDate;
    Person person;
    Hall hall;

    Booking(){

    }
    Booking(int bookingID){

    }
    Booking(int bookingID, Date bookingDate){

    }
    Booking(int bookingID, Date bookingDate,Person person){

    }
    Booking(int bookingID, Date bookingDate,Person person,Hall hall){

    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }
}

//Person
class Person {
    static String namePerson;
    String faculty;
    int contact;

    public Person (String namePerson, String faculty, int contact){
        this.namePerson = namePerson;
        this.faculty = faculty;
        this.contact = contact;
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

    public void setContact(int contact) {
        this.contact = contact;
    }

    public int getContact() {
        return contact;
    }

    public String toString(){
        return "Name: " + namePerson + "\n" + "Faculty: " +
                faculty + "\n" + "Contact: " + contact + "\n";
    }
}

class Staff extends Person{
    private String position;

    public Staff(String position, String namePerson, String faculty, int contact) {
        super(namePerson, faculty, contact);
        this.position = position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public String toString(){
        return "student: " + super.toString() +  "Name: " + namePerson + "\n" + "Faculty: " +
                faculty + "\n" + "Contact: " + contact + "\n";
    }
}

class Student extends Person{
    private int year;

    public Student(int year, String namePerson, String faculty, int contact) {
        super(namePerson, faculty, contact);
        this.year = year;
    }

    public Student(String namePerson, String faculty, int contact) {
        super(namePerson, faculty, contact);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
        return "student: " + super.toString() +  "Name: " + namePerson + "\n" + "Faculty: " +
                faculty + "\n" + "Contact: " + contact + "\n" + "Year: " + year + "\n";
    }
}

