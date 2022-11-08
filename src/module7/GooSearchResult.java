package module7;

public class GooSearchResult {
    private final String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain() {
        if (!(url.startsWith("http://") || url.startsWith("https://"))) {
            return "This isn't URL!!!";
        }
        try {
            return url.split("/")[2];
        } catch (IndexOutOfBoundsException e) {
            return "URL is empty!!!";
        }
    }
}
