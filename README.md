Criando e testando containers Docker
Criar rede docker para sistema hr
docker network create hr-net
Testando perfil dev com Postgresql no Docker


docker pull postgres:12-alpine

docker run -p 5432:5432 --name rh-worker-pg12 --network rh-net -e POSTGRES_PASSWORD=1234567 -e POSTGRES_DB=db_rh_worker postgres:12-alpine

docker run -p 5433:5432 --name rh-user-pg12 --network rh-net -e POSTGRES_PASSWORD=1234567 -e POSTGRES_DB=db_rh_user postgres:12-alpine
