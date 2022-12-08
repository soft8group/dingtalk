package compile.java;

public class history extends decorate{

    public history(session sage) {
        super(sage);
    }

    @Override
    public void function() {
        super.function();
        System.out.println("已完成历史记录的构建");
    }
    
}
