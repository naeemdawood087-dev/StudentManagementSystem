package main;

import student.Student;
import course.Course;
import enrollment.Enrollment;
import payment.PaymentMethod;
import payment.CreditCardPayment;

public class Main {
    public static void main(String[] args) {

// Instantiating Student and Course objects
        Student student1 = new Student("SE-02077", "Dawood Naeem",
                "naeemdawood087@gmail.com");
        Course course1 = new Course("SE-983", "Software Construction", 4);
        student1.displayProfile();
        course1.displayCourseInfo();
// Enrolling Student into Course
        Enrollment currentEnrollment = new Enrollment(student1, course1);
        currentEnrollment.printEnrollmentSummary();
// Processing Fee Payment via Interface
        System.out.println("\n[System] Initiating Fee Payment...");
        PaymentMethod payment = new CreditCardPayment("2352-3466-8374-9333");
        boolean paymentSuccess = payment.pay(122000.00);
        if (paymentSuccess) {
            currentEnrollment.completeEnrollment();
            currentEnrollment.printEnrollmentSummary();
        }
    }
}