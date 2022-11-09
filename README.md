# lab2-tutorial-example
Lab2 tutorial examples as presented in the tutorial

This tutorial covers XText textual domain specific modeling language with a factory metamodel. The concepts covered in the tutorial are creating an XText Grammer for a [hammer factory metamodel](https://github.com/MEws22/lab2-tutorial-example/tree/main/tutorial) as given in Figure. 1, running an eclipse instance to create a textual instance of the textual grammar and scoping.

![factory_metamodel](https://user-images.githubusercontent.com/12189156/200930038-d0602fa6-83a8-45b3-a3f2-c3af0435003b.png)


The [metamodel](https://github.com/MEws22/lab2-tutorial-example/tree/main/tutorial) covers the concepts presented in the video tutorial [here](https://www.youtube.com/watch?v=EKpqPX5tcn0). You can refer to the video tutorial to see how to define an XText grammar, run an eclipse instance to create a textual model of your defined grammar and also writing some Java code for scoping.

There is a slight difference with the XText behaviour with respect to scoping due to the updated version of XText being used in this course. In order to do relative referencing, now you will need to add an EString while defining XText grammar for elements that require relative referencing.

For example -- 

A rule for  ```ItemConnection``` is as follows in the XText grammar [here](https://github.com/MEws22/lab2-tutorial-example/blob/main/tutorial.xtext/src/at/ac/tuwien/big/Tutorial.xtext)

```
  ItemConnection returns ItemConnection:
	componentA=[Component] '(' markerA=[Marker] ')' '<->' componentB=[Component] '(' markerB=[Marker] ')'
 ;
```
Here, instead of using only ```markerA=[Marker]```, you create a reference to ```Marker``` as ```markerA=[Marker|EString]```. Adding ```|EString``` ensures that Xtext can find the element when you have a relative referencing and automatically enclose the reference with quotes. Without ```|EString``` XText will not be able to find the referenced element,  Therefore, now the ItemConnection rule would look like -

```
ItemConnection returns ItemConnection:
	componentA=[Component] '(' markerA=[Marker|EString] ')' '<->' componentB=[Component] '(' markerB=[Marker|EString] ')'
;
```
Without adding EString, XText compiler cannot find the element and it gives error such as -- 
```Couldn't resolve reference to Marker```

<img width="500" alt="referencing_error" src="https://user-images.githubusercontent.com/12189156/200928949-debdf7fc-91e7-4994-8ea1-ab09793a2362.png">

After adding EString, XText compiler is able to find the element and gives no error.

<img width="500" alt="referencing_resolvedpng" src="https://user-images.githubusercontent.com/12189156/200929043-e2a078bf-dbdf-410a-b7d2-1ac923dbba2f.png">

##Scoping

Scoping assists the modeling in providing suggestions for autocompletion while creating a model, similar to the suggestions in any IDE. You can check out the details of scoping in the video tutorial.

As an example, there are four scoping examples provided in the [scoping file](https://github.com/MEws22/lab2-tutorial-example/blob/main/tutorial.xtext/src/org/xtext/example/scoping/TutorialScopeProvider.java)
1. Scoping on ```Component``` ```itemType``` relationship to suggest only basic item types
2. Scoping on ```ItemConnection``` ```componentA``` relationship to suggest components that are part of the containing complex item
3. Scoping on ```ItemConnection``` ```markerA``` relationship to suggest ```markers``` of the ```itemType``` of ```componentA```
4. Scoping on ```ItemConnection``` ```componentA``` relationship to suggest components that are part of containing complex item excluding ```componentA```

<img width="500" alt="Xtext_Autocompletion" src="https://user-images.githubusercontent.com/12189156/200946060-5964dfae-ed87-4d21-8e74-1b301384b14b.png">

Moreover, referencing objects as a result of scoping allows the modeler to simply use the name of the referenced element without relative referencing as shown below. Even though the reference of itemConneciton with markerA is defined as ```markerA=[Marker|EString]```, ```HandleConnectionPoint``` forms part of the suggestions while modeling and on selecting, XText references it directly by its name. 
Note that if you apply scoping on a reference, you do not need to have ```|EString``` in the rule.

So finally, the ```itemConnection``` looks like this -- 

<img width="500" alt="ScopingExample" src="https://user-images.githubusercontent.com/12189156/200946102-45a58170-2cc7-4bda-946f-f4f32276690b.png">
