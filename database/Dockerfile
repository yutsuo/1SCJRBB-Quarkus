FROM mongo:latest

COPY seed.json /seed.json
COPY seed-cards.json /seed-cards.json

CMD mongoimport -u root -p example --authenticationDatabase admin --host mongodb --db pokemon --collection Pokemon --drop --type json --file /seed.json --jsonArray && mongoimport -u root -p example --authenticationDatabase admin --host mongodb --db pokemon --collection Pokecards --drop --type json --file /seed-cards.json --jsonArray