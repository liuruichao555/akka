package remote.demo2;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.typesafe.config.ConfigFactory;

/**
 * Test1
 * 
 * @author liuruichao
 * Created on 2016-04-25 16:04
 */
public class Test1 {
    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create("mySystem", ConfigFactory.load("application1"));
        ActorRef actorRef = system.actorOf(Props.create(MyActor.class), "MyActor");
    }
}
