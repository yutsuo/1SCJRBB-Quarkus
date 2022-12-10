import Form from 'react-bootstrap/Form';
import InputGroup from 'react-bootstrap/InputGroup';
import Button from 'react-bootstrap/Button';

function Search(props: any) {
  return (
    <>
      <Form.Control
        placeholder="Pokemon Name"
        aria-label="Pokemon Name"
        aria-describedby="search-box"
        type="text"
        id="message"
        name="message"
        onChange={props.change}
      />
    </>
  );
}

export default Search;