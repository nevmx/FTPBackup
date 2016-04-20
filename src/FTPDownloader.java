public class FTPDownloader {
    private String hostname;
    private int port;
    private String username;
    private char[] password;

    // The path to be downloaded
    private String remotePath;

    // Creates an instance of this class with default port 21.
    public FTPDownloader(String username, char[] password, String hostname) {
        this.username = username;
        this.password = password;
        this.hostname = hostname;
        this.port = 21;

        this.remotePath = "/";
    }

    // Creates an instance of this class with specified port.
    public FTPDownloader(String username, char[] password, String hostname, int port) {
        this(username, password, hostname);
        this.port = port;
    }

    // Getters
    public String getHost() {
        return hostname;
    }

    public int getPort() {
        return port;
    }

    public String getUser() {
        return username;
    }

    public String getRemotePath() {
        return remotePath;
    }
}

