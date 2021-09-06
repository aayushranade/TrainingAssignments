const express = require('express');
const app = express();
app.use(express.json());
var contacts=[];

app.post("/add",function(req,res){
    let name = req.body.name;
    let phno = req.body.phno;
     contacts.push({
         name : name,
         phno : phno
     });
     res.send("Record added to Contacts!!");
});

app.get("/display",function(req,res){
    res.send("welcome bro");
})

app.get("/add",function(req,res){
    let name = req.query.name;
    console.log(contacts);
    for(let record of contacts){
    if(record['name'] === name )
    {
        res.send(record)
    }
}
    res.send("Contact doesnt exist!");
});

app.listen(8080,function(){
    console.log("listening to port 8080");
});
