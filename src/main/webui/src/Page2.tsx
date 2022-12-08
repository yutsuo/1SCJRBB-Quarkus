import Container from 'react-bootstrap/Container';
import ButtonLink from './ButtonLink';
import Pokecard from './Pokecard';
import Holeryuno from './Holeryuno';
import List from './List';
import Fetch from './Fetch';

function Page2() {
  return (
    <Container>
      <h1>Page 2</h1>
      <ButtonLink to="/" variant="danger">
        Go to Page 1
      </ButtonLink>
      {/* <Pokecard /> */}
      {/* <Holeryuno /> */}
      {/* <List /> */}
      <Fetch />
    </Container>
  );
}

export default Page2;
