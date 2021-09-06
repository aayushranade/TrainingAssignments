// const http = require("http")
// http.createServer(function(request,response){
//     response.writeHead(200,{'content-type' : 'text/plain'});
//     response.end("hello world");
// }).listen(8080);

// const express = require('express');
// const app = express();

app.use(express.urlencoded({encoded:true}));

app.get("/",function(req,res){
    res.send("hello World");
    console.log("hello world");
});

app.get("/home",function(req,res){
    let firstMember = req.query.member;
    console.log(firstMember);
    res.send("the first member of our hotel is= "+firstMember);
});


app.post("/post",function(req,res){
    let firstpostparam = req.body.param;
    console.log(firstpostparam)
    res.send("i am the post method for root url /");    
});


app.listen(8080,function(){
    console.log("listening to port 8080");
});