package P1Jobsheet10;

public class AntrianKRS02 {
    Mahasiswa[] data;
    int front, rear, size, max;
    int totalSudahKRS = 0;
    int kuotaDPA = 30;

    public AntrianKRS02(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void layaniKRS() {
        if (isEmpty()) {
            System.out.println("Antrean kosong");
            return;
        }
        
        int jumlahDilayani = (size >= 2) ? 2 : 1;
        System.out.println("Memproses KRS untuk " + jumlahDilayani + " mahasiswa:");
        
        for (int i = 0; i < jumlahDilayani; i++) {
            if (totalSudahKRS < kuotaDPA) {
                Mahasiswa m = data[front];
                System.out.println("Memproses KRS: " + m.nama);
                front = (front + 1) % max;
                size--;
                totalSudahKRS++;
            } else {
                System.out.println("Kuota DPA (30 mhs) sudah habis!");
                break;
            }
        }
    }
    
    public void enqueue(Mahasiswa mhs) {
        if (!isFull()) {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk antrean.");
        } else {
            System.out.println("Antrean penuh!");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrean kosong.");
        } else {
            System.out.println("Daftar Antrian:");
            for (int i = 0; i < size; i++) {
                data[(front + i) % max].tampilkanData();
            }
        }
    }

    public void tampilDepan() {
        if (isEmpty()) {
            System.out.println("Antrean kosong.");
        } else {
            int limit = (size >= 2) ? 2 : 1;
            System.out.println(limit + " Mahasiswa Terdepan:");
            for (int i = 0; i < limit; i++) {
                data[(front + i) % max].tampilkanData();
            }
        }
    }

    public void tampilAkhir() {
        if (isEmpty()) {
            System.out.println("Antrean kosong.");
        } else {
            System.out.print("Antrean Paling Akhir: ");
            data[rear].tampilkanData();
        }
    }

    public void cetakStatistik() {
        System.out.println("Jumlah antrian saat ini: " + size);
        System.out.println("Total sudah proses KRS  : " + totalSudahKRS);
        System.out.println("Mahasiswa belum dilayani: " + (kuotaDPA - totalSudahKRS));
    }

    public void clear() {
        size = 0;
        front = 0;
        rear = -1;
        System.out.println("Antrean berhasil dikosongkan.");
    }

    public int getSisaMahasiswa() {
        return size;
    }
}