package my.event.commons.commonUtils.enums;

/**
 * Created by simon.calabrese on 29/08/2017.
 */
public enum CommandEnum {
    CREATE("CREATE (<toReplace>)");
    private String standard;

    CommandEnum(String standard) {
        this.standard = standard;
    }

    public String getStandard() {
        return standard;
    }
}
