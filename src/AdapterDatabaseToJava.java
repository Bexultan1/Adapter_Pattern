public class AdapterDatabaseToJava extends JavaApplication implements Database{
    @Override
    public void add() {
        insertObject();
    }

    @Override
    public void select() {
        selectObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
