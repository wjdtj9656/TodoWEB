import { Button, Grid, Paper, TextField } from "@mui/material";
import { useState } from "react";

const AddTodo = (props) => {
  const [item, setItem] = useState({ item: { title: "" } });
  const onInputChange = (e) => {
    const thisItem = item;
    thisItem.title = e.target.value;
    setItem({ item: thisItem });
  };
  const onButtonClick = () => {
    props.add(item);
    setItem({ item: { title: "" } });
  };
  const enterKeyEventHandler = (e) => {
    console.log(e.code);
    if (e.code === "Enter") {
      console.log("hah");
      onButtonClick();
    }
  };
  return (
    <Paper style={{ margin: 16, padding: 16 }}>
      <Grid container>
        <Grid xs={11} item style={{ paddingRight: 16 }}>
          <TextField
            placeholder="Add Todo here"
            fullWidth
            onChange={onInputChange}
            onKeyUp={enterKeyEventHandler}
            value={item.title}
          />
        </Grid>
        <Grid xs={1} md={1} item>
          <Button fullWidth color="secondary" variant="outlined" onClick={onButtonClick}>
            +
          </Button>
        </Grid>
      </Grid>
    </Paper>
  );
};
export default AddTodo;
