import java.util.*;

@FunctionalInterface 
interface avgLambda
{
  double avg (ArrayList < Integer > x);
}

public class App
{

  public static void main (String[]args)
  {

    Task ob1 = new Task ();
      ob1.exec ();
  }
}


class Task
{
  void exec ()
  {
    ArrayList < Integer > l = new ArrayList < Integer > ();
    l.add (3);
    l.add (4);
    avgLambda avg = (ArrayList < Integer > x)->{
      double tot = 0.0;
      for (int i = 0; i < x.size (); i++)
             tot += x.get (i);
        return tot / x.size ();
    };
    System.out.println ("Task 1 List average for {3,4}=" + avg.avg (l));
  }
}
			
		 