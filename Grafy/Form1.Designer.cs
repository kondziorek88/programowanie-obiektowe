namespace Grafy
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            ListaOdwiedzonych = new TextBox();
            label1 = new Label();
            button1 = new Button();
            SuspendLayout();
            // 
            // ListaOdwiedzonych
            // 
            ListaOdwiedzonych.Location = new Point(12, 313);
            ListaOdwiedzonych.Multiline = true;
            ListaOdwiedzonych.Name = "ListaOdwiedzonych";
            ListaOdwiedzonych.Size = new Size(264, 125);
            ListaOdwiedzonych.TabIndex = 0;
            ListaOdwiedzonych.TextChanged += ListaOdwiedzonych_TextChanged;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(72, 290);
            label1.Name = "label1";
            label1.Size = new Size(139, 20);
            label1.TabIndex = 1;
            label1.Text = "Lista odwiedzonych";
            // 
            // button1
            // 
            button1.Location = new Point(227, 253);
            button1.Name = "button1";
            button1.Size = new Size(94, 29);
            button1.TabIndex = 2;
            button1.Text = "button1";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(button1);
            Controls.Add(label1);
            Controls.Add(ListaOdwiedzonych);
            Name = "Form1";
            Text = "Form1";
            Load += Form1_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private TextBox ListaOdwiedzonych;
        private Label label1;
        private Button button1;
    }
}
