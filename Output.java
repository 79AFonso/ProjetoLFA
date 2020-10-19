public class Output{
  public static void main (String[] args){
    Units v1 = new Units("kg", 15);
    Units v2 = Units.declUnit(v1);
    Units v3 = new Units("kg", 10);
    Units v4 = Units.declUnit(v3);
    Units v6 = Units.declUnit(v4);
    Units v7 = Units.declUnit(v2);
    Units v5 = Units.Unitadd(v6,v7);
    Units v8 = Units.declUnit(v5);
    Units v10 = Units.declUnit(v4);
    Units v11 = Units.declUnit(v2);
    Units v9 = Units.Unitsub(v10,v11);
    Units v12 = Units.declUnit(v9);
    int v14 = 5;
    System.out.println(v14);
  }
}