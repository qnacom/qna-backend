plugins {
	java
	id("org.springframework.boot") version "3.2.4"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "com.techninja"
version = "0.0.1-SNAPSHOT"

tasks.getByName<Jar>("jar") {
	enabled = false
}

java {
	sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.2.4")
	implementation("org.postgresql:postgresql:42.7.3")
	implementation("org.liquibase:liquibase-core:4.27.0")


	testImplementation ("org.apache.httpcomponents.client5:httpclient5")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
