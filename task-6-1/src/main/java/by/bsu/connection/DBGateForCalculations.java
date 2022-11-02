package by.bsu.connection;

public class DBGateForCalculations implements DBGate {
    private final DBConnection dbConnection;

    public DBGateForCalculations(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public int getValueFromDB() {
        return 0;
    }
}
