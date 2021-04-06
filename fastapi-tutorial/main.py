from fastapi import FastAPI
from pydantic import BaseModel

import requests
import py_eureka_client.eureka_client as eureka_client

app = FastAPI()

eureka_client.init(eureka_server="http://localhost:8761/eureka/",
                        app_name="SUGGEST-NEARBY-API",
                        instance_port=8000
)

db = []

class City(BaseModel):
    name: str
    timezone: str

# @app.get('/')
# async def root():
#     return {'msg': 'Hello FastAPI'}

# @app.get('/item/{item_id}')
# async def hello_fast(item_id: int):
#     return {'msg': f'FastAPI is something{item_id}'}

@app.get('/')
def index():
    return {'key': 'value'}

@app.get('/cities')
def get_cities():
    results = []
    # for city
    return db


@app.get('/cities/{city_id}')
def get_cities(city_id: int):
    return db[city_id-1]


@app.post('/cities')
def create_city(city: City):
    db.append(city.dict())
    return db[-1]


@app.delete('/cities')
def delete_city(city_id: int):
    db.pop(city_id-1)
    return {}