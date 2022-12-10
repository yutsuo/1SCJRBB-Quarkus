import React, { useState, useEffect } from 'react';

import PokeCard from './components/Pokecard';
import Search from './components/Search';
import cardBack from './card-back.png';

import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import Button from 'react-bootstrap/Button';
import InputGroup from 'react-bootstrap/InputGroup';

import './App.css';

const App: React.FC = () => {
  // Create context object
  const [data, setData]: any = useState({});
  const [loading, setLoading] = useState(true);
  const [input, setInput] = useState('Pikachu');

  const handleChange = (e: any) => {
    setInput(e.target.value);
  }

  const handleClick = () => {
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
        <InputGroup className="w-50 mb-3">
          <Search change={handleChange} />
          <Button variant="light" onClick={handleClick}>🔎</Button>
        </InputGroup>
      </Container>
      <Row>
        <Col></Col>
        <Col>
          <PokeCard
            image={!loading ? data.images.large : cardBack}
            name={!loading ? data.name : "Pokemon Name"}
            flavorText={!loading ? data.flavorText : "Flavor Text"}
            rarity={!loading ? data.rarity : "Rarity"}
          />
        </Col>
        <Col></Col>
      </Row>

    </Container>
  );
};

export default App;
