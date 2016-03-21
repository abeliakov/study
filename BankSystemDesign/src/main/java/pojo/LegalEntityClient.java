package pojo;

public class LegalEntityClient extends Client {

    public LegalEntityClient(String personalInfo) {
        super(personalInfo);
    }

    public LegalEntityClient(String personalInfo, Account... accounts) {
        super(personalInfo, accounts);
    }
}
