namespace Grafy
{
    public partial class Form1 : Form
    {

        public Form1()
        {
            InitializeComponent();
        }

        public void Form1_Load(object sender, EventArgs e)
        {
            Graf graf = new Graf();

            NodeG wezA = new(1, graf);
            NodeG wezB = new(2, graf);
            NodeG wezC = new(3, graf);
            NodeG wezD = new(4, graf);
            NodeG wezE = new(5, graf);
            NodeG wezF = new(6, graf);
            NodeG wezG = new(7, graf);
            wezA.DodajS¹siada(wezB);
            wezA.DodajS¹siada(wezC);
            wezB.DodajS¹siada(wezD);
            wezB.DodajS¹siada(wezE);
            wezC.DodajS¹siada(wezD);
            wezC.DodajS¹siada(wezF);
            wezE.DodajS¹siada(wezF);
            wezF.DodajS¹siada(wezG);
            //ListaOdwiedzonych.Text=(graf.Wszerz);
        }

        private void ListaOdwiedzonych_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            
        }
    }
}
