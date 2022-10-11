all: build

build:
	cd src && javac -d ../bin trabalho/Main.java
	cd bin && java trabalho.Main
