package remote.demo1;

import akka.actor.ActorSystem;
import com.typesafe.config.ConfigFactory;

import java.io.File;

/**
 * ActorTest1
 * 
 * @author liuruichao
 * Created on 2016-04-25 15:42
 */
public class ActorTest1 {
    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create("mySystem", ConfigFactory.parseFile(new File("application1.conf")));
        //ActorRef actor = system.actorOf(Props.create(MyActor.class), "myActor");
        //actor.tell("Pretty slick", ActorRef.noSender());
    }
}
