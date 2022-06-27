/*
 * Copyright (c) 2017. http://hiteshsahu.com- All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * If you use or distribute this project then you MUST ADD A COPY OF LICENCE
 * along with the project.
 *  Written by Hitesh Sahu <hiteshkrsahu@Gmail.com>, 2017.
 */

package com.hitesh_sahu.tienda_istjba.domain.mock;

import com.hitesh_sahu.tienda_istjba.model.CenterRepository;
import com.hitesh_sahu.tienda_istjba.model.entities.Product;
import com.hitesh_sahu.tienda_istjba.model.entities.ProductCategoryModel;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/*
 * This class serve as fake server and provides dummy product and category with real Image Urls taken from flipkart
 */
public class FakeWebServer {

    private static FakeWebServer fakeServer;

    public static FakeWebServer getFakeWebServer() {

        if (null == fakeServer) {
            fakeServer = new FakeWebServer();
        }
        return fakeServer;
    }

    void initiateFakeServer() {

        addCategory();

    }

    public void addCategory() {

        ArrayList<ProductCategoryModel> listOfCategory = new ArrayList<ProductCategoryModel>();

        listOfCategory
                .add(new ProductCategoryModel(
                        "Tecnologia",
                        "Celulares, laptop, electrodomesticos",
                        "10%",
                        "https://www.elempaque.com/documenta/imagenes/116902/Tecnologia-digital-representaria-la-quinta-del-PIB-mundial-G.jpg"));

        listOfCategory
                .add(new ProductCategoryModel(
                        "Vestimentas",
                        "Zapatos, Carteras, Ouftif",
                        "15%",
                        "https://img.freepik.com/foto-gratis/hermosa-mujer-elige-ropa-tienda-cerca-espejo_321831-2595.jpg"));

        CenterRepository.getCenterRepository().setListOfCategory(listOfCategory);
    }

    public void getAllElectronics() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> productlist = new ArrayList<Product>();

        // Ovens
        productlist
                .add(new Product(
                        "Samsung Celular / A03S Negro / 64 GB",
                        "Codigo de producto: #01AD568",
                        " Samsung, hoy con su modelo de Smartphone A03s que te brinda mayor eficiencia y velocidad gracias a su poderoso sistema operativo Android 11, además te permite capturar los mejores momentos en una nitidez increíble gracias a su cuádruple cámara principal de 13MP+ 2MP + 2MP, cuenta con pantalla de 6.5” tipo TFT LCD que te dará una resolución de 720X1600 en HD+..",
                        "259",
                        "10",
                        "199",
                        "0",
                        "https://www.lavictoria.ec/wp-content/uploads/2021/10/TELEFONO-CELULAR-SAMSUNG-GALAXY-AZUL-A03S-SM-A037M-DS-1.jpg",
                        "Sansung"));

        productlist
                .add(new Product(
                        "Iphone 12 Pro",
                        "Codigo de producto: #1701MT ",
                        "DIMENSIONES Y PESO\t146,7 x 71,5 x 7,4 milímetros\n" +
                                "189 gramos\n" +
                                "PANTALLA\tSuper Retina XDR\n" +
                                "OLED de 6,1″\n" +
                                "Ratio 19.5:9\n" +
                                "FullHD a 2.532 x 1.170\n" +
                                "HDR10\n" +
                                "460 ppp\n" +
                                "PROCESADOR\tApple A14\n" +
                                "RAM\tRAM 6 GB\n" +
                                "VERSIONES\t128 GB\n" +
                                "256 GB\n" +
                                "512 GB\n" +
                                "CÁMARAS TRASERAS\t12 MP f/1.6 26mm OIS\n" +
                                "12 MP (tele) f/2.2 52mm OIS\n" +
                                "12 MP f/1.6 13mm ultra gran angular 120º\n" +
                                "Cámara LiDAR\n" +
                                "Vídeo 4K@60fps\n" +
                                "Grabación en Dolby Vision\n" +
                                "Cámara lenta frontal\n" +
                                "CÁMARA FRONTAL\t12 megapíxeles f/2.2\n" +
                                "HDR\n" +
                                "BATERÍA\tCarga rápida hasta 20W (cargador no incluido)\n" +
                                "MagSafe 15W\n" +
                                "Carga Qi de 7,5W\n" +
                                "SISTEMA OPERATIVO\tSOFTWARE iOS 14\n" +
                                "CONECTIVIDAD\t5G (sub‑6 GHz y mmWave)\n" +
                                "Gigabit LTE con 4×4 MIMO y LAA4\n" +
                                "Wi‑Fi 6 (802.11ax) con 2×2 MIMO\n" +
                                "Bluetooth 5.0\n" +
                                "NFC\n" +
                                "OTROS\tFaceID\n" +
                                "Protección IP68",
                        "1580",
                        "10",
                        "1320",
                        "0",
                        "https://redcell.ec/wp-content/uploads/2021/06/iphone-12-pro-1.jpg",
                        "Iphone"));

        productlist
                .add(new Product(
                        "HUAWEI P30 PRO 256GB",
                        "Codigo de producto: #ER45671",
                        "Modelo                           Huawei P30 Pro\n" +
                                "\n" +
                                "Pantalla                          6.47 Pulgadas OLED\n" +
                                "\n" +
                                "Procesador                    Kirin\n" +
                                "\n" +
                                "Memoria                         256Gb – 8Gb RAM \n" +
                                "\n" +
                                "Cámara Delantera          32MP\n" +
                                "\n" +
                                "Cámara Posterior           Quad 40/8/20/0.2MP\n" +
                                "\n" +
                                "Batería                            4200 mAh\n" +
                                "\n" +
                                "Colores                           Negro, Blanco, Plomo, Azul",
                        "864",
                        "10",
                        "834",
                        "0",
                        "https://static.wixstatic.com/media/5d3c37_6862f0c99f3e47a2bf7c3b0f70806ba9~mv2.png/v1/fill/w_530,h_530,al_c,lg_1,q_90/5d3c37_6862f0c99f3e47a2bf7c3b0f70806ba9~mv2.webp",
                        "Huawei"));

        productlist
                .add(new Product(
                        "Xiaomi Note 10 PRO 8/128GB",
                        "Codigo de producto: #XH7690G",
                        "PANTALLA\n" +
                                "6,67” 120 Hz\n" +
                                "HDR10\n" +
                                "DIMENSIONES Y PESO\n" +
                                "164 x 76,5 x 8,1 mm x 193 g\n" +
                                "PROCESADOR\n" +
                                "Qualcomm Snapdragon 732G\n" +
                                "RAM\n" +
                                "8 GB RAM\n" +
                                "ALMACENAMIENTO\n" +
                                "128 GB UFS 2.2\n" +
                                "BATERÍA\n" +
                                "5.020 mAh + 33W\n" +
                                "CÁMARA FRONTAL\n" +
                                "16 MP f/2.45\n" +
                                "CÁMARAS TRASERAS\n" +
                                "108 MP f/1.9\n" +
                                "UGA 8 MP f/2.2\n" +
                                "5 MP telemacro f/2.4\n" +
                                "2 MP profundidad\n" +
                                "SISTEMA OPERATIVO\n" +
                                "Android 11 + MIUI 12\n" +
                                "CONECTIVIDAD\n" +
                                "WiFi, NFC, Bluetooth\n" +
                                "OTROS\n" +
                                "Resistencia a salpicaduras IP53, lector de huella lateral, estéreo\n" +
                                "Dual SIM con bandeja triple, IR\n",
                        "464",
                        "12",
                        "434",
                        "0",
                        "https://redcell.ec/wp-content/uploads/2021/06/Note-10-PRO-6128GB.jpg",
                        "Xiaomi"));

        productlist
                .add(new Product(
                        "LG K41s (32GB) [M-6900]",
                        "Codigo de producto: #23IFB25",
                        "El LG K41S es parte de la nueva serie K de LG para el 2020. Con una pantalla HD+ de 6.55 pulgadas, el LG K41S cuenta con un procesador octa-core a 2GHz acompañado de 3GB de memoria RAM y 32GB de almacenamiento interno expandible. La cámara principal del LG K41S es cuádruple, con lentes de 13 MP + 5 MP + 2 MP + 2MP, mientras que su cámara para selfies es de 8 megapixels. Completando las características del LG K41S encontramos una batería de 4000 mAh, puerto USB-C, resistencia de grado militar y Android 9.0 Pie.",
                        "190",
                        "10",
                        "232",
                        "0",
                        "https://www.allstock.ec/wp-content/uploads/2021/05/k41s-completo.jpg",
                        "LG"));

        productMap.put("Celulares", productlist);

        ArrayList<Product> tvList = new ArrayList<Product>();

        // TV
        tvList.add(new Product(
                "Laptop Hp Athlon 3050u 8gb 256gb Ssd M.2 14 Gráfica Raedon Windows 10 Dorado",
                "Codigo de producto: #34WSD12",
                "Nombre del producto\n" +
                        "HP Laptop – 14-dk1002la\n" +
                        "Microprocesador\n" +
                        "AMD Athlon™ Silver 3050U (velocidad base de 2,3 GHz, velocidad de ráfaga máxima de hasta 3,2 GHz, 1 MB de caché L2 y 2 núcleos)\n" +
                        "Memoria, estándar\n" +
                        "8 GB de SDRAM DDR4-2400 (1 x 8 GB)\n" +
                        "Gráficos de vídeo\n" +
                        "Gráficos AMD Radeon™\n" +
                        "Disco duro\n" +
                        "Unidad de estado sólido M.2 de 256 GB\n" +
                        "Unidad óptica\n" +
                        "Unidad óptica no incluida\n" +
                        "Pantalla\n" +
                        "Pantalla con retroiluminación WLED HD SVA BrightView de microborde y 14″ en diagonal (1366 x 768)\n" +
                        "Conectividad inalámbrica\n" +
                        "Combinación de Realtek RTL8821CE 802.11b/g/n/ac (1×1) y Bluetooth® 4.2\n" +
                        "Interfaz de red\n" +
                        "LAN 10/100/1000 GbE integrada\n" +
                        "Ranuras de expansión\n" +
                        "1 lector de tarjetas SD multiformato\n" +
                        "Puertos externos\n" +
                        "Velocidad de señalización de 5 Gbps de 1 USB SuperSpeed Type-C®; Velocidad de señalización de 5 Gbps de 2 USB SuperSpeed Type-A; 1 HDMI 1.4b; 1 RJ-45; 1 pin de CA inteligente; 1 combinación de auriculares y micrófono\n" +
                        "Dimensiones mínimas (anch. x prof. x alt.)\n" +
                        "32,4 x 22,59 x 1,99 cm\n" +
                        "Peso\n" +
                        "1,51 kg\n" +
                        "Tipo de fuente de alimentación\n" +
                        "Adaptador de alimentación de CA inteligente de 45 W\n" +
                        "Tipo de batería\n" +
                        "Iones de litio de 3 celdas y 41 Wh\n" +
                        "Duración de la batería en uso mixto\n" +
                        "Hasta 11 horas\n" +
                        "Duración de la batería durante la reproducción de vídeo\n" +
                        "Hasta 10 horas\n" +
                        "Cámara\n" +
                        "Cámara HD HP TrueVision con micrófono digital integrado\n" +
                        "Funciones de audio\n" +
                        "Dos altavoces\n" +
                        "Software\n" +
                        "Sistema operativo\n" +
                        "Windows 10 Home 64\n" +
                        "HP apps\n" +
                        "HP Audio Switch; Juegos HP por WildTangent; HP JumpStart; HP Support Assistant; HP Connection Optimizer; Protección de BIOS HP\n" +
                        "Software incluido\n" +
                        "McAfee LiveSafe™\n" +
                        "Software preinstalado\n" +
                        "Netflix (30 días de oferta de prueba gratuita)",
                "1600",
                "12",
                "1399",
                "0",
                "https://www.helpcompartes.com/6822-superlarge_default/195122770297-laptop-hp-14cm0135laamd-e29000e-15ghz-a-2ghz4gb500gb14hdradeonwin10hno-dvdla22a94laazul.jpg",
                "HP"));

        tvList.add(new Product(
                "Lenovo V15 (15.6\", Intel)",
                "Codigo de producto: #RED8912",
                "Memoria\tHasta 12 GB / 2666MHz DDR4\n" +
                        "Almacenamiento (opcionales)\tHasta 2 discos (1 HDD y 1 M.2 SSD):\n" +
                        "HDD / SATA 6.0Gb/s, 2.5\" ancho, 7mm alto\n" +
                        "M.2 2242 SSD / PCIe NVMe, PCIe 3.0 x 2, 16Gb/s\n" +
                        "M.2 2280 SSD / PCIe NVMe, PCIe 3.0 x 4, 32Gb/s\n" +
                        "Tarjeta gráfica (opcionales)\t\n" +
                        "Intel UHD\n" +
                        "Intel Iris Plus\n" +
                        "Batería (opcionales)\t\n" +
                        "Hasta 5.5 horas (30Wh)\n" +
                        "Hasta 6 horas (35Wh)\n" +
                        "\n" +
                        "*Según pruebas realizadas con MobileMark 2014. La duración de la batería varía considerablemente según la configuración, el uso y otros factores.\n" +
                        "Cámara\t0,3 M\n" +
                        "Conectividad (opcionales)\t\n" +
                        "802.11ac 1x1 Wi-Fi + Bluetooth 4.2, M.2 Card\n" +
                        "802.11ac 2x2 Wi-Fi + Bluetooth 5.0, M.2 Card\n" +
                        "Seguridad\t\n" +
                        "Módulo de plataforma segura (TPM) 2.0 (firmware)\n" +
                        "Sonido\t\n" +
                        "2 altavoces 1,5 W\n" +
                        "Dolby Audio\n" +
                        "Micrófono\n" +
                        "Teclado\t6 filas, resistente a salpicaduras, teclas multimedia Fn, teclado numérico\n" +
                        "Peso\tA partir de 1.85 kg\n" +
                        "Dimensiones\t362.2mm x 251.5mm x 19.9mm\n" +
                        "Puertos y ranuras (algunos pueden variar y ser opcionales según el modelo)\t\n" +
                        "2 USB 3.1 (1era generación)\n" +
                        "USB 2.0 (1era generación)\n" +
                        "HDMI\n" +
                        "Lector de tarjetas 4-en-1 (MMC, SD, SDHC, SDXC)\n" +
                        "Toma combinada para auriculares y micrófono\n" +
                        "Colores (sujetos a disponibilidad)\t\n" +
                        "Gris acero\n" +
                        "Tapa texturizada opcional",
                "1789",
                "12",
                "1399",
                "0",
                "https://www.lenovo.com/medias/lenovo-laptop-v15-subseries-hero.png?context=bWFzdGVyfC9lbWVhL2ltYWdlcy98OTI5Mzd8aW1hZ2UvcG5nfC9lbWVhL2ltYWdlcy9oZmEvaDgzLzEwNjUyNTMwOTMzNzkwLnBuZ3xiN2Q5YjZiZWU5NjQ5MmM0MGEzZDA2ZWMyYjlmNDkyNDk1YzNmOWZiYzA1MWI4NWJkZmE3MzRjOGE5OGY1ODdk",
                "Lenovo"));

        tvList.add(new Product(
                "MACBOOK AIR DE 13” CHIP M1 DE APPLE – 256GB SSD",
                "Codigo de producto: #MAC34TF",
                "Chip M1 de Apple con CPU de 8 núcleos, GPU de 7 núcleos y Neural Engine de 16 núcleos\n" +
                        "Memoria unificada de 8 GB\n" +
                        "Almacenamiento SSD de 256 GB\n" +
                        "Pantalla Retina con True Tone\n" +
                        "Magic Keyboard\n" +
                        "Touch ID\n" +
                        "Trackpad Force Touch\n" +
                        "Dos puertos Thunderbolt/USB 4",
                "1800",
                "12",
                "1599",
                "0",
                "https://i0.wp.com/mundomac.com.ec/wp-content/uploads/2021/11/Macbook_Air_M1_Apple_Silver.jpg?resize=500%2C500&ssl=1",
                "Mac"));

        tvList.add(new Product(
                "Samsung - Galaxy Book Pro 360 13.3\" AMOLED Touch-Screen Laptop - Intel Evo Platform Core i7 - 16GB Memory - 512GB SSD - Mystic Navy",
                "Codigo de producto: #EDS4578",
                "Samsung Notebook 9 Pro\tSamsung Notebook Flash\n" +
                        "Procesador\t8th Gen Intel® Core™ i7-8565U\tIntel Celeron N4000\n" +
                        "Intel Pentium Silver N5000\n" +
                        "\n" +
                        "Memoria\t8G LPDDR3\t4GB\n" +
                        "SO\tWindows 10 Home\tWindows 10 Home\n" +
                        "Almacenamiento\t256G PCIe NVMe\t64GB eMMC\n" +
                        "Conectividad\t802.11ac 2×2 (Giga)\t802.11ac 2×2 (Giga)\n" +
                        "Gráficos\tIntel® UHD 620 graphics\tInternal\n" +
                        "Potencia\t55Wh, Fast Charging\t39Wh\n" +
                        "Peso\t2.84 lbs\t3.02 lbs\n" +
                        "Dimensiones\t12.1” x 8.1” x .55”\t12.69″ x 8.64″ x 0.67″\n" +
                        "Puertos\tThunderbolt 3 x2, USB-C x1,\n" +
                        "3.5mm, microSD\n" +
                        "\n" +
                        "USB-C x2, USB 3.0 x1, USB 2.0 x1, HDMI x1, 3.5mm, UFS & MicroSD Combo\n" +
                        "Material\tMetal\tPlástico\n" +
                        "Pantalla\t13.3” FHD, 6.7mm bezel, 350 nits\t13.3″ FHD LED Display (1920 x 1080), Anti-Glare\n" +
                        "Cámara\tCámara HD\tWeb Cam\n" +
                        "Altavoces\t1.5W x2, Thunder Amp\t1.5W x2\n" +
                        "Estilo\tActive Pen (included)\tN/A\n" +
                        "Securidad\tFingerprint\tFingerprint\n" +
                        "Teclado\tRetroiluminado\tTipo máquina de escribir\n",
                "1970",
                "12",
                "1743",
                "0",
                "https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6457/6457789_sd.jpg",
                "Sansung Laptop"));

        tvList.add(new Product(
                "Laptop DELL Core i7 11va, 12gb, 512gb, huella, tec ilu",
                "Codigo de Producto #90UTE45",
                "Pantalla WVA de borde estrecho no táctil con retroiluminación LED antirreflejo FHD (1920 x 1080) de 14,0 pulgadas\n" +
                        "Procesador Intel  Core   i7 1165G7 de 11.a generación (caché de 12 MB, hasta 4,7 GHz)\n" +
                        "Windows 10 Home de 64 bits en inglés\n" +
                        "Gráficos Intel  Iris  Xe con memoria gráfica compartida\n" +
                        "Unidad de estado sólido PCIe NVMe de 512 GB M.2\n" +
                        "12 GB, 8 GB + 4 GB, DDR4, 3200 MHz",
                "1600",
                "12",
                "1399",
                "0",
                "https://novicompu.vtexassets.com/arquivos/ids/160002-800-auto?v=637585662538870000&width=800&height=auto&aspect=true",
                "DELL"));

        productMap.put("Laptop", tvList);

        productlist = new ArrayList<Product>();

        // Vaccum Cleaner
        productlist
                .add(new Product(
                        "EQUIPO DE SONIDO SONY",
                        "Codigo de Producto #6790RTV",
                        "MODELO MHC-GN660\n" +
                                "\n" +
                                "MINI COMPONENTE DE ALTA FIDELIDAD\n" +
                                "\n" +
                                "190W x 2 RMS\n" +
                                "\n" +
                                "4200w P.M.P.O",
                        "699",
                        "10",
                        "566",
                        "0",
                        "https://gvecuador.com/comercialgv/wp-content/uploads/sites/9/2020/10/maxresdefault.jpg",
                        "Equipo de Sonido"));

        productlist
                .add(new Product(
                        "Lavadora Secadora Electrolux 11 kgs Eléctrica Inverter Gris EWDX11L32G ",
                        "Codigo de producto #908MNV43",
                        "EWDX11L32G\n" +
                                "– Lavado de 11kgs.\n" +
                                "– Secado de 7kgs.\n" +
                                "– Motor Inverter.\n" +
                                "– Control digital y perilla.\n" +
                                "– Autolimpieza de tina.\n" +
                                "– Lavado a vapor.\n" +
                                "– Dim.: (An/Al/Prof) (60/85/65) cm.",
                        "2699",
                        "10",
                        "2566",
                        "0",
                        "https://electromegaecuador.com/wp-content/uploads/2021/03/LAVADORA-SECADORA-ELECTROLUX-EWDX11L32G.png",
                        "Secadora"));

        productlist
                .add(new Product(
                        "REFRIGERADORA SBS RLF 74920 ",
                        "Codigo de producto: #FG65KJ32",
                        "\n" +
                                "Dimensiones\t74 × 89 × 178 cm\n" +
                                "Color\t\n" +
                                "Gris\n" +
                                "\n" +
                                "Marcas\t\n" +
                                "Teka",
                        "1999",
                        "10",
                        "1576",
                        "0",
                        "https://www.bathandhomecenter.com.ec/wp-content/uploads/2020/01/REFRIGERADORA-RLF-74920-SS.jpg",
                        "Refrigeradora"));

        productlist
                .add(new Product(
                        "Cocina a Gas Indurama 5 Quemadores Con Grill Montecarlo ",
                        "Codigo de Producto: #FGH89BV34",
                        "– 5 Quemadores.\n" +
                                "– Acabados en acero inox.\n" +
                                "– Grill en horno.\n" +
                                "– Asador de pollos.\n" +
                                "– Timer digital.\n" +
                                "– Dim.: (An/Fo/Al) (800/680/940) mm.",
                        "1699",
                        "10",
                        "1566",
                        "0",
                        "https://electromegaecuador.com/wp-content/uploads/2020/03/1-2-1.png",
                        "Cosinas"));

        productlist
                .add(new Product(
                        "Televisor JVC HD Android 40″ pulgadas",
                        "Codigo de producto: #TVGH4567",
                        "TV Full HD JVC Led 40″, modelo con tecnología Crystal Color en su  pantalla, que brinda colores vibrantes y  gran resolución de imagen.\n" +
                                "\n" +
                                "Conexión a cualquier dispositivo mediante sus dos puerto HDMI, además de transmitir archivos multimedia mediante su puerto USB, incluye un puerto VGA, y RCA para mayor versatilidad.\n" +
                                "\n" +
                                "Pantalla plana que permite una resolución de 1366 x 768 HD brindando una experiencia de cine sin salir de casa.",
                        "2699",
                        "10",
                        "2566",
                        "0",
                        "https://www.estuardito.com/wp-content/uploads/2021/08/televisores_smart_tv_ecuador_estuardito_119988.jpg",
                        "Tv"));

        productMap.put("Electrodomesticos", productlist);


        CenterRepository.getCenterRepository().setMapOfProductsInCategory(productMap);

    }

    public void getAllFurnitures() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> productlist = new ArrayList<Product>();

        // Table
        productlist
                .add(new Product(
                        " SheIn Pantalones largos de mezclilla desgastados para mujer, con bolsillos",
                        "Codigo de Producto: #SHEIN903",
                        "La tela vaquera no es elástica, suave y cómoda de llevar\n" +
                                "Cintura alta, jeans desgastados rasgados, longitud larga, pierna resistente, cinco bolsillos en el lateral y la espalda, jeans de mezclilla con botón\n" +
                                "Los jeans holgados estilo novio complementarán bien tus curvas, adecuados para viajes, compras, citas, vacaciones, escuela, trabajo, oficina, fin de semana, uso diario casual\n" +
                                "Ideal para combinar con camisetas, blusas y combinar con botines o sandalias\n" +
                                "Consulta la descripción del artículo a continuación para obtener información sobre las tallas",
                        "87",
                        "15",
                        "70",
                        "0",
                        "https://m.media-amazon.com/images/I/310tdQo7kSL._SL500_.jpg",
                        "Pantalon de mujer"));

        productlist
                .add(new Product(
                        " Nadine H. Women's Blusa para mujer chica 402 5215 color beige Talla 46",
                        "Codigo de producto: #56BLUE25",
                        "Blusa ",
                        "97",
                        "12",
                        "80",
                        "0",
                        "https://i.ebayimg.com/images/g/qP4AAOSwVVdfNSRR/s-l300.jpg",
                        "Blusa"));

        productlist
                .add(new Product(
                        " VESTIDO AZUL REY RANDA",
                        "Codigo de producto: #CX6798E",
                        "Tallas L, M, S",
                        "145",
                        "12",
                        "120",
                        "0",
                        "https://cdn.shopify.com/s/files/1/0269/7458/4934/products/m_5e1658952f4831d4fe88f1b0_1024x1024@2x.jpg?v=1623104430",
                        "Vestido Gala"));

        productlist
                .add(new Product(
                        " SheIn Minifalda corta de piel sintética de cintura alta para mujer, con abertura",
                        "Codigo de producto: #FGB5678N",
                        "Cintura alta, dobladillo asimétrico, color sólido, falda lápiz de cuero, muestra tus curvas sexys, te hace más atractiva\n" +
                                "Vestido perfecto para tus camisetas cortas favoritas, camisola, blusa elegante, camisetas casuales, esta es una falda imprescindible para el armario para mujer\n" +
                                "Perfecto tanto para uso diario en interiores como para actividades al aire libre como para negocios, playa, club, vacaciones, pasar el rato, etc\n" +
                                "Medidas de la modelo: altura: 69.7 in, busto: 31.5 in, altura: 23.6 in, cadera: 34.6 in. La modelo es en talla S.\n" +
                                "Consulta la tabla de tallas antes de comprar.",
                        "25",
                        "12",
                        "19",
                        "0",
                        "https://m.media-amazon.com/images/I/41dnZWbDa1L._SL500_.jpg",
                        "Minifalda"));

        productlist
                .add(new Product(
                        " Chaquetas de cuero para mujer motocicleta bombardero motorista blanco chaqueta de cuero real mujeres",
                        "Codigo de producto: #57YHTD89",
                        "Cierre de Zipper\n" +
                                "Cierre de cremallera\n" +
                                "Hecho a mano con 100% piel de cordero auténtica de alta calidad\n" +
                                "Chaqueta con cremallera asimétrica, elección de elegantes mujeres y ciclistas con cierre de cremallera frontal, dos bolsillos en la parte inferior delantera con cremalleras y un bolsillo en la parte superior con cremallera, mangas completas con puños con lotes de hombro modificados\n" +
                                "Interior de piel de grado militar y forro de algodón o satén en el interior\n" +
                                "Comprueba las medidas de la tabla de tallas para seleccionar el tamaño adecuado.",
                        "200",
                        "12",
                        "130",
                        "0",
                        "https://m.media-amazon.com/images/I/61ia+SHKEmL._AC_UX342_.jpg",
                        "Chaqueta"));

        productlist
                .add(new Product(
                        " Short para mujer tennis, Short tiro corto amplio entero",
                        "Codigo de producto: #56YHG78",
                        "Short para mujer tennis, Short tiro corto amplio entero. color: azul. hecho en material 98% algodon/cotton 2% elastano/elastane",
                        "22",
                        "12",
                        "15",
                        "0",
                        "https://tennisecuador.vteximg.com.br/arquivos/ids/249485-500-750/bermuda-para-mujer-tennis-azul.jpg?v=637582856239130000",
                        "Short"));

        productMap.put("Ouftif", productlist);

        productlist = new ArrayList<Product>();

        // Chair
        productlist
                .add(new Product(
                        "Bolso Arianna para mujer",
                        "Codigo de producto: #ERT543GH",
                        "Bolso Arianna para mujer",
                        "365",
                        "20",
                        "120",
                        "0",
                        "https://paylessec.vtexassets.com/arquivos/ids/280543-800-800?v=637538620663000000&width=800&height=800&aspect=true",
                        "Bolso Arianna"));

        productlist
                .add(new Product(
                        "Carteras y bolso de mano para mujer bolso de hombro vintage con patrón de lichi bolso de mano grande con asa superior y decoración de cadena larga de metal #8484527",
                        "Codigo de producto: #DFG567KM",
                        "Colores: Azul, Rojo, Morado, Negro, Blanco",
                        "36",
                        "20",
                        "20",
                        "0",
                        "https://li0.rightinthebox.com/images/190x250/202101/bps/product/inc/bslngo1609924065007.jpg",
                        "Bolso Linchi"));

        productlist
                .add(new Product(
                        "Mujer Bandolera Bolsa domo Bolsa de hombro Cuero de PU Botones ",
                        "Codigo de product: #BLS4678",
                        "Color sólido Cosecha Diario Oficina y carrera Azul Piscina Rojo Marrón #9068186",
                        "65",
                        "20",
                        "40",
                        "0",
                        "https://litb-cgis.rightinthebox.com/images/640x640/202204/bps/product/inc/vbxzab1650269986381.jpg?fmt=webp&v=1",
                        "Bandolera"));

        productlist
                .add(new Product(
                        "CARTERA LA MEDUSA (VERSACE)",
                        "Codigo de producto: #DFCG5438",
                        "CARTERA LA MEDUSA color Rosado",
                        "650",
                        "20",
                        "732",
                        "0",
                        "https://www.versace.com/dw/image/v2/ABAO_PRD/on/demandware.static/-/Sites-ver-master-catalog/default/dw2512b65f/original/90_DPDI056-DVIT4T_1PE8V_23_LaMedusaContinentalWallet-ContinentalWallets-versace-online-store_0_0.jpg?sw=450&sh=632&sm=fit&sfrm=jpg",
                        "Versace"));

        productlist
                .add(new Product(
                        "RELOJ FOSSIL PARA DAMA",
                        "Codigo de Producto: #BNMK9875",
                        "Reloj Reid de acero inoxidable con tres manecillas para mujer",
                        "365",
                        "20",
                        "240",
                        "0",
                        "https://www.hypernova.com.ec/img/p/1/1/9/5/1195-home_default.jpg",
                        "Fossil"));

        productlist
                .add(new Product(
                        "Reloj de cuero para mujer GENEVA CL7",
                        "Codigo de producto: #TRE567M",
                        "100% nuevo y de alta calidad\n" +
                                "Materiales: Cuero + Aleación de metal\n" +
                                "Tamaño de la caja: 37mm x 37mm\n" +
                                "Espesor del estuche: 7mm\n" +
                                "Ancho de banda: 18mm\n" +
                                "Longitud de La banda: 22.5 cm\n" +
                                "Color: Rojo, Blanco, Negro, Verde, Caqui, Rosa",
                        "36",
                        "20",
                        "24",
                        "0",
                        "https://www.mediaprice.com.ec/wp-content/uploads/2021/08/HTB1YZ3lJVXXXXciaXXXq6xXFXXXz.jpg",
                        "Geneva"));

        productlist
                .add(new Product(
                        "Reloj de cuarzo de moda para mujer Reloj impermeable de acero inoxidable Cristal Dial Reloj de cuarzo analógico",
                        "Codigo de producto: #CFDR8903",
                        "Importado\n" +
                                "La clásica esfera de diamantes analógica estrellada es muy elegante y romántica. Este reloj es muy adecuado para el uso diario y puede convertirte en una estrella brillante en cualquier ocasión.\n" +
                                "Función: este reloj está diseñado con una correa de malla magnética de acero inoxidable. Puede ajustar el reloj de acuerdo con el tamaño de su muñeca en cualquier momento, lo cual es conveniente y práctico.\n" +
                                "Tiempo preciso: movimiento de cuarzo analógico de alta calidad, proporciona un cronometraje preciso y preciso. Este imán no puede tocar el movimiento. Mantenga el imán alejado del movimiento.\n" +
                                "La esfera de vidrio Hardlex mineral resistente a los arañazos, el fondo y la correa de acero inoxidable aseguran una larga vida útil.\n" +
                                "Estilo: lujo / moda / casual, se ve muy simple y de moda. Apto para todo tipo de personas.",
                        "43",
                        "20",
                        "30",
                        "0",
                        "https://www.ubuy.ec/productimg/?image=aHR0cHM6Ly9tLm1lZGlhLWFtYXpvbi5jb20vaW1hZ2VzL0kvNjFlekNheXd5ckwuX0FDX1VMMTAyMF8uanBn.jpg",
                        "cuarzo"));

        productlist
                .add(new Product(
                        "Reloj Mujer Q&Q",
                        "Codigo de producto: #HGBV09854",
                        "Marca\tQ&Q\n" +
                                "Modelo\tC222J014Y\n" +
                                "Tipo\tRelojes análogos\n" +
                                "Género\tMujer\n" +
                                "Dimensiones del tablero\t4 cm\n" +
                                "Material del pulso\tAcero\n" +
                                "Material de la mica\tCristal mineral\n" +
                                "Tamaño de la caja\t4 cm",
                        "350",
                        "20",
                        "245",
                        "0",
                        "https://falabella.scene7.com/is/image/FalabellaCO/3943564_1?wid=800&hei=800&qlt=70",
                        "Q & Q"));

        productlist
                .add(new Product(
                        "EC-Reloj Mujer QYQ",
                        "Codigo de producto: #GFD8976M",
                        "EC-Reloj Mujer QYQ",
                        "198",
                        "20",
                        "120",
                        "0",
                        "https://falabella.scene7.com/is/image/FalabellaCO/25618387",
                        "EC-Reloj"));

        productMap.put("Carteras y Reloj", productlist);

        productlist = new ArrayList<Product>();

        // Chair
        productlist
                .add(new Product(
                        "ZAPATOS CONVERSE CHUCK TAYLOR ALL STAR NEGRO BLANCO M9166C",
                        "Codigo de producto: #GF64WANM",
                        "Converse",
                        "85",
                        "20",
                        "76",
                        "0",
                        "https://atleta.ec/4318-thickbox_default/zapatos-converse-chuck-taylor-all-star-negro-blanco-m9166c.jpg",
                        "Converse"));

        productlist
                .add(new Product(
                        "Zapato De Mujer Tipo Taco Color Negro Marca Piccadilly",
                        "Codigo de Producto: #09BFG12",
                        "•Genero: Mujer\n" +
                                "•Tipo: Taco\n" +
                                "•Subtipo: Casual\n" +
                                "•Color: Negro\n" +
                                "•Ocasión: Diario\n" +
                                "•Alto Del Taco: Medio (3-5.5 Cm)\n" +
                                "•Ancho Del Taco: Medio\n" +
                                "•Origen: Brasil\n" +
                                "•Horma: Normal",
                        "99",
                        "20",
                        "79",
                        "0",
                        "https://cdn.shopify.com/s/files/1/0279/2914/9527/products/130185-177.PY_d4f097a2-0fd4-48d6-bcd6-74e5cd0478c5_2048x2048.jpg?v=1640012735",
                        "Taco"));

        productlist
                .add(new Product(
                        "ZAPATILLAS NIKE AIR FORCE 1 '07 X 3M",
                        "Codigo de producto: #89BVFDS34",
                        "Color Negro",
                        "220",
                        "20",
                        "189",
                        "0",
                        "https://southtienda.com/wp-content/uploads/2021/12/Air-Force-1-Mid-07-2021-Release-Triple-Black-2-min-265x331.jpg",
                        "NiKe"));

        productlist
                .add(new Product(
                        "ZAPATILLAS NIKE AIR FORCE 1 WHEAT",
                        "Codigo de producto: #BFG865QL",
                        "Color: cafe",
                        "356",
                        "20",
                        "245",
                        "0",
                        "https://http2.mlstatic.com/D_NQ_NP_768560-MEC49276091313_032022-W.jpg",
                        "WHEAT"));

        productlist
                .add(new Product(
                        "adidas Postmove",
                        "Codigo de producto: #78ZXAQ65",
                        "Zapatos Adidas ",
                        "299",
                        "20",
                        "189",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ02RCbqDxEMAGn9xPErAHuGqQu2iSPMhKh7A&usqp=CAU",
                        "adidas"));

        productlist
                .add(new Product(
                        "Balenciaga Luxury Fashion Mujer 524039W2FA19010 Zapatillas de Cuero Blanco | Primavera Verano 20",
                        "Codigo de producto: #BTA09876",
                        "Balenciaga Cuero Blanco",
                        "279",
                        "20",
                        "159",
                        "0",
                        "https://m.media-amazon.com/images/I/5135G3BcJpL._AC_UL1334_.jpg",
                        "Balenciaga"));

        productMap.put("Zapatos", productlist);

        productMap.put("Zapatos", productlist);

        CenterRepository.getCenterRepository().setMapOfProductsInCategory(productMap);

    }

    public void getAllProducts(int productCategory) {

        if (productCategory == 0) {

            getAllElectronics();
        } else {

            getAllFurnitures();

        }

    }

}
