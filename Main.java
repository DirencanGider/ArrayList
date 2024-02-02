import java.util.ArrayList;

//add = Listeye ekleme yapmak - Örn: arraylist.add("Metallica"); veya arraylist.add(20); gibi.
//get = Listedeki veriyi çağırmak - Örn: System.out.println(arraylist.get(0)); //0. indeksi yazdır demek istedik.
//size = Liste uzunluğunu öğrenmek - Örn: System.out.println(arraylist.size());
//remove = Listeden veri silmek - Örn: arraylist.remove("Metallica"); veya arraylist.remove(1);
//indexOf = Verinin liste üzerindeki yerini öğrenmek - Örn: System.out.println(arraylist.indexOf("Metallica"));
//lastIndexOf = Veri listeden birden fazla var ise sonuncunun yerini söyler. - Örn: System.out.println(arraylist.lastIndexOf("Metallica"));
//set = Listede günncelleme yapmak - Örn: 4. indeksteki Metallicayı Megadeth ile güncelledik.

public class Main {
    public static void yazdir(ArrayList<String> a) { //ArrayList referansını göndereceğimiz bir metod yazdık. //13.

        for (int i = 0 ; i < a.size() ; i++) {
            System.out.println("Element " + (i+1) + ": " + a.get(i));
        }

    }

    public static void main(String[] args) {

        ArrayList<String> arraylist = new ArrayList<String>(); /*ArrayList, tıpkı Scanner gibi farklı bir class olduğu
                                                                için oluşturduk bu projemize import ile dahil ettik.
                                                                arraylist adlı bir obje referansı oluşturduk.
                                                                ArrayListleri oluştururken hemen yanına veri tipini de
                                                                girmemiz gerekiyor. Biz burada <String> veri tipinde
                                                                oluşturduk.
                                                                */
        //Bu oluşturduğumuz obje referansı üzerinde ekleme, çıkarma, silme gibi tüm işlemleri yapabiliriz.

        arraylist.add("Metallica");
        arraylist.add("Guns' n Roses");
        arraylist.add("Black Sabbath");
        arraylist.add("Iron Maiden");
        arraylist.add("Metallica");

        //System.out.println(arraylist.get(0)); //1.
        //System.out.println(arraylist.get(3)); //2.
        //System.out.println(arraylist.get(5)); //Hata verir. Çünkü listede o kadar indeks yok. //3.

        //System.out.println(arraylist.size()); //Listenin uzunluğunu öğrenmek için kullanılır. //4.

        //arraylist.remove("Metallica"); //Remove silmek için kullanılan bir metod. Direkt elemanı da yazabiliriz. //5.
        //arraylist.remove(1); //Bulunduğu indeksi de yazabiliriz. //6.

        //arraylist.set(4,"Megadeth"); //Listenin sonundaki Metallicayı Megadeth ile güncelledik. Parantez içerisine önce
                                     //bulunduğu indeksi yazıyoruz. Sonra da yerine koyacağımız veriyi yazıyoruz. //12.


        /*for (int i = 0 ; i < arraylist.size() ; i++) { //7.
            System.out.println(arraylist.get(i)); //8.
        }*/

        //System.out.println(arraylist.indexOf("Metallica")); //indexOf Liste üzerindeki yeri bulmak için kullanılır. //9.
        //System.out.println(arraylist.lastIndexOf("Metallica")); //Listede 2 adet Metallica vardı. Bu metod sonuncunun yerini söyledi. //10.
        //System.out.println(arraylist.indexOf("Dream Theater")); //Dream Theater listede olmadığı için -1 değeri döndü. //11.


        //Şimdi son olarak yukarıda, main metodu dışında bir yazdırma metodu yazalım ve aşağıda çağıralım.

        yazdir(arraylist);

    }
}
