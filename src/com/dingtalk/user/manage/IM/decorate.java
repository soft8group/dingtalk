package compile.java;

public class decorate implements session{

    private session sage;
    public decorate(session sage) {
        this.sage = sage;
    }

    @Override
    public void PersonTalk() {  
        
    }

    @Override
    public void GroupTalk() {
        
    }

    @Override
    public void function() {
        this.sage.function();
        
    }

    
}
