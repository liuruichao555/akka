package remote.demo2;

import akka.actor.ActorRef;
import akka.actor.ActorSelection;
import akka.actor.ActorSystem;
import com.typesafe.config.ConfigFactory;

/**
 * Test2
 * 
 * @author liuruichao
 * Created on 20164-25 16:07
 */
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        ActorSystem system = ActorSystem.create("mySystem", ConfigFactory.load("application2"));
        ActorSelection selection = system.actorSelection("akka.tcp://mySystem@127.0.0.1:2552/user/MyActor");
        selection.tell("liuruichao", ActorRef.noSender());
    }
}
