package Jobsheet9;

public class StackTugasMahasiswa02 {
    Mahasiswa[] stack;
    int top;
    int size;

    public StackTugasMahasiswa02(int size) {
        this.size = size;
        stack = new Mahasiswa[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        if(top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa mhs){
        if(!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack Penuh! Tidak bisa menmabhakan tugas lagi.");
        }
    }

    public Mahasiswa pop() {
        if(!isEmpty()) {
            Mahasiswa mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack Kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa peek() {
        if(!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack Kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public Mahasiswa peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void print(){
        for (int i = 0; i <= top; i++){
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public int getJumlahTugas() {
        return top + 1;
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi02 stackBiner = new StackKonversi02();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stackBiner.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stackBiner.isEmpty()) {
            biner += stackBiner.pop();
        }
        return biner;
    }
}
