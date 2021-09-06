const express = require('express');                 //include dependencies
const app = express();
app.use(express.json());
var staticDirectoryPath = require('path').join(__dirname,'/public')
console.log(staticDirectoryPath)
app.use(express.static(staticDirectoryPath))

var mysql      = require('mysql');                  //Sql Connection
var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'root',
  password : 'Login@251196',
  database : 'aayushdb'
});
connection.connect();

app.listen(8080,function(){                         //Configure port
    console.log("listening to port 8080");
});

app.post("/api/addcontact",function(req,res){           //post method to add contact
    let name = (req.body.name);
    let phno = (req.body.phno);
    let email = (req.body.email);
    let address = (req.body.address);
    
    let contact = {
        name : name,
        phno : phno,
        email : email,
        address : address
    }
    connection.query('INSERT INTO aayushdb.nodecontacts SET ?',contact, function (error, results, fields) {
        if (error) throw error;
        res.send("Contact Saved!");
    });
});

app.get("/api/searchcontact",function(req,res){          //get method to search for a contact
    let email = req.query.email;
    connection.query('SELECT * FROM aayushdb.nodecontacts WHERE email = ?',email, function (error, results, fields) {
        if (error) throw error;
        res.send(results);
    });
});     

app.get("/api/updatecontact",function(req,res){        //post method to update a record
    let name = req.query.name;
    let email = req.query.email;
    let address = req.query.address;
    let phno = req.query.phno;
    
    
    // let updcontact = {
    //     name : name,
    //     email : email,
    //     address : address
    // }

    // let updphno = {
    //     phno : phno
    // }

    connection.query('UPDATE aayushdb.nodecontacts SET name=?, email=?, address=? WHERE phno=?',[name,email,address,phno], function (error, results, fields) {
        if (error) throw error;
        res.send("updated!!");
    });
});     

app.get("/api/deletecontact",function(req,res){         //get method to delete a record
    let email = req.query.email;
    connection.query('DELETE FROM aayushdb.nodecontacts WHERE email = ?',email, function (error, results, fields) {
        if (error) throw error;
        res.send("Contact Deleted!");
    });
});      

