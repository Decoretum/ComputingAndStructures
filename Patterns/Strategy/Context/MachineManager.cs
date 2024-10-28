namespace Patterns.Strategy.Context;
using Patterns.Strategy.Interfaces;

// This acts as the Context
public class MachineManager {
    private static int id = 027412;
    private IMachineInterface machine;
    public MachineManager (IMachineInterface machine)
    {
        this.machine = machine;
    }

    public string allocateDataToServer(int bytes)
    {
        return this.machine.allocateData(bytes);
    }
}