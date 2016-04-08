echo Compilando ...
rm -rf bin
mkdir bin
javac -cp bin -d bin src/tempo/Horario.java
javac -cp bin -d bin src/principal/Main.java
