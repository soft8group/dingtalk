package worktodo;

public class CeShi {
    public static void main(String[] args) {
        WorkList workList = new WorkList();
        workList.addWork();
        workList.addWork();
        workList.showWorks();
        workList.deleteWorks();
        workList.showWorks();
    }
}
