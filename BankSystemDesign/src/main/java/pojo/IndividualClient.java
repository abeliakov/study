package pojo;

public class IndividualClient extends Client {

    public IndividualClient(String personalInfo) {
        super(personalInfo);
    }

    public IndividualClient(String personalInfo, Account... accounts) {
        super(personalInfo, accounts);
    }
}
