����   = �  package1/QuizApp  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lpackage1/QuizApp; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V  java/util/ArrayList
  	  java/util/LinkedHashMap
  	 " package1/Question $ $What is the largest mammal on Earth? & java/lang/String ( 1. Elephant * 2. Blue Whale , 3. Shark . 4. Dinosaur
 ! 0  1 )(Ljava/lang/String;[Ljava/lang/String;I)V 3 5 4 java/util/List 6 7 add (Ljava/lang/Object;)Z 9 (Which planet is known as the Red Planet? ; 1. Earth = 2. Mars ? 
3. Jupiter A 4. Venus C 1Which gas do plants absorb during photosynthesis? E 1. CO2 G 2. Nitrogen I 	3. Oxygen K 4. Hydrogen	  M N O out Ljava/io/PrintStream; Q BWelcome to the Quiz! You have 10 seconds to answer each question.

 S U T java/io/PrintStream V W println (Ljava/lang/String;)V 3 Y Z [ iterator ()Ljava/util/Iterator; ] _ ^ java/util/Iterator ` a next ()Ljava/lang/Object;	 ! c d e questionText Ljava/lang/String;	 ! g h i options [Ljava/lang/String; k Enter your answer (1-4): 
 S m n W print
  p q r currentTimeMillis ()J
  t u v 
hasNextInt ()Z
  x y z nextInt ()I      ' ~ 
Time's up! No answer recorded.
 � � � java/lang/Boolean � � valueOf (Z)Ljava/lang/Boolean; � � � java/util/Map � � put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;	 ! � � � correctAnswer I � Correct! � Wrong!
 S � V  ] � � v hasNext � 
--- Quiz Results --- � java/lang/StringBuilder � Your Score: 
 � �  W
 � � � � append (I)Ljava/lang/StringBuilder; � /
 � � � � -(Ljava/lang/String;)Ljava/lang/StringBuilder; 3 � � z size
 � � � � toString ()Ljava/lang/String; � � � � entrySet ()Ljava/util/Set; � Y � java/util/Set � java/util/Map$Entry � � � a getKey � � � a getValue
 � � � v booleanValue � 
Question:  � Your Answer:  � Correct � 	Incorrect � Correct Answer: 
  � �  close args scanner Ljava/util/Scanner; 	questions Ljava/util/List; score results Ljava/util/Map; question Lpackage1/Question; option 	startTime J answered Z 
userAnswer entry Ljava/util/Map$Entry; correct LocalVariableTypeTable %Ljava/util/List<Lpackage1/Question;>; 7Ljava/util/Map<Lpackage1/Question;Ljava/lang/Boolean;>; =Ljava/util/Map$Entry<Lpackage1/Question;Ljava/lang/Boolean;>; StackMapTable i 
SourceFile QuizApp.java InnerClasses Entry !               /     *� �    
                    	      �    ]� Y� � L� Y� M>� Y�  :,� !Y#� %Y'SY)SY+SY-S� /� 2 W,� !Y8� %Y:SY<SY>SY@S� /� 2 W,� !YB� %YDSYFSYHSYJS� /� 2 W� LP� R,� X :� �� \ � !:� L� b� R� fY:
�6	6� 
2:� L� R�	��� Lj� l� o76	6
� +� s� +� w6
6	� � oe {����	� � L}� R� � � W� A
d� �� � L�� R�� � � W� � L�� R� � � W� L� �� � �� � L�� R� L� �Y�� �� ��� �,� � � �� �� R� � � � :� �� \ � �:� � � !:� � � �� �6� L� �Y· �� b� �� �� R� L� �Yķ �� Ƨ ȶ �� �� R� L� �Yʷ �� f� �2� �� �� R� � ��w+� ̱    
   � :            #  %  =  A  G  L  N  f   j  p ! u " w # � $ � ! � & � ( � ) � * � + � * � / � 0 � 1 � 2  4 5
 6 7 8 4# <( =0 >> ?M @U AX Bf Ci Dq E H� (� L� M� N� O� P� Q R. SN NX V\ W    �   ] � i   R � �  J � �  H � �  ? � �  � � � �  �  � e  � � � �  � � � � 	  � � � 
� v � � � j � � � [ � �  �      J � �  ? � � � v � �  �   � � �  �  3 �  ]  � '  �  3 � ! ]  �  �  
 �  3 � ! ]  '�   �  3 �  ]  � F� V 	 �  3 � � ] !  S ��  	 �  3 � � ] !  S � %� (  �  3 �  ]    �    � �   
  � � �	