//initialization key ,check ls -al exist file
keytool -genkeypair -alias apiEncryptionKey -keyalg RSA -dname "CN=Ting Lee, OU=API Development, O=joneconusulting.co.kr, L=Seoul, C=KR" -keypass "test1234" -keystore apiEncryptionKey.jks -storepass "test1234"

keytool -list -keystore apiEncryptionKey.jks -v



//import private key
keytool -export -alias apiEncryptionKey -keystore apiEncryptionKey.jks -rfc -file trustServer.cer


// import public key
keytool -import -alias trustServer -file trustServer.cer -keystore publicKey.jks




file : PATH =/Users/nommml/Documents/MSA/Work/keystore

