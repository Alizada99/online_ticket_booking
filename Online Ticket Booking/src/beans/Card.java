/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author User
 */
public class Card {

    private String cardNumber;
    private String cardExpireDate;
    private int cardCVV;

    public Card() {
    }

    public Card(String cardNumber, String cardExpireDate, int cardCVV) {
        this.cardNumber = cardNumber;
        this.cardExpireDate = cardExpireDate;
        this.cardCVV = cardCVV;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExpireDate() {
        return cardExpireDate;
    }

    public void setCardExpireDate(String cardExpireDate) {
        this.cardExpireDate = cardExpireDate;
    }

    public int getCardCVV() {
        return cardCVV;
    }

    public void setCardCVV(int cardCVV) {
        if (cardCVV >= 100 && cardCVV <= 999) {
            this.cardCVV = cardCVV;
        }
    }

    @Override
    public String toString() {
        return "cardNumber=" + cardNumber + ", cardExpireDate=" + cardExpireDate + ", cardCVV=" + cardCVV;
    }

}
