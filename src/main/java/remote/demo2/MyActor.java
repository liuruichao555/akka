package remote.demo2;

import akka.actor.UntypedActor;

/**
 * CreationActor
 * 
 * @author liuruichao
 * Created on 2016-04-25 16:02
 */
public class MyActor extends UntypedActor {
    @Override
    public void onReceive(Object o) throws Exception {
        System.out.println("MyActor recive: " + o);
    }
}
