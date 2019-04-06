public class Perceptron {
    
    double[] weights;
	double bias;
	
	double learningRate;
	
	public Perceptron(int n)
	{
		weights = new double[n];
		
		for(int i = 0; i < weights.length; i++)
			weights[i] = Math.random()*2 - 1;
				
		bias = Math.random()*2 - 1;
		
		learningRate = 0.1;
    }
    
    public int guess() {
        return 0;
    }

    public void train()
    {

    }

    public int activation()
    {
        if(x > 0)
            return 1;
        else
            return 0;
    }

}