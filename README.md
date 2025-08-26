# Voting-System

PROBLEM STATEMENT:

Traditional voting methods often involve manual processes that are time-consuming, prone to errors, and susceptible to manipulation. Even in computerized systems, lack of strong authentication mechanisms can lead to issues such as unauthorized access, duplicate voting, or vote tampering.

The core challenge is to design a simple yet secure digital voting system that ensures:

        => Unique voter identification.

        => One-person-one-vote enforcement.

        => OTP-based verification to prevent impersonation.

        => Tamper-proof vote recording in a database or file system.

The proposed project is a Java application that simulates a secure electronic voting process. The system will:

        => Allow voters to register/login using their unique ID (like email or phone number).

        => Generate a random OTP (One-Time Password) and display/send it (simulated in console).

        => Authenticate the voter using OTP before granting access to the ballot.

        => Ensure that each registered voter can cast only one vote.

        => Record votes securely in a structured file/database for result counting.

By integrating OTP verification in a lightweight console application, the project provides a practical demonstration of secure authentication and vote management, making it suitable for academic exploration and small-scale election simulations.