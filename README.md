# servidorMock
Servidor básico en java.

Ejecutar proyecto:

D:\programas\java\jdk-20.0.1\bin\java.exe -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\ServidorMock\target\classes;C:\Users\local\.m2\repository\com\sun\net\httpserver\http\20070405\http-20070405.jar;C:\Users\local\.m2\repository\org\apache\commons\commons-lang3\3.12.0\commons-lang3-3.12.0.jar io.acaeronte.Servidor contexto_path_subpath

Una vez levantado el servidor y a la escucha, desde una herramienta externa (curl desde terminal, postman, soapui, etc)
Hacer una llamada, por ejemplo:

<code> curl --location --request GET 'http://localhost:8001/contexto/path/subpath' </code> 

