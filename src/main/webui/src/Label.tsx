import Form from 'react-bootstrap/Form';

const Label = (props: any) => {
    return (
        <>
        <input value={props.message} onChange={props.change} />
        </>
    );
}

export default Label;