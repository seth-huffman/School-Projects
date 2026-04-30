import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Task Class: Grabs data from user to store into a task
public class Task {
    private String name;
    private LocalDate date;
    private boolean importnat;
    private String category;

    public Task(String name, LocalDate date, boolean importnat, String category) {
        this.name = name;
        this.date = date;
        this.importnat = importnat;
        this.category = category;
    }

    public String getName() { return name; }
    public LocalDate getdate() { return date; }
    public boolean importnat() { return importnat; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String formattedDate = date.format(formatter);
        return (importnat ? "!    " : "") + name + " (" + category + ") - " + formattedDate;
    }
}