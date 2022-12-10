import Form from 'react-bootstrap/Form';
import InputGroup from 'react-bootstrap/InputGroup';
import Button from 'react-bootstrap/Button';
import Label from './Label';

function Search(props: any) {
  return (
    <>
      <InputGroup className="w-50 mb-3">
        <Form.Control
          placeholder="Pokemon Name"
          aria-label="Pokemon Name"
          aria-describedby="search-box"
          type="text"
          id="message"
          name="message"
          onChange={props.change}
        />
      </InputGroup>
    </>
  );
}

export default Search;