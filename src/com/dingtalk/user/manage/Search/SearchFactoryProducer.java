public class SearchFactoryProducer {
    public static AbstractSearchFactory getSearchFactory(String factory) {
        if (factory.equalsIgnoreCase("ORIGIN")) {
            // System.out.println("1");
            return new OriginSearchFactory(){};
        }else if (factory.equalsIgnoreCase("MORE")) {
            // System.out.println("2");
            return new MoreSearchFactory(){};
        }
        return null;
    }
}
