package chapter01.step02;

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

    public Long hold(Ticket ticket) {
        if(hasInvitation()){
            setTicket(ticket);
            return 0L;
        } else{
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private boolean hasInvitation(){
        return invitation != null;
    }


    private void plusAmount(Long amount){
        this.amount += amount;
    }

    private void minusAmount(Long amount){
        this.amount -= amount;
    }
}
