import './App.css';
import Search from './components/AllPosts';
import { Routes, Route, BrowserRouter } from "react-router-dom"; // Import BrowserRouter

function App() {
  return (
    <BrowserRouter> {/* Wrap everything inside BrowserRouter */}
      <Routes>
        <Route path='/' element={<Search />} />
        {/* Add other routes here if needed */}
      </Routes>
    </BrowserRouter>
  );
}

export default App;
