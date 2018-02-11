using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Complex
{
    class Complex
    {
        public int x, y;
        
        public Complex() { }

        public Complex(int _x, int _y)
        {
            x = _x;
            y = _y;

        }

        public static Complex operator +(Complex c1, Complex c2)
        {
            Complex n = new Complex();
            n.x = c1.x * c2.y + c2.x * c1.y;
            n.y = c1.y * c2.y;
            n.Div();
            return n; 
        }

        public void Div()
        {
            int g = GCD(x, y);
            x /= g;
            y /= g;
        }

        private int GCD(int x, int y)
        {
            int res = 1;
            for(int i = 1; i <= x; ++i)
            {
                if (x % i == 0 && y % i == 0)
                    res = Math.Max(res, i);
            }
            return res;
        }

        public override string ToString()
        {
            return x + "/" + y;
        }
    }
}
