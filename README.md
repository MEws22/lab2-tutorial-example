# lab2-tutorial-example
Lab2 tutorial examples as presented in the tutorial

This tutorial covers XText textual domain specific modeling language with a factory metamodel. The concepts covered in the tutorial are creating an XText Grammer for a [hammer factory metamodel](https://github.com/MEws22/lab2-tutorial-example/tree/main/tutorial) as given in Figure. 1.


The [metamodel](https://github.com/MEws22/lab2-tutorial-example/tree/main/tutorial) covers the concepts presented in the video tutorial [here](https://www.youtube.com/watch?v=EKpqPX5tcn0). This includes defining an XText Grammar and scoping. 

You can refer to the video tutorial to see how to define an XText grammar, run an eclipse instance to create a textual model of your defined grammar and also writing some Java code for scoping.

There is a slight difference with the XText behaviour with respect to scoping due to the updated version of XText being used in this course. In order to do relative referencing, now you will need to add an EString while defining XText grammar for elements that require relative referencing.

For example -- 

A rule for  ```ItemConnection``` as follow in the XText grammar [here](https://github.com/MEws22/lab2-tutorial-example/blob/main/tutorial.xtext/src/at/ac/tuwien/big/Tutorial.xtext)

```
  ItemConnection returns ItemConnection:
	componentA=[Component] '(' markerA=[Marker] ')' '<->' componentB=[Component] '(' markerB=[Marker] ')'
 ;
```
Here, instead of using only ```markerA=[Marker]```, you create a reference to ```Marker``` as ```markerA=[Marker|EString]```. Adding |EString ensures that when you have a relative referencing, XText automatically encloses the reference with quotes. Therefore, now the ItemConnection rule would look like -

```
ItemConnection returns ItemConnection:
	componentA=[Component] '(' markerA=[Marker|EString] ')' '<->' componentB=[Component] '(' markerB=[Marker|EString] ')'
;
```
Without adding EString, XText compiler cannot find the element and it gives error such as -- 
```Couldn't resolve reference to Marker```

<img width="635" alt="referencing_error" src="https://user-images.githubusercontent.com/12189156/200928949-debdf7fc-91e7-4994-8ea1-ab09793a2362.png">

After adding EString, XText compiler is able to find the element and gives no error.

<img width="836" alt="referencing_resolvedpng" src="https://user-images.githubusercontent.com/12189156/200929043-e2a078bf-dbdf-410a-b7d2-1ac923dbba2f.png">
