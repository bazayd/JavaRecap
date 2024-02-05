public class Voter {
    final int voterId;

    String name;

    boolean hasVoted;

    public Voter(int voterId, String name, boolean hasVoted) {
        this.voterId = voterId;
        this.name = name;
        this.hasVoted = hasVoted;
    }

}
