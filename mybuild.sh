# react project build
cd ../caprj240521-frontend
npm run build

# index.html, main.js 복사(이동) : dist -> static
cd ../caprj240521-backend
rm -rf src/main/resources/static
mv ../caprj240521-frontend/dist src/main/resources/static

# spring project build
./gradlew bootJar

# build/libs/prj.jar -> ec2 에 복사
scp -i src/main/resources/secret/key1123.pem build/libs/caprj240521-backend-0.0.1-SNAPSHOT.jar ubuntu@52.79.251.74:~/caprj240521/build/libs/.

# 이미 실행된 컨테이너 멈추고
ssh -i src/main/resources/secret/key1123.pem ubuntu@52.79.251.74 'docker stop my-caprj240521'
# 컨테이너 삭제
ssh -i src/main/resources/secret/key1123.pem ubuntu@52.79.251.74 'docker rm my-caprj240521'
# docker image 만들고
ssh -i src/main/resources/secret/key1123.pem ubuntu@52.79.251.74 'docker build -t my-caprj240521 ~/caprj240521/.'
# 컨테이너 실행
ssh -i src/main/resources/secret/key1123.pem ubuntu@52.79.251.74 'docker run -d -p 8080:8080 --restart always --name my-caprj240521 my-caprj240521'
