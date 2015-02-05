An example service to show http://codeserver.io in action - to test it out just visit http://codeserver.io/neilellis/codeserver-example/master/api/ for more information visit http://codeserver.io/neilellis/codeserver-example/master/

The codeserver.yml file contains:

```YAML
image: nodejs
```

Which indicates that this is a NodeJS project.

**NOTE: You MUST create a codeserver.yml file to access a project on http://codeserver.io**

In this very simple example we create the index.js file required by Codeserver.io to run your NodeJS project. It is a standard CommonJS module and just requires you to export a function which returns a map. For this example we just need the map to contain the Express router to use for the project.

The router only has a single route which handles a GET request to / and returns a message.

```javascript
var express = require('express');

module.exports= function(instanceConfig, projectConfig) {
    var router = express.Router();


    router.get('/', function (req, res) {
        res.send("Welcome to your first Codeserver.io project!");
    });

    return {router:router};
};
```

If you fork this project you will be able to access it on Codeserver.io under http://codeserver.io/{your-username}/codeserver-example/master/ and make changes to it yourself.
