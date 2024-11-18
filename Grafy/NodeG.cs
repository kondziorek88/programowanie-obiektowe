using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Grafy;

namespace Grafy
{
    internal class NodeG
    {
        public List<NodeG> sąsiedzi = new List<NodeG>();
        int data;
        public NodeG(int liczba, Graf graf)
        {
            this.data = liczba;
            graf.nodes.Add(this);
        }
        public override string ToString()
        {
            return this.data.ToString();
        }
        public void DodajSąsiada(NodeG sąsiad)
        {
            if (!sąsiedzi.Contains(sąsiad))
            {
                sąsiedzi.Add(sąsiad);
                sąsiad.DodajSąsiada(this);
            }

        }
    }
}
