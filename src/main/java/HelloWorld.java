import com.mongodb.*;

import java.util.Date;

import static spark.Spark.get;
import static spark.Spark.port;

public class HelloWorld {
    public static void main(String[] args) {
        port(8080);
        get("/", (req, res) -> {
            MongoClient mongoClient = new MongoClient(new MongoClientURI(System.getenv("MONGODB_URL")));
            DB db = mongoClient.getDB("example");
            DBCollection table = db.getCollection("visitors");
            BasicDBObject document = new BasicDBObject();
            document.put("ip", req.ip());
            document.put("createdDate", new Date());
            table.insert(document);
            return "Hello " + req.ip() + "You are the " + table.count() + " visitor";
        });
    }
}