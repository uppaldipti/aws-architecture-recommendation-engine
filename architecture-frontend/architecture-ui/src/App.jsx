import { useState } from 'react'
import './App.css'
import cloudIcon from './assets/cloud-architecture.svg'
function App() {
  const [appType, setAppType] = useState('HighAvailability')
  const [architecture, setArchitecture] = useState(null)
  const API_URL = import.meta.env.VITE_API_URL;
  
  const getRecommendation = async () => {
    const response = await fetch(
       `${API_URL}/getarhitecture?appType=${appType}`
    )

    const data = await response.json()
    setArchitecture(data)
  }

  return (
    <div className="container">
      <div className="header">
        <img src={cloudIcon} className="cloud-icon" alt="Cloud Architecture Icon" />
        <h1>AWS Architecture Recommendation Engine</h1>
 
        <p>
          Get the best AWS architecture recommendation based on your application requirements.
        </p>
      </div>

      <div className="card">
        <h2>Select Application Type</h2>

        <select
          className="dropdown"
          value={appType}
          onChange={(e) => setAppType(e.target.value)}
        >
          <option value="HighAvailability">High Availability</option>
          <option value="Serverless">Serverless</option>
          <option value="Microservice">Microservice</option>
          <option value="StaticWebHosting">Static Web Hosting</option>
          <option value="EventDriven">Event Driven</option>
        </select>

        <button className="btn" onClick={getRecommendation}>
          Get Recommendation
        </button>

        {architecture && (
          <div className="result">
            <h2>{architecture.name}</h2>

            <ul>
              {architecture.services.map((service, index) => (
                <li key={index}>{service}</li>
              ))}
            </ul>
          </div>
        )}

        <div className="features">
          <div className="feature">
            <h3>Reliable</h3>
            <p>Highly Available</p>
          </div>

          <div className="feature">
            <h3>Cost Optimized</h3>
            <p>Reduce Infrastructure Cost</p>
          </div>

          <div className="feature">
            <h3>Scalable</h3>
            <p>Designed for Growth</p>
          </div>

          <div className="feature">
            <h3>Secure</h3>
            <p>AWS Best Practices</p>
          </div>
        </div>
      </div>
    </div>
  )
}

export default App