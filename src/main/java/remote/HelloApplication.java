package remote;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.typesafe.config.ConfigFactory;

/**
 * HelloApplication
 * 
 * @author liuruichao
 * Created on 2016-04-25 15:15
 */
public class HelloApplication {
    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create("HelloApplication");
        //ActorSystem system = ActorSystem.create("HelloApplication", ConfigFactory.load().getConfig("HelloConfig"));
        ActorRef myActor = system.actorOf(Props.create(HelloActor.class),"HelloActor");
        ActorRef remoteActor = system.actorFor("akka.tcp://WorldApplication@127.0.0.1:8888/WorldActor");
        remoteActor.tell("liuruichao", ActorRef.noSender());
    }
}
