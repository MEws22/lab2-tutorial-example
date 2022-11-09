# lab2-tutorial-example
Lab2 tutorial examples as presented in the tutorial

This tutorial covers XText textual domain specific modeling language with a factory metamodel. The concepts covered in the tutorial are creating an XText Grammer for a [hammer factory metamodel](https://github.com/MEws22/lab2-tutorial-example/tree/main/tutorial) as given in Figure. 1.

![factory_metamodel](https://user-images.githubusercontent.com/12189156/200930038-d0602fa6-83a8-45b3-a3f2-c3af0435003b.png)


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

##Scoping

Scoping assists the modeling in providing suggestions for autocompletion while creating a model, similar to the suggestions in any IDE. You can check out the details of scoping in the video tutorial.

As an example, there are four scoping examples provided in the [scoping file](https://github.com/MEws22/lab2-tutorial-example/blob/main/tutorial.xtext/src/org/xtext/example/scoping/TutorialScopeProvider.java)
1. Scoping on ```Component``` ```itemType``` relationship to suggest only basic item types
2. Scoping on ```ItemConnection``` ```componentA``` relationship to suggest components that are part of the containing complex item
3. Scoping on ```ItemConnection``` ```markerA``` relationship to suggest ```markers``` of the ```itemType``` of ```componentA```
4. Scoping on ```ItemConnection``` ```componentA``` relationship to suggest components that are part of containing complex item excluding ```componentA```


Moreover, referencing objects as a result of scoping allows the modeler to simply use the name of the referenced element without relative referencing as shown below. Even though the reference of itemConneciton with markerA is defined as ```markerA=[Marker|EString]```, ```HandleConnectionPoint``` forms part of the suggestions while modeling and on selecting, XText references it directly by its name.

<img width="1059" alt="image" src="https://user-images.githubusercontent.com/12189156/200943977-90a3c27e-8f5e-45a7-9502-f359901cfc8a.png">

So finally, the ```itemConnection``` looks like this -- 
<img width="1049" alt="image" src="https://user-images.githubusercontent.com/12189156/200943213-a2e570df-1aab-4ce0-a423-eedf3481d320.png">

