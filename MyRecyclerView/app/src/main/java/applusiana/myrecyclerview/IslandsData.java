package applusiana.myrecyclerview;

import java.util.ArrayList;

public class IslandsData {
    public static String[][] data = new String[][]{
            {"Jeju Islands", "Pulau Jeju (Jeju-do) adalah pulau terbesar di Korea dan terletak di sebelah selatan Semenanjung Korea. Pulau Jeju adalah satu-satunya provinsi berotonomi khusus Korea Selatan. Terletak di Selat Korea, sebelah barat daya Provinsi Jeolla Selatan.", "https://upload.wikimedia.org/wikipedia/commons/d/d1/Map_jeju.png"},
            {"Pulau Palawan", "Provinsi Palawan merupakan sebuah provinsi di Filipina. Ibu kotanya ialah Puerto Princesa City. Provinsi ini letaknya di region MIMAROPA. Provinsi ini memiliki luas wilayah 14.896 km² dengan memiliki jumlah penduduk 892.660 jiwa (2010) atau 178.532 tempat tinggal. Provinsi ini memiliki angka kepadatan penduduk 60 jiwa/km².", "https://upload.wikimedia.org/wikipedia/commons/2/20/Ph_locator_map_palawan.png"},
            {"Jawa", "Java, adalah sebuah pulau di Indonesia dan merupakan pulau terluas ke-13 di dunia. Dengan jumlah penduduk sekitar hampir 160 juta, pulau ini pulau berpenduduk terbanyak di dunia dan merupakan salah satu tempat terpadat di dunia. Meskipun hanya menempati urutan terluas ke-5, ", "https://upload.wikimedia.org/wikipedia/commons/4/43/Java_Topography.png"},
            {"Tahiti", "Tahiti adalah pulau terbesar di Polinesia Prancis, terletak di Kepulauan Society, di bagian selatan Samudra Pasifik. Pulau ini berpenduduk 169.677 jiwa menurut Sensus Penduduk 2002, dan merupakan pulau dengan penduduk terbanyak di Polinesia Prancis (69% dari jumlah penduduk total). Ibu kotanya adalah Papeete, yang terletak di pantai timur laut. Tahiti juga dikenal dengan sebutan Otaheite.", "https://upload.wikimedia.org/wikipedia/commons/0/06/Karta_FP_Societe_isl.PNG"},
            {"Sulawesi", "Celebes, adalah sebuah pulau di Indonesia. Sulawesi merupakan salah satu dari empat Kepulauan Sunda Besar, dan merupakan pulau terbesar kesebelas di dunia, yang terletak di sebelah timur Kalimantan, sebelah barat Kepulauan Maluku, dan sebelah selatan Mindanao dan Kepulauan Sulu, Filipina. ", "https://upload.wikimedia.org/wikipedia/commons/6/65/Sulawesi_Topography.png"},
            {"Papua", "New Guinea atau Guinea Baru (bahasa Inggris: New Guinea, bahasa Indonesia: Nugini) atau yang dulu disebut dengan Pulau Irian, adalah pulau terbesar kedua (setelah Tanah Hijau) di dunia yang terletak di sebelah utara Australia. Di pulau yang bentuknya menyerupai burung cendrawasih ini terletak gunung tertinggi di Indonesia, yaitu Puncak Jaya (4.884 m).", "https://upload.wikimedia.org/wikipedia/commons/b/b6/New_Guinea_Topography.png"},
            {"Bali", "Pulau Dewata, adalah sebuah provinsi di Indonesia. Ibu kota provinsi ini adalah Denpasar. dan kini terbagi menjadi 3 provinsi: Bali, Nusa Tenggara Barat, dan Nusa Tenggara Timur Selain terdiri dari Pulau Bali, wilayah Provinsi Bali juga terdiri dari pulau-pulau yang lebih kecil di sekitarnya, yaitu Pulau Nusa Penida, Pulau Nusa Lembongan, Pulau Nusa Ceningan, Pulau Serangan, dan Pulau Menjangan.", "https://upload.wikimedia.org/wikipedia/commons/b/bf/Bali_Labeled.png"},
            {"Pulau Seribu", "Kepulauan Seribu, adalah sebuah kabupaten administrasi di Daerah Khusus Ibukota Jakarta, Indonesia. Pusat pemerintahan kabupaten ini terletak di Pulau Pramuka sejak tahun 2003. Terdapat dua Kecamatan di Kabupaten Administrasi Kepulauan Seribu yakni Kecamatan Kepulauan Seribu Selatan dan Kecamatan Kepulauan Seribu Utara.", "https://upload.wikimedia.org/wikipedia/commons/c/c6/Peta_Banten_Utara.png"},
            {"Hawaii", "Hawaii atau Hawai'i merupakan salah satu pulau wisata paling terkenal di dunia, potensi keindahan alam serta wisata bahari yang sangat unik membuat Hawaii dikenal hampir seluruh pelosok dunia. ", "https://en.wikipedia.org/wiki/Hawaiian_Islands#/media/File:Hawaiianislandchain_USGS.png"},
            {"Pulau Komodo", "(Taman Nasional Komodo), Pulau Komodo dikenal sebagai habitat asli hewan komodo. Pulau ini juga merupakan kawasan Taman Nasional Komodo yang dikelola oleh Pemerintah Pusat. Pulau Komodo berada di sebelah timur Pulau Sumbawa, yang dipisahkan oleh Selat Sape.", "https://upload.wikimedia.org/wikipedia/commons/c/c6/Flores_Locator_Topography.png"},
            {"Santorini", "Santorini merupakan kelompok bundar pulau gunung berapi di Laut Aegea, terletak 200 km dari daratan Yunani. Pulau ini merupakan kelompok Kepulauan Cyclades. Pulau ini memiliki luas wilayah 73 km² dan populasi 13.600 jiwa (2001). Pulau ini dikenal karena sektor pariwisata dan industri wine-nya. Santorini juga memiliki beberapa situs bersejarah dan dulunya merupakan salah satu pusat peradaban yang penting.", "https://upload.wikimedia.org/wikipedia/commons/c/c7/GR_Thira.PNG"},
            {"Bora Bora", "Bora Bora adalah sebuah pulau di gugus Leeward dari Kepulauan Masyarakat, Polinesia Prancis, sebuah jajahan seberang laut Prancis yang terletak di Samudera Pasifik. Pulau ini terletak sekitar 230 km (140 mi) barat laut dari Papeete. Pulau ini dikelilingi sebuah laguna dan deretan terumbu karang.", "https://upload.wikimedia.org/wikipedia/commons/0/06/Karta_FP_Societe_isl.PNG"}
    };

    public static ArrayList<Islands> getListData(){
        ArrayList<Islands> list = new ArrayList<>();
        for (String[] aData : data) {
            Islands islands = new Islands();
            islands.setName(aData[0]);
            islands.setOther(aData[1]);
            islands.setPhoto(aData[2]);

            list.add(islands);
        }

        return list;
    }
}
