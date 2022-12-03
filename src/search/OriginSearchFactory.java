public abstract class OriginSearchFactory extends AbstractSearchFactory{
    public OriginSearchResult getOriginSearch(String origin) {
        if (origin == null){
            return null;
        }
        if (origin.equalsIgnoreCase("TAG")) {
            return new TagSearchResult();
        } else if (origin.equalsIgnoreCase("GROUP")) {
            return new GroupSearchResult();
        } else if (origin.equalsIgnoreCase("CHAT")) {
            return new ChatSearchResult();
        } else if (origin.equalsIgnoreCase("CONTACTS")) {
            return new ContactsSearchResult();
        } else if (origin.equalsIgnoreCase("DEPARTMENT")) {
            return new DepartmentSearchResult();
        }else {
            System.out.println("不存在该类别");
        }
        return null;  
    }

    public MoreSearchResult getMoreSearch(String more) {
        return null;
    }
}
