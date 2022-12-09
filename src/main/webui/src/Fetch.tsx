import { useState, useEffect } from "react";
 
export default function App() {
 
  const [data, setData] : any = useState();
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);
 
  useEffect(() => {
    fetch(`http://localhost:8080/card`)
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
 
  return (
    <>
      <div className="App">
        {loading && <p>Loading...</p>}
        {!loading && <p>Fetched data</p>}
        {/* {!loading && <p>{data}</p>} */}
        {/* {!loading && data.map((item: any) => (
          <div key={item.id}>
            <p>{item.name}</p>
          </div>))} */}
      </div>
    </>
  )
}