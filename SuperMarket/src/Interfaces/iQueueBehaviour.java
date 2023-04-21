package Interfaces;

import Classes.Actor;

public interface iQueueBehaviour { //очередь
    void takeInQueue(iActorBehaviour actor); //
    void releaseFromQueue(); //
    void takeOrder();
    void giveOrder();
    

}
