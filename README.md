### 1. before the package. 

```
export BRAINTREE_MERCHANT_ID=jcfy2n6wffwnnqrb
export BRAINTREE_PUBLIC_KEY=44m26tpq76tywdrj
export BRAINTREE_PRIVATE_KEY=279cf365ecbc38d85b90f881c91b3c39
export RECAPTCHA_PUBLIC_KEY=6Le-9uwlAAAAAJ7iuCPh2RUCPC98TmdpKw55-qqN
export RECAPTCHA_PRIVATE_KEY=6Le-9uwlAAAAAMHJmd5yd-EWFfp-W0edeUfefXqI
```

### 2. make
``
mvn package clean
``

### Running The Server
```
java -Dbraintree.merchantId=jcfy2n6wffwnnqrb -Dbraintree.publicKey=44m26tpq76tywdrj -Dbraintree.privateKey=279cf365ecbc38d85b90f881c91b3c39 -Drecaptcha.private.key=6Le-9uwlAAAAAMHJmd5yd-EWFfp-W0edeUfefXqI -Drecaptcha.public.key=6Le-9uwlAAAAAJ7iuCPh2RUCPC98TmdpKw55-qqN -jar webapp/target/dependency/webapp-runner.jar --port 8081 --path pizzeria webapp/target/*.war
```

#### Verify

Go to [http://localhost:8081/pizzeria/](http://localhost:8081/pizzeria/) to check that the app is up and running.

### Requirements
```java-8-openjdk```

## Built With
