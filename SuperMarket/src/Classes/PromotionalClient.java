package Classes;

import Interfaces.iReturnOrder;

public class PromotionalClient extends Actor implements iReturnOrder {
    private boolean promotion;// например скидка 150.0 рублей на покупку свыше 1000.0 рублей
    private static int clientNumberInPromotion;// номер клиента в акции

    public PromotionalClient(String name, boolean promotion, int clientNumberInPromotion) {
        super(name);
        clientNumberInPromotion+=1;// при создании нового клиента, его номер увеличивается.
    }

    /**
     * @return номер акционного клиента
     */
    public static int getClientNumberInPromotion() {
        return clientNumberInPromotion;
    }

    @Override
    public String getName() {        
        return super.name;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;   
    }

    @Override
    public Actor getActor() {
        return this;
    }


    @Override
    public boolean orderAccepted(boolean isorderAccepted) {
        return isorderAccepted;
    }

    @Override
    public boolean returnOrder(boolean isReturnOrder) {
        return isReturnOrder;
    }

    
}
