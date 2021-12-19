package entity;

public abstract class EntityWithMoney extends Entity {
    private boolean isPaidMoney;
    private boolean isReceivedMoney;

    public boolean getIsReceivedMoney() {
        return isReceivedMoney;
    }

    public void setIsReceivedMoney(boolean isReceivedMoney) {
        this.isReceivedMoney = isReceivedMoney;
    }

    public boolean getIsPaidMoney() {
        return isPaidMoney;
    }

    public void setIsPaidMoney(boolean isPaidMoney) {
        this.isPaidMoney = isPaidMoney;
    }

    public EntityWithMoney(String name) {
        super(name);
    }

}
