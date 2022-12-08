public abstract class MoreSearchFactory extends AbstractSearchFactory{
    public OriginSearchResult getOriginSearch(String origin) {
        return null;
    }

    public MoreSearchResult getMoreSearch(String more) {
        if (more.equalsIgnoreCase("MORE")) {
            return new ExtraSearchResult();
        } else {
            System.out.println("不存在该类别");
        }
        return null;
    }
}
