# 기본 OpenJDK 이미지 사용
FROM openjdk:17-jdk

# .jar 파일의 경로를 빌드 컨텍스트에 매핑
COPY . /app

# JAR 파일을 복사하고 어플리케이션 실행을 위한 entry point 지정
ENTRYPOINT ["java", "-Dspring.profiles.active=doker", "-jar", "/app/simpleCRUD-0.0.1-SNAPSHOT.jar"]
