public class PenjualanTas {

        private String nama;
        private static int qty;
        private final int harga ;
        public PenjualanTas(String nama, int harga) {
            this.nama= nama;
            this.harga= harga;
        }
        public void setQty(int qty) {
            this.qty= qty;

        }
        public String struk() {
            int total_harga;
            total_harga=this.harga*this.qty;
            String struk ="Nama Tas :"
            +this.nama
                    +"\nQty :"+this.qty
                    +"\nHarga :"+this.harga
                    +"\nTotal Harga :"+total_harga;
// tempat print ?
            return struk;
        }

    public static void main(String[] args) {
        PenjualanTas tampil = new PenjualanTas("Eiger",100000000);
        tampil.setQty(3);
        System.out.println(tampil.struk());;

    }
    }


