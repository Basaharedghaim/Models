package models;

import java.util.Date;

public class Response {
    private Status status;
    private double amount;
    private Date date;

    public Response() {
    }

    public Response(Status status, double amount,Date date) {
        this.status = status;
        this.amount = amount;
        this.date=date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status=" + status +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
