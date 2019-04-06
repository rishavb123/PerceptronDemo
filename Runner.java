import java.io.IOException;

public class Runner {

    static String[] possibilities = {"Iris-setosa", "Iris-versicolor"};
	
	static double[][] values;
	static String[] classes;
	
	static double[][] testValues;
    static String[] testClasses;
    
    public static void loadData()
	{
		try {
			values = SerializableUtil.deserialize("./iris/values.ser");
			classes = SerializableUtil.deserialize("./iris/classes.ser");
			testValues = SerializableUtil.deserialize("./iris/testValues.ser");
			testClasses = SerializableUtil.deserialize("./iris/testClasses.ser");		
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

    public static int getIndex(String classs)
	{
		for(int i = 0; i < possibilities.length; i++)
			if(possibilities[i].equals(classs))
				return i;
		return -1;
	}

    public static void main(String[] args) {
        loadData();

        Perceptron p = new Perceptron(4);
        System.out.println(java.util.Arrays.toString(testClasses));

    }

}