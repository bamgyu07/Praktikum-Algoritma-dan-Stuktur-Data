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

    public void print(){
        for (int i = 0; i <= top; i++){
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}
