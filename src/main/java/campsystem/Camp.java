package campsystem;

public class Camp {

    private final String name;
    private final PlayArea[] playAreas = new PlayArea[3];

    public Camp(String name, PlayArea area1, PlayArea area2, PlayArea area3) {
        this.name = name;
        playAreas[0] = area1;
        playAreas[1] = area2;
        playAreas[2] = area3;
    }

    public String getName() {
        return name;
    }

    public PlayArea[] getPlayAreas() {
        return playAreas;
    }

    public void executeCommand(CampCommand cmd) {
        cmd.execute();
    }
}
