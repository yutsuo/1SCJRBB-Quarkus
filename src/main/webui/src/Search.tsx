import Form from 'react-bootstrap/Form';
import InputGroup from 'react-bootstrap/InputGroup';
import Button from 'react-bootstrap/Button';

function Search() {
  return (
    <>
      <InputGroup className="w-50 mb-3">
        <Form.Control
          placeholder="Pokemon Name"
          aria-label="Pokemon Name"
          aria-describedby="search-box"
        />
        <Button variant="light">🔎</Button>
      </InputGroup>
    </>
  );
}

export default Search;