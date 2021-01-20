JFLAGS = -g
JC = javac
JVM= java 
FILE= tictactoe

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	TicGame.java \
	Player.java \
	Computer.java

MAIN = tictactoe 

default: classes

classes: $(CLASSES:.java=.class)

run: 
	$(JVM) $(MAIN)

clean:
	$(RM) *.class