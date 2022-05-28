package Bridge;

public abstract class Rapor {
    private IRaporFormat rapor;
    public Rapor(){}

    public IRaporFormat getRapor() {
        return rapor;
    }

    public void setRapor(IRaporFormat rapor) {
        this.rapor = rapor;
    }

    public Rapor(IRaporFormat rapor){
        this.rapor = rapor;
    }

    public abstract void goster();
}

class PerformansRapor extends Rapor{
    
    public PerformansRapor() {}
    
    public PerformansRapor(IRaporFormat raporFormat) {
        super(raporFormat);
    }
    @Override
    public void goster(){
        System.out.println(getRapor().Olustur());
    }    
}

class CalisanRapor extends Rapor{

    public CalisanRapor() {
    }
    public CalisanRapor(IRaporFormat raporFormat) {
        super(raporFormat);
    }
    @Override
    public void goster(){
        System.out.println(getRapor().Olustur());
    }
}