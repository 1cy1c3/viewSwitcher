View Switcher
=================

## Description
Represents a practical possibility to switch between views in terms of JavaFX.

## Prerequisites

+ Java SE 8 or JARs regarding JavaFX

## Operation
1. Set the language
2. Create the MainController and send it to the ViewController
3. Load the first view and send it from the ViewController to the MainController
4. Create the scene and CSS
5. Wait for events

## Usage
At first, you have to compile this project. For more comfort, import the project in `Eclipse` and start the application. For example, 
if you click the menu item `Greeting`, you will see the switching between the views. 
If you want your own view, you will follow subsequent steps. At first, create a FXML according to the following scheme:
```
<StackPane maxHeight="-Infinity" maxWidth="-Infinity"
	minHeight="-Infinity" minWidth="-Infinity" prefHeight="404.0"
	prefWidth="600.0" xmlns="http://javafx.com/javafx/8" xmlns:fx="http://javafx.com/fxml/1"
	fx:controller="controller.WelcomeController">
...
</StackPane>
```
It is very important to write your code in the node `StackPane` because it will be included by the file `main.fxml`. Afterwards, 
you have to write a controller class with binding and mapping (`@FXML`) for your screen. Look at the class `WelcomeController` for comparison. 
Furthermore, deploy and register your view in the `ViewController`, for example:
```
public static final String EXAMPLE = "example.fxml";
```
If you want a switching, use the method `loadView()`, for example

```
@FXML
public void test(ActionEvent event) {
	ViewController.loadView(ViewController.WELCOME);
}
```

## More information
For more information, read the documentation  about JavaFX at http://docs.oracle.com/javase/8/javase-clienttechnologies.htm.
