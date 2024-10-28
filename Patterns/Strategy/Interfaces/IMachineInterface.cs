namespace Patterns.Strategy.Interfaces;

public interface IMachineInterface {
    string allocateData(int bytes);
    void displayModel();
}