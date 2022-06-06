import { List, Paper } from "@mui/material";
import { Container } from "@mui/system";
import { useState } from "react";
import AddTodo from "./AddTodo";
import "./App.css";
import Todo from "./Todo";

function App() {
  const [items, setItems] = useState({ items: [] });
  let add = (item) => {
    const thisItems = items.items;
    item.id = "ID-" + thisItems.length;
    item.done = false;
    thisItems.push(item);
    setItems({ items: thisItems });
  };
  let deleteTodo = (item) => {
    const thisItems = items.items;
    const newItems = thisItems.filter((e) => {
      console.log(e.id + " " + item.id);
      return e.id !== item.id;
    });
    console.log(thisItems);
    console.log(newItems);
    setItems({ items: newItems });
  };
  let todoItems = items.items.length > 0 && (
    <Paper style={{ margin: 16 }}>
      <List>
        {items.items.map((item, idx) => {
          return <Todo item={item} key={item.id} deleteTodo={deleteTodo} />;
        })}
      </List>
    </Paper>
  );
  return (
    <div className="App">
      <Container maxWidth="md">
        <AddTodo add={add} />
        {todoItems}
      </Container>
    </div>
  );
}
// const App = () => {
//   const [state, setState] = useState({ items: [] });

//   const add = (item) => {
//     const thisItems = state.items;
//     item.id = "ID-" + thisItems.length; // key를 위한 id추가
//     item.done = false; // done 초기화
//     thisItems.push(item); // 배열에 아이템 추가
//     setState({ items: thisItems }); // 업데이트는 반드시 this.setState로 해야됨.
//     console.log("items : ", state.items);
//   };

//   var todoItems = state.items.length > 0 && (
//     <Paper style={{ margin: 16 }}>
//       <List>
//         {state.items.map((item, idx) => (
//           <Todo item={item} key={item.id} />
//         ))}
//       </List>
//     </Paper>
//   );

//   // 3. props로 넘겨주기å
//   return (
//     <div className="App">
//       <Container maxWidth="md">
//         <AddTodo add={add} />
//         {todoItems}
//       </Container>
//     </div>
//   );
// };

export default App;
