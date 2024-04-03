class truk extends kendaraan{
    int kapasitasMuatan;

    public truk(String pn, String m, int max){
        super(pn, m, max);
    }

    public void setKapasitas(int kapasitas){
        this.kapasitasMuatan = kapasitas;
    }

    public void cek(){
        System.out.println("Penumpang saat ini: "+this.kapasitasMuatan);
    
}}