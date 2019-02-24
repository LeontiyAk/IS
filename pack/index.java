package pack;/*Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов. 
jpr - название пакета */

import java.awt.*;
import java.awt.event.*;
/*	java. - Все стандартные классы, поставляемые с системой Java, хранятся в пакете java.
java.awt  - подключение пакета awt, содержащего базовые графические функции:GridLayout, BorderLayout и т.д.
"*"-включение всех элементов библиотеки awt */	
import javax.swing.*;
/*	Импортируем: 
javax.* — стандартные расширения.(Стандартные расширения (standard extensions) — это пакеты или наборы пакетов Java)
Swing - Библиотека графического интерфейса (конкретный пакет), В отличие от java.awt, javax.swing имеет более гибкую 
систему управления и более широкий набор функций
"*"-включение всех элементов библиотеки Swing (jbutton,jpanel,jlabel и т.д.)
"."(точка) используется для выделения элементов из ссылки на объект.
*/
import javax.swing.border.*;//библиотека необходимая для того, чтобы установить отступы

public class index extends JFrame{
	/*	(Public) - поля и методы класса Index доступны для всех других объектов и классов. 
	зарезервированное слово class - говорит транслятору, что мы собираемся описать новый класс Index.
	Класс наследует функции элемента JFrame, который определён в стандартной библиотеке awt.
	 JFrame - само окно. JFrame содержит в себе всё необходимое для создания и функционирования окна программы - мы 
	 используем его методы в своей программе. { }-описание класса располагается между фигурными скобками. 
	*/

	private static final long serialVersionUID = 1L;
	public static index frame = new index(); /* Index() - это установка компонентов (панель вкладок) на JFrame. 
	(Public) - означает что фрейм Index можно вызвать из любого файла который лежит в пакете pack.
	static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
	и переменным можно обращаться через имя класса*/
	
	public static void main(String[] args) { /*  
		Модификатор доступа public означает, что метод main(String[] args)виден и доступен любому классу. 
		static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
		отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
		и переменным можно обращаться через имя класса.
		void означает, что метод main(String[] args)не возвращает данных в программу, которая его вызвала, 
		а просто выводит на экран строку.
		В методе main слова String[] args означают,что этот может получать массив объектов с типом String, т.е. текстовые данные.
		Программа может состоять из нескольких классов, но только один из них содержит метод main().
		Все существующие реализации Java-интерпретаторов, получив команду интерпретировать класс, 
		начинают свою работу с вызова метода main. 
		*/
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				/* public - модификатор доступа, означающий, что метод run() виден и доступен любому классу.
				void ()означает, что метод run не возвращает данных в программу, которая его вызвала, 
				а просто выводит на экран строку.
				Метод run с пустыми скобками, т.е. метод не имеет аргументов(параметров)	 
				*/
				try {
		/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
		Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
		Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
		1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
		доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
		 прерывается, и управление прыгает в начало блока catch(err).
		*/
					frame.setVisible(true); //устанавливаем что окно Index (Расчет расхода топлива) видно пользователю

				} catch (Exception e) {
					e.printStackTrace();
					/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
					Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
					Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
					1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
					доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
					 прерывается, и управление прыгает в начало блока catch(err).
					*/
				}
			}
		});
	}
	
	
	private JPanel panel, panel1, panel2;//панели на которых располагаются поля и кнопки. Панели доступны только для данного класса (private)
	private JButton button;// кнопка Рассчитать которая доступна только для данного класса
	private JLabel label_0, label_f1,label_1,label_2,label_3,label_4,label_5,label_6,label_7,s,c1,c2,c3,c4,c5,c6,s1,s2,s3,s4,s5,s6;
	// компонент на котором располагается текст
	public static JTextField m1, a1, b1,kol1, m2, a2, b2,kol2,m3, a3, b3,kol3,m4, a4, b4,kol4,m5, 
	a5, b5, kol5, m6, a6, b6, kol6;
	/* текстовые поля в которые пользователь вводит данные, доступны для любого файла из пакета pack */
	public static JCheckBox f1,f2,f3,f4,f5,f6;// компонент флажок
	public static int t2,t3,t4,t5,t6,val1, val2,val3,val4,val5,val6;
	public static double d_a1,d_a2,d_a3,d_a4,d_a5,d_a6,d_b1,d_b2,d_b3,d_b4,d_b5,d_b6,d_kol1,d_kol2,d_kol3,
	d_kol4,d_kol5,d_kol6,d_c1,d_c2,d_c3,d_c4,d_c5,d_c6,d_s1,d_s2,d_s3,d_s4,d_s5,d_s6, d_s;
	
	public index() { /*Модификатор доступа public означает, что метод Index()виден и доступен любому классу.
		static означает, что не нужно создавать экземпляр(копию) объекта Index в памяти, чтобы использовать этот метод.
		Index - расположение на фрейме компонентов (панель вкладок), .*/
		setTitle("Расчет зоны хранения автобусов"); //устанавливает название окна 
		setSize(690, 380); // указывает ширину (690) и высоту (380).
		setResizable(false);//запретить изменять размер окна
		setLocationRelativeTo(null);//установить посередине экрана
		
		//по закрытию формы - закрывать приложение
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout (new BorderLayout()); /*	Оператор new создает экземпляр указанного класса
	  	Метод setLayout - Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере.
 		Менеджер размещения BorderLayout - тип разбивки контейнера, при котором всё пространство контейнера разбивается 
 		на пять частей. В каждой из этих частей располагается один компонент. 
 		При добавлении компонента на контейнер с BorderLayout разработчик обязательно указывает, 
 		куда именно он хочет поместить компонент.*/

        panel = new JPanel();//Панель на которой  располагаются текст Суммарная площадь
		panel1 = new JPanel();//Панель на которой располагается текстовые поля и поля для ввода текста
		panel2 = new JPanel();//Панель на которой располагается кнопка

		add(panel, BorderLayout.NORTH);//Добавление панели panel сверху
		add(panel1, BorderLayout.CENTER);//Добавление панели panel по центру
		add(panel2, BorderLayout.SOUTH);//Добавление панели panel_1 снизу

		panel.setBorder(new EmptyBorder(15,15,5,10));//установка внутренних отступов(сверху,слева,снизу,справа)
		panel1.setBorder(new EmptyBorder(5,-70,50,10));//установка внутренних отступов(сверху,слева,снизу,справа)
	
		/* установка менеджера компоновки GridLayout. данный менеджер компоновки располагает компоненты в 
		 * таблицу */
		panel.setLayout(new GridLayout(1,2));/* на панеле будет 10 строк, 6 столбца, расстояние между
		 столбцами 0, расстояние между строками 5 */
		panel1.setLayout(new GridLayout(7,6,5,0));/* на панели 1 строка,1столбец, будет расположена кнопка */
		panel2.setLayout(new GridLayout(1,1));//на панели 1 строка,2столбец, будет расположен текст суммарная площадь

		label_0 = new JLabel("", JLabel.CENTER);
		label_f1 = new JLabel("", JLabel.CENTER);
		label_1 = new JLabel("Марка автобуса", JLabel.CENTER);
		label_2 = new JLabel("Длина", JLabel.CENTER);
		label_3 = new JLabel("Ширина", JLabel.CENTER);
		label_4 = new JLabel("Площадь 1 авт.", JLabel.CENTER);
		label_5 = new JLabel("Число автобусов", JLabel.CENTER);
		label_6 = new JLabel("Общая площадь", JLabel.CENTER);
		label_7 = new JLabel("Суммарная площадь зоны хранения:", JLabel.LEFT);
		s = new JLabel("0", JLabel.LEFT);
		c1 = new JLabel("", JLabel.CENTER);
		c2 = new JLabel("", JLabel.CENTER);
		c3 = new JLabel("", JLabel.CENTER);
		c4 = new JLabel("", JLabel.CENTER);
		c5 = new JLabel("", JLabel.CENTER);
		c6 = new JLabel("", JLabel.CENTER);
		s1 = new JLabel("", JLabel.CENTER);
		s2 = new JLabel("", JLabel.CENTER);
		s3 = new JLabel("", JLabel.CENTER);
		s4 = new JLabel("", JLabel.CENTER);
		s5 = new JLabel("", JLabel.CENTER);
		s6 = new JLabel("", JLabel.CENTER);

		/*Обозначаем что переменные Label_1,Label_2..являются объектом JLabel и указываем какой текст будет выводиться.
		JLabel.LEFT - выравнивание по левому краю,
		JLabel.CENTER - выравнивание по центру
		*/
		
		button = new JButton("Рассчитать площадь"); //В скобках - надпись на кнопке
	
		m1 = new JTextField();
		a1 = new JTextField();
		b1 = new JTextField();
		kol1 = new JTextField();
		
		m2 = new JTextField();
		a2 = new JTextField();
		b2 = new JTextField();
		kol2 = new JTextField();
