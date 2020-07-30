package fourSeasons;

import java.util.Arrays;

public enum Season {
    SPRING("wiosna", new String[]{"mar", "kwi", "maj"}),
    SUMMER("lato", new String[]{"cze", "lip", "sie"}),
    AUTUMN("jesień", new String[]{"wrz", "paz", "lis"}),
    WINTER("zima", new String[]{"gru", "sty", "lut"});

    private final String polish;
    private final String[] months;

    Season(String polish, String[] months) {
        this.polish = polish;
        this.months = months;
    }

    public String getPolish() {
        return polish;
    }

    public String[] getMonths() {
        return months;
    }

    public static Season polishToVal(String polish) {
        for (Season value : Season.values()) {
            if (value.getPolish().equals(polish)) {
                return value;
            }
        }
        throw new IllegalArgumentException("nie ma takiej pory roku!");
    }

    @Override
    public String toString() {
        return
                "miesiace =" + Arrays.toString(months);
    }
}
