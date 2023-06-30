1:修改皮肤
	UIManager.setLookAndFeel(MyLookAndFeel.LIQUIDINF);

2:修改窗体的图标
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image i = tk.getImage("src\\cn\\itcast\\resource\\jjcc.jpg");
        jf.setIconImage(i);

3:设置窗体居中
        Toolkit tk = Toolkit.getDefaultToolkit();

        Dimension d = tk.getScreenSize();
        double srceenWidth = d.getWidth();
        double srceenHeigth = d.getHeight();

        int frameWidth = jf.getWidth();
        int frameHeight = jf.getHeight();

        int width = (int) (srceenWidth - frameWidth) / 2;
        int height = (int) (srceenHeigth - frameHeight) / 2;

        jf.setLocation(width, height);
    }
