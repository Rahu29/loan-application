import './App.css';
import {Routes, Route} from 'react-router-dom';
import {CustomerRegistration, CustomerLogin, CustomerSuccess} from './components/Customer'

function App() {
  return (
    <div className='container-fluid'>
      <div className='alert alert-secondary'>
        <h2 className='text-center'>Loan Application</h2>
      </div>
      <div>
        <Routes>
          <Route path='' element = {<CustomerLogin />}></Route>
          <Route path='/login' element = {<CustomerLogin />}></Route>
          <Route path='/register' element = {<CustomerRegistration />}></Route>
          <Route path='/success/:customer_id/*' element = {<CustomerSuccess />}></Route>
        </Routes>
      </div>
    </div>
  );
}

export default App;

