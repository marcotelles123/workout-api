-- Run app:
    ./gradlew bootRun

-- build app
    ./gradlew clean bootJar

--docker
    docker build --no-cache -t workout-api .

--docker-compose
    docker-compose up --build
    docker-compose down

--swagger
    http://localhost:8080/swagger-ui.html


to remmeber:
identify why swager are not showing the examples when I use lombok fiel, when I use a regular get and set it works properly

