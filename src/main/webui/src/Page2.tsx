import Container from 'react-bootstrap/Container';
import ButtonLink from './ButtonLink';
import Pokecard from './Pokecard';

function Page2() {
  return (
    <Container>
      <h1>Page 2</h1>
      <ButtonLink to="/" variant="danger">
        Go to Page 1
      </ButtonLink>
      <Pokecard />
    </Container>
  );
}

export default Page2;
