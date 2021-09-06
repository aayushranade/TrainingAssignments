const express = require('express');
const app = express();
var md5 = require('md5');
app.use(express.json());
var account=[];

app.post("/login",function(req,res){
    let username = (req.body.username);
    let password = md5(req.body.password);
     for(let user of account){
         if(user['username']===username){
             if(user['password']===password){
             res.send("Login Success!!!");
             return;
         }else{
             res.send("Login Failed: Enter correct Password")
             return;
         }
     }
    }
     res.send("Login Failed: Enter correct username or createaAccount");
});

app.post("/signup",function(req,res){
    let username = req.body.username;
    let password = req.body.password;
    let vpassword = req.body.vpassword;

    if(password===vpassword){
        password=md5(password);
        account.push({
            username : username,
            password : password
        });
        res.send("Signup Success\nEnjoy the experience");
    }else{
        res.send("Verification password error, please type again");
    }
});

app.get("/acc",function(req,res){
    res.send(account);
})

app.listen(8080,function(){
    console.log("listening to port 8080");
});