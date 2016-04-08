echo Compilando ...
rd /s/q bin
md bin
javac -cp bin -d bin src\tempo\Horario.java
javac -cp bin -d bin src\principal\Main.java
