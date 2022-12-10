import Card from 'react-bootstrap/Card';
import cardBack from './card-back.png';

function PokeCard(props: any) {

  return (
    <Card style={{ width: '18rem' }}>
      <Card.Img variant="top" src={props.image} />
      <Card.Body>
        <Card.Title>{props.name}</Card.Title>
        <Card.Text>
        {props.flavorText}
        </Card.Text>
        <p>{props.rarity}</p>
      </Card.Body>
    </Card>
  );
}

export default PokeCard;