package deansoffice;

public class Program {
    private String title;
    private String details;
    private int totalTerms;
    private int maxAllowedFails;

    public Program(String title, String details, int totalTerms, int maxAllowedFails) {
        this.title = title;
        this.details = details;
        this.totalTerms = totalTerms;
        this.maxAllowedFails = maxAllowedFails;
    }

    public int getTotalTerms() {
        return totalTerms;
    }

    public int getMaxAllowedFails() {
        return maxAllowedFails;
    }
}
