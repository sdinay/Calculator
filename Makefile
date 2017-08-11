# Makefile for Calculator.java
# sdinay
# 08 - 11 - 2017
# ==================================================================

JAVASRC = Calculator.java
SOURCES = README Makefile $(JAVASRC)
MAINCLASS = Calculator
CLASSES = Calculator.class
JARFILE = Calculator

all: $(JARFILE)

$(JARFILE): $(CLASSES)
	echo Main-class: $(MAINCLASS) > Manifest
	jar cvfm $(JARFILE) Manifest $(CLASSES)
	rm Manifest
	chmod +x $(JARFILE)

$(CLASSES): $(JAVASRC)
	javac -Xlint $(JAVASRC)

run:
	java $(MAINCLASS)

clean:
	rm $(CLASSES) $(JARFILE)
