class RegularSubscription  extends Subscription {
    private int tilauksen_kesto;

    public RegularSubscription(String lehden_nimi, String tilaajan_nimi, String toimitusosoite, double kuukausihinta,
            int tilauksen_kesto) {
        super(lehden_nimi, tilaajan_nimi, toimitusosoite, kuukausihinta);
        setTilauksen_kesto(tilauksen_kesto);
    }

    public int getTilauksen_kesto() {
        return tilauksen_kesto;
    }

    public void setTilauksen_kesto(int tilauksen_kesto) {
        if (tilauksen_kesto > 0) {
        this.tilauksen_kesto = tilauksen_kesto;
        } else {
            System.out.println("Syöte ei kelpaa.");
        }
    }

    @Override
    public String printInvoice() {
        double amount = tilauksen_kesto * getKuukausihinta();
        return super.printInvoice() + "Tilauksen tyyppi: Normaalitilaus. \nTilauksen kesto: " + tilauksen_kesto + " kuukautta. \nTilauksen lopullinen hinta: " + amount + ".";
    }

    

}