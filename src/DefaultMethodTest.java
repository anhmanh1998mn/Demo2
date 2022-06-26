public class DefaultMethodTest {
    public static void main(String[] args) {
        Database database = new Database();
        database.log();
    }

    static class Database implements IDBManager{

        @Override
        public void readDatabase() {

        }

        @Override
        public void writeDatabase() {

        }

        @Override
        public void log() {
            System.out.printf("Log Database");
        }
    }

    interface IDBManager {
        void readDatabase();

        void writeDatabase();

        default void log() {

        }
    }
}
