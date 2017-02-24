package remote;

import akka.actor.UntypedActor;

/**
 * HelloActor
 * 
 * @author liuruichao
 * Created on 2016-04-25 15:15
 */
public class HelloActor extends UntypedActor {
    @Override
    public void onReceive(Object o) throws Exception {
        System.out.println("HelloActor recive: " + o);
    }
}
