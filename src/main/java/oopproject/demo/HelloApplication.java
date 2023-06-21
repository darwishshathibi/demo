package oopproject.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
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

        //later add button to check availability
//        Button btn_main_audi = new Button("Details and Availability");
//        btn_main_audi.setOnAction(actionEvent -> {
//            checkAvailability();
//        });

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

        pane.getChildren().addAll(label, main_audi, label_main_audi, chancellor_hall, label_chancellor_hall, culture_centre, label_culture_centre, rector_hall, label_rector_hall, great_hall, label_great_hall);
        Scene scene = new Scene(pane, 1000, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

//    public static void checkAvailability(){
//        Stage stage = new Stage();
//        AnchorPane pane = new AnchorPane();
//        Label label = new Label();
//    }
    public static void main(String[] args) {
        launch();
    }
}

//hall booking system
class HallBookingSystem {
    public static String[] halls = {"Main Auditorium", "Chancellor Hall", "Culture Centre", "Rector Hall", "Great Hall"};
    public static void main(String[] args) {

//        bookHall();
//        cancelBooking();
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
    private int[] capacity = {1000, 500, 2000, 1500, 3000};
    private boolean[] availability={true, true, true, true, true};
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

    public int[] getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = new int[]{capacity};
    }

    public boolean[] getAvailability() {
        return availability;
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
    String namePerson;
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

