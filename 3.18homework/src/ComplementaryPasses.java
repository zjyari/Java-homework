public class ComplementaryPasses {
    private String passID;
    private String assessLevel;
    public ComplementaryPasses(String passID, String assessLevel) {
        this.passID = passID;
        this.assessLevel = assessLevel;
    }
    public String getPassID() {
        return passID;
    }
    public void setPassID(String passID) {
        this.passID = passID;
    }
    public String getAssessLevel() {
        return assessLevel;
    }
    public void setAssessLevel(String assessLevel) {
        this.assessLevel = assessLevel;
    }
    @Override
    public String toString() {
        return "ComplementaryPasses {passID=" + passID + ", assessLevel=" + assessLevel + "}";
    }
    
}
