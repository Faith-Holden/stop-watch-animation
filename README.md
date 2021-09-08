# stop-watch-animation
My solution for Chapter 13 Exercise 2 of “Introduction to Programming Using Java”.
Implementation: This was a simple modification of the StopWatchLabel.java class provided
by the textbook's author. I edited the class to use an animation to display elapsed seconds.

NOTE: This is a javafx program. It requires the javafx library as a dependency. (See bottom of this README for javafx instructions).

Problem Description:
The StopWatchLabel component from Subsection 13.3.1 displays the text “Timing. . . ”
when the stopwatch is running. It would be nice if it displayed the elapsed time since
the stopwatch was started. For that, you need to create an AnimationTimer. (See Subsec-
tion 6.3.5.) Add an AnimationTimer to the original source code, StopWatchLabel.java, to
drive the display of the elapsed time in seconds.

Javafx setup instructions:
Download javafx from: https://gluonhq.com/products/javafx/ (I used javafx 12). Save it to a location of your choice.
Unpack the zip folder.
Open my project with your IDE of choice (I use intellij IDEA).
Add the javafx/lib folder as an external library for the project. For intellij, this means going to "project structure" -> "libraries" -> "add library" ->{javafx location}/lib
Add the following as a VM argument for the project: --module-path "{full path to your javafx/lib folder}" --add-modules javafx.controls,javafx.fxml,javafx.base,javafx.graphics,javafx.media,javafx.swing,javafx.web
Build and run the project as normal.
