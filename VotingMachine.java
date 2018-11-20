
/**
 * A program that tallies votes.
 * 
 * @author Andrew P. Albanese 
 * @version 4/28/2016
 */
public class VotingMachine
{
    private int tallyD;
    private int tallyR;

    public VotingMachine()
    {
        this.clear();
    }

    public int getDemocratVotes()
    {
        return this.tallyD;
    }

    public int getRepublicanVotes()
    {
        return this.tallyR; 
    }

    public void voteDemocrat()
    {
        this.tallyD = this.tallyD + 1;
    }

    public void voteRepublican()
    {
        this.tallyR = this.tallyR + 1;
    }

    public void clear()
    {
        this.tallyD = 0;
        this.tallyR = 0;
    }
    
    public static void main(String[] args)
    {
        System.out.println("VotingMachine");
        VotingMachine vm1 = new VotingMachine();
        VotingMachine vm2 = new VotingMachine();
        for (int k = 1; k <= 24; k++) { vm1.voteDemocrat(); }
        for (int k = 1; k <= 25; k++) { vm1.voteRepublican(); }
        for (int k = 1; k <= 31; k++) { vm2.voteDemocrat(); }
        for (int k = 1; k <= 30; k++) { vm2.voteRepublican(); }
        System.out.println(" Primary precinct 1: " + vm1);
        System.out.println(" Primary precinct 2: " + vm2);
        vm1.clear();
        vm2.clear();
        for (int k = 1; k <= 35; k++) { vm1.voteDemocrat(); }
        for (int k = 1; k <= 34; k++) { vm1.voteRepublican(); }
        for (int k = 1; k <= 48; k++) { vm2.voteDemocrat(); }
        for (int k = 1; k <= 49; k++) { vm2.voteRepublican(); }
        System.out.println(" General precinct 1: " + vm1);
        System.out.println(" General precinct 2: " + vm2);
    }
    
    public String toString()
    {
        return "Democrat: " + getDemocratVotes()
         + " Republican: " + getRepublicanVotes();
    }
}
