class StandingSubscription extends Subscription {
    private int alennusprosentti;

    public StandingSubscription(String lehden_nimi, String tilaajan_nimi, String toimitusosoite, double kuukausihinta,
            int alennusprosentti) {
        super(lehden_nimi, tilaajan_nimi, toimitusosoite, kuukausihinta);
        setAlennusprosentti(alennusprosentti);
    }

    public int getAlennusprosentti() {
        return alennusprosentti;
    }

    public void setAlennusprosentti(int alennusprosentti) {
        if (alennusprosentti >= 0 & alennusprosentti < 100) {
        this.alennusprosentti = alennusprosentti;
        } else {
            System.out.println("Syöte ei kelpaa.");
        }
    }

    @Override
    public String printInvoice() {
        double total = getKuukausihinta() * 12 * (100-alennusprosentti) / 100;
        return super.printInvoice() + "Tilauksen tyyppi: Kestotilaus. \nLaskutettavien kuukausien määrä: 12. \nKestotilauksen alennusprosentti: " + alennusprosentti + " %. \nTilauksen lopullinen hinta: " + total + ".";
    }



}