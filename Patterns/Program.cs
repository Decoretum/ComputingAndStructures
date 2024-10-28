// See https://aka.ms/new-console-template for more information
using Patterns.Strategy.Interfaces;
using Patterns.Strategy.Context;
using Patterns.Strategy.Implementations;

namespace Patterns;

public class Program {

    public static void Main(String[] args)
    {
        MachineManager machManager1 = new (new ModelAVC());
        MachineManager machManager2 = new (new ModelBTF());
        String dataToServer = machManager1.allocateDataToServer(97);
        String babyDataToServer = machManager2.allocateDataToServer(97);
        Console.WriteLine(dataToServer);
        Console.WriteLine(babyDataToServer);
    }
}



