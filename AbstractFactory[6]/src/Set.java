/**
 * Created by viktoriya on 08.03.17.
 */
public class Set extends Information {
    private Vitae vitae;
    private References references;
    private UserAcc userAcc;


    @Override
    public Vitae createVT() {
        return new Vitae() {
        };
    }

    @Override
    public References createRF() {
        return null;
    }

    @Override
    public UserAcc createUA() {
        return null;
    }

    public References getReferences() {
        return references;
    }

    public void setReferences(References references) {
        this.references = references;
    }

    public UserAcc getUserAcc() {
        return getUserAcc();
    }

    public void setUserAcc(UserAcc userAcc) {
        this.userAcc = userAcc;
    }

    public Vitae getVitae() {
        return vitae;
    }

    public void setCv(Vitae vitae) {
        this.vitae = vitae;
    }
}
