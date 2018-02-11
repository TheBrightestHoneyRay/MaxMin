using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Complex
{
    class Program
    {
        static void Main(string[] args)
        {
            Complex c1 = new Complex(1, 6);
            Complex c2 = new Complex(2, 3);

            Complex result = c1 + c2;

            Console.WriteLine(result);

            Console.ReadKey();


        }
    }
}