class SoftwareEngineer extends TechnicalEmployee{
    protected boolean CodeAccess;

    //Assignment2 :start witout acess_code &with 0 code check ins.Group project:Surya,Vikki,Mathan
    protected SoftwareEngineer(String name)
    {
        super(name);setCodeAccess();
    }


    //return whether or not this SoftwareEngineer has access make changes code base.Group project:Surya,Vikki,Mathan
    protected boolean getCodeAccess(){
        return CodeAccess;
    }

    //Should allow external piece ofcode to update the
    // SoftwareEngineer's code privileges to either true/false.Group project:Surya,Vikki,Mathan

    protected void setCodeAccess(){

        this.CodeAccess = true;
    }
    //Group project:Surya,Vikki,Mathan
    public void checkInCode(){

        var manager = (TechnicalLead) this.getManager();
        if (manager.approveCheckIn(this)) this.checkins++;
        else {
            CodeAccess=false;
        }
    }

}

