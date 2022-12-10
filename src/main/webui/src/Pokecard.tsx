import { useState, useEffect } from "react";
import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import cardBack from './card-back.png';

function PokeCard() {

  return (
    <Card style={{ width: '18rem' }}>
      <Card.Img variant="top" src={cardBack} />
      <Card.Body>
        <Card.Title>Pokémon Name</Card.Title>
        <Card.Text>
          Pokemon Flavor Text
        </Card.Text>
        <p>Rarity</p>
      </Card.Body>
    </Card>
  );
}

export default PokeCard;