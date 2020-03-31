# udemy_file_in_java
Trabalhar com ficheiros em Java


### classes
- File - Representação abstrata de um arquivo e seu caminho
  - https://docs.oracle.com/javase/10/docs/api/java/io/File.html
- Scanner - Leitor de texto
  - https://docs.oracle.com/javase/10/docs/api/java/util/Scanner.html
- IOException (Exception)
  - https://docs.oracle.com/javase/10/docs/api/java/io/IOException.html

### read file
- FileReader (stream de leitura de caracteres a partir de arquivos)
  - https://docs.oracle.com/javase/10/docs/api/java/io/FileReader.html
- BufferedReader (mais rápido)
  - https://docs.oracle.com/javase/10/docs/a
- Bloco try-with-resources
  - https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
 
### write file
- FileWriter (stream de escrita de caracteres em de arquivos)
  - https://docs.oracle.com/javase/10/docs/api/java/io/FileWriter.html
  - Cria/recria o arquivo: new FileWriter(path)
  - Acrescenta ao arquivo existente: new FileWriter(path, true)
- BufferedWriter (mais rápido)
  - https://docs.oracle.com/javase/10/docs/api/java/io/BufferedWriter.html