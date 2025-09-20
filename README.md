# Voting-System

This project proposes a Java-based secure digital voting system that ensures unique voter identification, one-person-one-vote enforcement, and OTP-based authentication.
It allows voters to register/login using a unique ID, verifies them via a system-generated OTP, and grants access to the ballot only upon successful verification.
Votes are recorded securely in a file or database to prevent tampering and ensure accurate result counting.

OOP Concepts Used in the Project

    1.Class & Object

    2.Encapsulation

    3.Inheritance

    4.Polymorphism (Overriding)

    5.Abstraction

Class & Object

    Classes like Voter, Candidate, OTPService, and VotingSystem are blueprints.

    Objects are created from these classes (e.g., new Voter("user1@example.com")).

Encapsulation

    Fields (name, votes, hasVoted) are marked private or protected.

    Getters/Setters (getVotes(), markVoted()) provide controlled access.

    Keeps data safe and prevents direct manipulation.

Inheritance

    Voter extends Person.

    Common property id is reused instead of rewriting it.

    Promotes code reusability.

Polymorphism (Overriding)

    display() in Person is overridden in Voter to show extra info (like vote status).

    Same method name but different behavior.

Abstraction

    VotingSystem hides complex details (OTP generation, file saving) behind simple method calls like startElection() or castVote().

    User just interacts with a few methods without knowing the behind-the-scenes logic.