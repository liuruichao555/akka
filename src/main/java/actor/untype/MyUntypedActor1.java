package actor.untype;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.Terminated;
import akka.actor.UntypedActor;
import org.apache.log4j.Logger;
import scala.concurrent.Future;

/**
 * 无类型Actor
 * 
 * @author liuruichao
 * Created on 2016-01-25 15:23
 */
public class MyUntypedActor1 extends UntypedActor {
    private final Logger logger = Logger.getLogger(MyUntypedActor1.class);

    @Override
    public void onReceive(Object o) throws Exception {
        logger.info("receive : " + o);
    }

    public static void main(String[] args) throws Exception {
        ActorSystem actorSystem = ActorSystem.create("MySystem");
        ActorRef myActor = actorSystem.actorOf(Props.create(MyUntypedActor1.class), "myActor1");
        //ActorRef myActor2 = actorSystem.actorOf(Props.create(MyUntypedActor1.class), "myActor2");
        myActor.tell("liuruichao", null);
        Thread.sleep(5000);
        Future<Terminated> future = actorSystem.terminate();
    }
}
