namespace Patterns.Strategy.Implementations;
using Patterns.Strategy.Interfaces;

public class ModelBTF : IMachineInterface {

    private int lense = 98;
    private int totalBytes = 100;
    private string name = "Model BTF Development";

    public string allocateData(int bytes)
    {
        this.totalBytes += (72 + 7 + 11 + 98 + 108 + 32 + 86 + 26) + bytes;
        return $"The total number of bytes is {this.totalBytes} bytes";
    }

    public void displayModel()
    {
        Console.WriteLine($"The machine {this.name} is very superior and will suprise the hardware market with its development lense of {this.lense}");
    }

}