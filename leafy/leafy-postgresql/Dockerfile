# PostgreSQL 13 버전을 베이스 이미지로 사용
FROM postgres:13

# /docker-entrypoint-initdb.d/에 있는 SQL 문은 컨테이너가 처음 실행 시 자동 실행됨
COPY ./init/init.sql /docker-entrypoint-initdb.d/

# 기본 설정 파일을 덮어쓰기를 통해 새로운 설정 적용
COPY ./config/postgresql.conf /etc/postgresql/custom.conf

# 계정 정보 설정
ENV POSTGRES_USER=myuser
ENV POSTGRES_PASSWORD=mypassword
ENV POSTGRES_DB=mydb

# PostgreSQL이 사용하는 기본 포트
EXPOSE 543
