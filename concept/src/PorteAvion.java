public class PorteAvion{
    public static void main(String[] args) {
        Avion avion = new Avion();
        AvionDeChasse aviondechasse = new AvionDeChasse();
        AvionDeTransport aviondetransport = new AvionDeTransport();

        avion.decoller();
        aviondechasse.decoller();
        aviondetransport.decoller();
        
    }
    
}