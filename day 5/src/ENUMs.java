enum ProcessorsENUM { //Enums are almost like a constants class. May be used to make your code cleaner!
    I3,
    I5,
    I7,
}

class Processors {

    private String model;
    private String version;

    public Processors(ProcessorsENUM model, String version) {
        this.model = model.toString();
        this.version = version;
    }

    public String getModel() {
        return model;
    }

    public String getVersion() {
        return version;
    }
}

public class ENUMs {
    public static void main(String[] args) {
        Processors processor = new Processors(ProcessorsENUM.I5, "9400f");
        Processors processor1 = new Processors(ProcessorsENUM.I7, "7700");
        Processors processor2 = new Processors(ProcessorsENUM.I5, "3570");
        printProcessor(processor);
        printProcessor(processor1);
        printProcessor(processor2);
    }

    static void printProcessor(Processors processor) {
        System.out.println("Model: " + processor.getModel());
        System.out.println("Version: " + processor.getVersion());
    }
}
