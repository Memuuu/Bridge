package Bridge;

interface IRaporFormat{
    String Olustur();
}

class DOC implements IRaporFormat{

    @Override
    public String Olustur() {
        return "DOC";
    }  
}

class PDF implements IRaporFormat{
    @Override
    public String Olustur() {
        return "PDF";
    }
}
