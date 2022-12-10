import React, { useState, useEffect } from 'react';

import PokeCard from './Pokecard';
import Search from './Search';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import './App.css';

const App: React.FC = () => {
  const [data, setData]: any = useState();
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    fetch(`http://localhost:8080/card/Pikachu`)
      .then(response => response.json())
      .then((usefulData) => {
        console.log(usefulData);
        setLoading(false);
        setData(usefulData);
      })
      .catch((e) => {
        console.error(`An error occurred: ${e}`)
      });
  }, []);

  return (
    <Container className="p-3">
      <Container className="p-5 mb-4 bg-light rounded-3">
        <h1 className="header">
          Welcome To Pokémon TCG Search Thingie!
        </h1>
        <Search />
      </Container>
      <Row>
        <Col></Col>
        <Col><PokeCard /></Col>
        <Col></Col>
      </Row>

    </Container>
  );
};

export default App;
