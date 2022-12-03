import java.util.Scanner;

public class SearchTest {
    public static void  main(String[] args) {
        AbstractSearchFactory factory = null;
        System.out.println("请选择搜索范围：ORIGIN / MORE");
        Scanner in1 = new Scanner(System.in);
        String x = in1.nextLine();
        // System.out.println(x);
        // 
        factory = SearchFactoryProducer.getSearchFactory(x);
        if (x.equalsIgnoreCase("ORIGIN")) {
            System.out.println("请选择搜索内容：TAG / GROUP / DEPARTMENT / CHAT / CONTACTS");
            Scanner in2 = new Scanner(System.in);
            String y = in2.nextLine();
            // System.out.print(x);
            OriginSearchResult o = factory.getOriginSearch(y);
            o.getOriginSearchResult();
            in2.close();
        } else if (x.equalsIgnoreCase("MORE")) {
            System.out.println("请选择搜索范围：MORE");
            Scanner in2 = new Scanner(System.in);
            String y = in2.nextLine();
            MoreSearchResult o = factory.getMoreSearch(y);
            o.getMoreSearchResult();
            in2.close();
        } else {
            System.out.println("不存在该类别");
        }
        in1.close();
    }
}
