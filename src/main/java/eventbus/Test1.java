package eventbus;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.UntypedActor;

/**
 * Test1
 * 
 * @author liuruichao
 * Created on 2016-04-25 17:37
 */
public class Test1 {
    public static void main(String[] args) {
        ActorSystem actorSystem = ActorSystem.create();
        ActorRef actorRef = actorSystem.actorOf(Props.create(SendMailHandler.class));

        actorSystem.eventStream().subscribe(actorRef, String.class);
        actorSystem.eventStream().publish("liuruichao");
        actorSystem.eventStream().publish(1);
        actorSystem.eventStream().publish(new SendMail());
    }

    private static class SendMailHandler extends UntypedActor {
        @Override
        public void onReceive(Object o) throws Exception {
            System.out.println(o);
        }
    }

    private static class SendMail {

    }
}
