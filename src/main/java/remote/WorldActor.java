package remote;

import akka.actor.UntypedActor;

/**
 * WorldActor
 * 
 * @author liuruichao
 * Created on 2016-04-25 15:20
 */
public class WorldActor extends UntypedActor {
    @Override
    public void onReceive(Object o) throws Exception {
        System.out.println("WorldActor recive: " + o);
    }
}
