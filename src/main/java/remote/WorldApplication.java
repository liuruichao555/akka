package remote;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.typesafe.config.ConfigFactory;

import java.io.File;

/**
 * WorldApplication
 * 
 * @author liuruichao
 * Created on 2016-04-25 15:21
 */
public class WorldApplication {
    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create("WorldApplication", ConfigFactory.parseFile(new File("application1.conf")).withFallback(ConfigFactory.load()));
        ActorRef actor = system.actorOf(Props.create(WorldActor.class), "WorldActor");
        //actor.tell("liuruichao", ActorRef.noSender());
    }
}
