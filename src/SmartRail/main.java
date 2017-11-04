package SmartRail;

/************************************
 @author Sarun Luitel
 ************************************/
public class main
{
  public static void main(String[] args)
  {
    instantiate();

  }

  static void instantiate()
  {
    Configuration c = new Configuration();
    Map map = new Map();
    map.setMap(c.getNextLine());
    map.setMap(c.getNextLine());


    Train t1 = new Train((Station) map.getMap(0).get(0), (Station) map.getMap(0).get(map.getcompInLayer(0) - 1));

    Train t2 = new Train((Station) map.getMap(1).get(0), (Station) map.getMap(1).get(map.getcompInLayer(1) - 1));
    t1.start();
    t2.start();
  }
}


