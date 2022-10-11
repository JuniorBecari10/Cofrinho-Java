all: build

build:
	cd src && javac -d ../bin Trabalho/Principal.java
	cd bin && java Trabalho.Principal
