import React, { useState, useEffect } from 'react';

import PokeCard from './Pokecard';
import Search from './Search';
import Label from './Label';

import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import Button from 'react-bootstrap/Button';
import './App.css';

const App: React.FC = () => {
  // Create context object
  const [data, setData]: any = useState({});
  const [loading, setLoading] = useState(true);
  const [input, setInput] = useState('Pikachu');
  const [updated, setUpdated] = useState(input);

  useEffect(() => {
    fetch(`http://localhost:8080/card/${input}`)
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

  const handleChange = (e: any) => {
    setInput(e.target.value);
  }

  const handleClick = () => {
    setUpdated(input);

    fetch(`http://localhost:8080/card/${input}`)
      .then(response => response.json())
      .then((usefulData) => {
        console.log(usefulData);
        setLoading(false);
        setData(usefulData);
      })
      .catch((e) => {
        console.error(`An error occurred: ${e}`)
      });
  };

  return (
    <Container className="p-3">
      <Container className="p-5 mb-4 bg-light rounded-3">
        <h1 className="header">
          Welcome To Pokémon TCG Search Thingie!
        </h1>
        <Search change={handleChange} />
        <Button variant="light" onClick={handleClick}>🔎</Button>
        {/* <Label message={updated} /> */}
      </Container>
      <Row>
        <Col></Col>
        <Col>
          <PokeCard
          image={!loading && data.images.large}
          name={!loading && data.name}
          flavorText={!loading && data.flavorText}
          rarity={!loading && data.rarity}
          />
        </Col>
        <Col></Col>
      </Row>

    </Container>
  );
};

export default App;
