namespace Patterns.Strategy.Implementations;
using Patterns.Strategy.Interfaces;

public class ModelAVC : IMachineInterface {

    private int lense = 21;
    private int totalBytes = 100;
    private string name = "Model AVC Premium";

    public string allocateData(int bytes)
    {
        this.totalBytes += (77 + 111 + 100 + 101 + 108 + 65 + 86 + 67) + bytes;
        return $"The total number of bytes is {this.totalBytes} bytes";
    }

    public void displayModel()
    {
        Console.WriteLine($"The machine {this.name} is very superior and will conquer the hardware market with its lense of {this.lense}");
    }

}