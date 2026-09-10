package in.strikes;

public class OrderService {

    private PaymentService paymentService;

//    public OrderService(PaymentService paymentService){
//        this.paymentService = paymentService;
//    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(){

        paymentService.pay();
        System.out.println("Order Placed");
    }
}
