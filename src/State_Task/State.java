package State_Task;

public class State {
    private String name,
            abbreviation,
            politicalParty,
            Governor,senator;
    private int population;

    private String getName() {
        return name;
    }

    private void setName(String name) {
        if(name == null || name.isEmpty() || name.isBlank()){
            System.out.println("Name cannot be null, empty or blank. ");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if( abbreviation== null || abbreviation.isEmpty() || abbreviation.isBlank()) {
            System.out.println("Abbreviation cannot be null, empty or blank. ");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if( politicalParty== null || politicalParty.isEmpty() || politicalParty.isBlank()) {
            System.out.println("PoliticalParty cannot be null, empty or blank. ");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String governor) {
        if( governor== null || governor.isEmpty() || governor.isBlank()) {
            System.out.println("Governor cannot be null, empty or blank. ");
            System.exit(1);
        }
        Governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if(senator== null || senator.isEmpty() || senator.isBlank()) {
            System.out.println("Senator cannot be null, empty or blank.");
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population > 0 ){
            System.out.println("Population must be greater than zero. ");
        }
        this.population = population;
    }

    public State(String name, String abbreviation, String politicalParty,
                 String governor, String senator, int population) {
        setName(getClass().getSimpleName());
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name ='" + name + '\'' +
                ", abbreviation ='" + abbreviation + '\'' +
                ", politicalParty ='" + politicalParty + '\'' +
                ", Governor ='" + Governor + '\'' +
                ", senator ='" + senator + '\'' +
                ", population =" + population +
                '}';
    }
}


