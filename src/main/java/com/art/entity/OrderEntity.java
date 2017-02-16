package main.java.com.art.entity;

import sun.util.calendar.LocalGregorianCalendar.Date;

/**
 * Created by user on 16.02.2017.
 */
public class OrderEntity {

    private int orderId;
    private Date startArend;
    private Date finishArend;
    private UserEntity userEntity;
    private AutoEntity autoEntity;
    private ClientDataEntity clientDataEntity;

    public OrderEntity() {
    }

    public OrderEntity(int orderId, Date startArend, Date finishArend, UserEntity userEntity, AutoEntity autoEntity, ClientDataEntity clientDataEntity) {
        this.orderId = orderId;
        this.startArend = startArend;
        this.finishArend = finishArend;
        this.userEntity = userEntity;
        this.autoEntity = autoEntity;
        this.clientDataEntity = clientDataEntity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getStartArend() {
        return startArend;
    }

    public void setStartArend(Date startArend) {
        this.startArend = startArend;
    }

    public Date getFinishArend() {
        return finishArend;
    }

    public void setFinishArend(Date finishArend) {
        this.finishArend = finishArend;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public AutoEntity getAutoEntity() {
        return autoEntity;
    }

    public void setAutoEntity(AutoEntity autoEntity) {
        this.autoEntity = autoEntity;
    }

    public ClientDataEntity getClientDataEntity() {
        return clientDataEntity;
    }

    public void setClientDataEntity(ClientDataEntity clientDataEntity) {
        this.clientDataEntity = clientDataEntity;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (orderId != that.orderId) return false;
        if (!startArend.equals(that.startArend)) return false;
        if (!finishArend.equals(that.finishArend)) return false;
        if (!userEntity.equals(that.userEntity)) return false;
        if (!autoEntity.equals(that.autoEntity)) return false;
        return clientDataEntity.equals(that.clientDataEntity);

    }


    public int hashCode() {
        int result = orderId;
        result = 31 * result + startArend.hashCode();
        result = 31 * result + finishArend.hashCode();
        result = 31 * result + userEntity.hashCode();
        result = 31 * result + autoEntity.hashCode();
        result = 31 * result + clientDataEntity.hashCode();
        return result;
    }



    public String toString() {
        return "OrderEntity{" +
                "orderId=" + orderId +
                ", startArend=" + startArend +
                ", finishArend=" + finishArend +
                ", userEntity=" + userEntity +
                ", autoEntity=" + autoEntity +
                ", clientDataEntity=" + clientDataEntity +
                '}';
    }
}
