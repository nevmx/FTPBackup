import java.util.Date;

public class Backup {
    // Identify this backup
    private int backupId;
    private Date backupDate;
    private String backupHost;
    private File backupPath;

    // Constructor
    public Backup(Date date, String host) {
        this.backupDate = date;
        this.backupHost = host;
    }

    // Getters
    public Date getDate() {
        return backupDate;
    }

    public int getId() {
        return backupId;
    }

    public String getHost() {
        return backupHost;
    }

    public File getPath() {
        return backupPath;
    }

    // Setters
    public File setPath(File path) {
        this.backupPath = path;
    }
}

