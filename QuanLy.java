import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class QuanLy {
    public static void themSP(Map<String, SanPham> map, SanPham sanPham) {
        if (!map.containsKey(sanPham.getMaSanPham())) {
            map.put(sanPham.getMaSanPham(), sanPham);
        } else System.out.println("san pham da co, vui long nhap lai");
    }

    public static void hienThi(Map<String, SanPham> map) {
        Set<Map.Entry<String, SanPham>> entries = map.entrySet();
        for (Map.Entry<String, SanPham> entry : entries
        ) {
            SanPham sanPham = entry.getValue();
            System.out.println(sanPham.toString());
        }
    }

    public static void timKiem(Map<String, SanPham> map, String code) {
        if (map.containsKey(code)) {
            SanPham o = map.get(code);
            System.out.println(o.toString());
        }
    }

    public static void luuSanPham(Map<String, SanPham> map, String path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(map);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Map docSP(String path) {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Map map = (Map) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Map<String, SanPham> map = new TreeMap<>();
//        SanPham sp1 = new SanPham("001","banh","hai ha",20000);
//        SanPham sp2 = new SanPham("002","banh keo ","hai ha",27000);
//        SanPham sp3 = new SanPham("003","banh vung","hai ha",13000);
//        map.put(sp1.getMaSanPham(),sp1);
//        map.put(sp2.getMaSanPham(),sp2);
//        map.put(sp3.getMaSanPham(),sp3);

//        luuSanPham(map,"D://sanpham.dat");

        map = docSP("D://sanpham.dat");
        hienThi(map);
    }
}
