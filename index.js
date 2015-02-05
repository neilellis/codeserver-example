var express = require('express');

module.exports= function(instanceConfig, projectConfig) {
    var router = express.Router();


    router.get('/', function (req, res) {
        res.send("Welcome to your first Codeserver.io project!");
    });

    return {router:router};
};
