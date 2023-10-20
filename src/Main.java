public class Main {
    public static void main(String[] args) {
        Database database = new AdapterDatabaseToJava();
        database.add();
        database.select();
        database.update();
        database.remove();
    }
}