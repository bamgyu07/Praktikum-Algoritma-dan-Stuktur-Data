package Jobsheet9;

public class StackSurat02 {
    Surat02 [] stack;
    int size;
    int top;

    public StackSurat02(int size) {
        this.size = size;
        stack = new Surat02[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat02 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat izin lagi.");
        }
    }

    public Surat02 pop() {
        if (!isEmpty()) {
            Surat02 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin untuk diproses.");
            return null;
        }
    }

    public Surat02 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin yang dikumpulkan.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan: " + stack[i].idSurat + " milik " + stack[i].namaMahasiswa);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat dengan nama " + nama + " tidak ditemukan.");
        }
    }    
}
