Voting System with OTP Authentication

Problem Statement

Traditional voting processes face several challenges:
    
    Difficulty in ensuring one-person-one-vote enforcement.

    Manual verification of voter identity is time-consuming and error-prone.

    Lack of secure methods to record votes.

    No OTP-based authentication to verify voters in real-time.

    Inability to display results efficiently and securely.

To solve these issues, we need a secure, object-oriented Voting System with OTP authentication that ensures unique voter verification and safe vote recording.

Project Description

The Voting System is a console-based Java application demonstrating OOP principles and secure voting mechanisms. It allows Admin and Voter roles with the following features:

Features

    Role-Based Login

        Admin: Can view results.

        Voter: Can vote for candidates only once.

    OTP-Based Authentication

        System generates a 6-digit OTP for secure login.

        Voter must verify OTP before accessing voting functionality.

    Voting Functionality

        Displays candidate list.

        Ensures one-person-one-vote using a voted flag.

        Updates vote counts securely.

    Result Display

        Admin can view the current voting results.

        Displays candidate names and corresponding votes.

    OOP Design

        Uses classes, inheritance, polymorphism, abstraction, and encapsulation for maintainable code.

Tech Stack

    Programming Language: Java

    IDE: Visual Studio Code

    Data Storage: MongoDB

    Version Control: Git & GitHub.

Advantages

    Ensures one-person-one-vote securely.

    Demonstrates OOP principles in real-world application.

    OTP verification increases security and authenticity.

    Modular design allows easy expansion.

Future Enhancements

    Integrate email/SMS OTP delivery.

    GUI interface using JavaFX.

    Audit logs for every vote cast.

