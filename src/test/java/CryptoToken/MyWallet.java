package CryptoToken;

public class MyWallet {

    public static void main(String[] args) {


        BitCoin bitCoin = new BitCoin(49225.00,50000,89000000,9876,7899,true);
        LiteCoin liteCoin = new LiteCoin(321,321,321,321,321,true);
        XRP xrp = new XRP(321,321,321,321,3,true);
        Ethereum ethereum = new Ethereum(321,321,321,321,321,true);
        ChainLink chainLink = new ChainLink(321,321,321,321,321,false);

        double total = bitCoin.totalPrice()+liteCoin.totalPrice()+chainLink.totalPrice()+ethereum.totalPrice()+xrp.totalPrice();

        System.out.println(total);

    }
}
/*
		create one object of each CryptoToken

		calculate the total Asset

 */
