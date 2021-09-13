import React, {useState, useEffect, Component} from  'react';
import { DataGrid } from '@mui/x-data-grid';
import Container from '@material-ui/core/Container';
import Grid from '@material-ui/core/Grid';
import Button from '@material-ui/core/Button';
import CallMadeIcon from '@material-ui/icons/CallMade';
import { makeStyles } from '@material-ui/core/styles';

const useStyles = makeStyles((theme) => ({
  root: {
      height: 80,
    '& > *': {
      margin: theme.spacing(1),
      }, 
    },
    buttons:{
      width: 300,
      marginTop: 80,
      marginLeft: 30,
  },
}));
  
  const columns = [
    { 
        field: 'id', 
        headerName: 'ID',  
        sortable: false,
        width: 70,
    },
    { 
      field: 'lastName', 
      headerName: 'Informacion personal',  
      sortable: false,
      width: 200,
  },
    {
      field: 'firstName',
      headerName: 'Estatus',
      sortable: false,
      width: 150,
    },
    {
    field: 'proc',
    headerName: 'Productos',
    sortable: false,
    width: 160,
  },
    {
      field: 'sal',
      headerName: 'Saldo',
      sortable: false,
      width: 110,
    },
    {
      field: 'fA',
      headerName: 'Fecha de alta',
      sortable: false,
      type: 'date',
      width: 150,
    },
  ];

const Usuarios = () =>{
    const classes = useStyles();
    const [tableData, setTableData] = useState([])
      
    useEffect(() => {
      fetch("http://localhost:8080/employees/")
       .then((data) => data.json())
       .then((data) => setTableData(data))
    })

  return (
    <Container maxWidth="md">
       <div className={classes.root}>
      <Button variant="outlined">Todos</Button>
      <Button variant="outlined">Activos</Button>
      <Button variant="outlined">Inactivos</Button>
      </div>
  
    <Grid style={{ height: 430, width: '100%', marginTop: 0}}> 
    <DataGrid
      pagination
      rows={tableData}
      columns={columns}
      pageSize={10}
      rowsPerPageOptions={[10]}
      checkboxSelection
      disableSelectionOnClick
    />
  </Grid>

  <Grid className={classes.root}
  container
  direction="row"
  justifyContent="left"
  alignItems="flex-end" 
  >
  <Button className={classes.buttons} 
  variant="contained" color="secondary" size="large">
      GUARDAR
   <CallMadeIcon fontSize="small"/> 
   </Button>
  </Grid>

  </Container>
  );
 }
 export default Usuarios