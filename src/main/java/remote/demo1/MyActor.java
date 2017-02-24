package remote.demo1;

import akka.actor.UntypedActor;

/**
 * MyActor
 * 
 * @author liuruichao
 * Created on 2016-04-25 15:43
 */
public class MyActor extends UntypedActor {
    @Override
    public void onReceive(Object o) throws Exception {
        System.out.println("MyActor recive: " + o);
    }
}
