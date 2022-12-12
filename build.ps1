quarkus build
docker build . -f .\src\main\docker\Dockerfile.jvm -t fiap/quarkus-joinha:1.0.0
docker compose up