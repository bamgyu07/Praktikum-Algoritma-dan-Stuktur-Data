package P1Jobsheet10;

public class AntrianLayanan {
    Mahasiswa02[] data;
    int front;
    int rear;
    int size;
    int max;

    AntrianLayanan (int max){
        this.max = max;
        this.data = new Mahasiswa02[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahAntrian(Mahasiswa02 mhs){
        if (IsFull()) {
            System.out.println("Antrian sudah penuh, tidak dapat menambah mahasiswa");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
    }

    public Mahasiswa02 layaniMahasiswa02(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa02 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public void  lihatTerdepan(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM Nama Prodi Kelas");
            data[front].tampilkanData();
        }
    }

    public void lihatAkhir(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa paling belakang: ");
            data[rear].tampilkanData();
        }
    }

    public void tampilkanSemua(){
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }

        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM\t Nama\t Prodi\t Kelas");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian(){
        return size;
    }

    public void clear (){
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
}
