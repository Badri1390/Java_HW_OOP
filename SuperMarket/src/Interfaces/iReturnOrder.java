package Interfaces;

public interface iReturnOrder {

    /**
     * вернуть товар
     *  @return true -успешно, false - если нет
     */
    boolean returnOrder( boolean isReturnOrder);
    /**
     * товар успешно возвращен
     *  @return true -успешно, false - если нет.
     */
    boolean orderAccepted(boolean isorderAccepted);


}
