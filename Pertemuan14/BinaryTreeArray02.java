package Pertemuan14;

public class BinaryTreeArray02 {
    Mahasiswa02[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray02(){
        this.dataMahasiswa = new Mahasiswa02[10];
    }

    void populateData (Mahasiswa02 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            if(dataMahasiswa[idxStart] != null){
                traverseInOrder(2*idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart + 2);
            }
        }
    }

    public void add(Mahasiswa02 dataMhs){
        if(idxLast >= dataMahasiswa.length -1){
            System.out.println("Data tree sudah penuh");
                return;
        }
        dataMahasiswa[++idxLast] = dataMhs;
    }

    public void traversePreOrder(int idxStart){
        if(idxStart <= idxLast && dataMahasiswa[idxStart] != null){
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2* idxStart + 2);
        }
    }
}
