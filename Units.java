public class Units extends NewUnit {

  private double value;
  private String unitName;

  public Units(String unitName, double value){
    super(unitName, value);
    this.value = value;
    this.unitName = unitName;
  }

  public static Units declUnit (Units u1){
    return new Units(u1.getUnitName(), u1.getValue());
  }

  public Boolean compareTo(Units u1, Units u2){
    if(!u1.result.unitName().equals(u2.result.unitName())){
      System.err.println("ERROR: Cant compare different units");
      return false;
    }else if(u1.result.value()==u2.result.value()){
      return true;
    }else{
      return false;
    }
  }

  public static void PrintUnit(Units u1){
    System.out.println( u1.result.value()+" "+u1.result.unitName());
  }

  public static Units Unitadd(Units u1, Units u2){
    Units res;
    if(!u1.result.unitName().equals(u2.result.unitName())) {
      System.err.println("ERROR: Cant add different units");
      System.exit(-1);
      return null;
    }else{
      res =  new Units(u1.result.unitName(), u1.result.value()+u2.result.value());
    }
    return res;
  }

  public static Units Unitsub(Units u1, Units u2){
    if(!u1.result.unitName().equals(u2.result.unitName())){
      System.err.println("ERROR: Cant add different units");
      System.exit(-1);
      return null;
    }else{
      return new Units(u1.result.unitName(), u1.result.value()-u2.result.value());
    }
    
  }

  public static Units UnitMultiply(Units u1, Units u2){
    Double result = u1.result.value()*u2.result.value();
    String s = u1.result.unitName()+ ""+ u2.result.unitName();
    Units newU = new Units(s, result);
    return newU;
  }

  public static Units UnitConstMultiply(Units u1, double x){
    return new Units(u1.result.unitName(), u1.result.value()*x);
  }

  public static Units UnitConstDivide(Units u1, double x){
    return new Units(u1.result.unitName(), u1.result.value()*x);
  }

  public static Units UnitDivide(Units u1, Units u2){
    Double result= u1.result.value()/u2.result.value();
    String s = u1.result.unitName()+ "/"+ u2.result.unitName();
    Units newU = new Units(s, result);
    return newU;
  }

  public static void IncrementUnit(Units u1){
    u1.result.setValue(u1.result.value()+1);
  }

  public static void DecrementUnit(Units u1){
    u1.result.setValue(u1.result.value()-1);
  }
}
