# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.3.RELEASE/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.3.RELEASE/maven-plugin/build-image.html)
* [Spring Integration JPA Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/jpa.html)
* [Spring Integration Test Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/testing.html)
* [Spring Integration HTTP Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/http.html)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.3.3.RELEASE/reference/htmlsingle/index.html#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.3.3.RELEASE/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Spring Integration](https://docs.spring.io/spring-boot/docs/3.3.3.RELEASE/reference/htmlsingle/index.html#messaging.spring-integration)
* [Google Cloud Messaging](https://googlecloudplatform.github.io/spring-cloud-gcp/reference/html/index.html#cloud-pubsub)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Integrating Data](https://spring.io/guides/gs/integration/)
* [Google Cloud Pub/Sub Sample](https://github.com/GoogleCloudPlatform/spring-cloud-gcp/tree/main/spring-cloud-gcp-samples/spring-cloud-gcp-pubsub-sample)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

