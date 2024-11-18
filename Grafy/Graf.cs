using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Grafy
{
    internal class Graf
    {
        public List<NodeG> nodes = new List<NodeG>();
        public List<NodeG> Wszerz(NodeG start)
        {
            var odwiedzane = new List<NodeG>() { start};

            for (int i = 0; i < odwiedzane.Count; i++)
            {
                var temp = odwiedzane[i];
                for(int j = 0; j < temp.sąsiedzi.Count; j++)
                {
                    if (!odwiedzane.Contains(temp.sąsiedzi[j]))
                    {
                        odwiedzane.Add(temp.sąsiedzi[j]);
                    }

                }
            }
            return odwiedzane;
        }
        //napisać odwiedzane po kolei rekurencyjnie 2 parametry node i graf jeżeli odwiedzony wcześniej to nie odwiedzać
    }
    
}
