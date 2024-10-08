package chapter01.step01;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount) {
        this(amount, null);
    }

    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public boolean hasInvitation(){
        return invitation != null;
    }

    public boolean hasTicket(){
        return ticket != null;
    }

    public void plusAmount(Long amount){
        this.amount += amount;
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }
}
