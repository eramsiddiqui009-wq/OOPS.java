class Instrumemnt 
{
    private String instrumentId;
    private String type;
    private double capacity;
    public Instrument(String instrumentId , String type , double capacity)
    {
        this.instrumentId = instrumentId;
        this.type = type;
        this.capacity = capacity;
    }
    public String getInstrumentId()
    {
        return instrumentId;
    }
    public String getType()
    {
        return type;
      }  public double getCapacity(){ 
    return capacity;
      }
    

    }
}