import java.util.Date;

public class BankService {

    public void createAccount(){

        Account account = new Account("A1","Sahil",100000.0,new Date(1998, 11, 21),"Male",new Date(2022,10,15));
        Bank.accounts.add(account);

    }

}
