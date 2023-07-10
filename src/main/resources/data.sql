CREATE TABLE `producto` (
                            `producto_id` int NOT NULL,
                            `producto_nombre` varchar(100) DEFAULT NULL,
                            `producto_precio` int DEFAULT NULL,
                            `producto_descripcion` varchar(255) DEFAULT NULL,
                            `producto_categoria` varchar(20) DEFAULT NULL,
                            `producto_cantidad` int DEFAULT NULL,
                            PRIMARY KEY (`producto_id`),
                            KEY `idx_producto_cantidad` (`producto_cantidad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
insert into `producto` (producto_id,producto_nombre,producto_precio, producto_descripcion, producto_categoria)
values (1, "Inmunapis", 6990, "Formulado científicamente para fortalecer tus defensas de manera natural, evitando y aliviando las enfermedades provocados por virus estacionales como resfrío común, influenza, faringitis, bronquitis, entre otros", "Nutracéutico apícola")
(2,"Apicolon", 6990, "Formulado cientificamente para tratar úlceras gástricas, protegiendo su sistema digestivo de malestares provocados por H. Pylori, aliviando los reflujos, ardor estomacal y gastritis", "Nutracéutico apícola")
(3, "Propóleo en spray", 4000, "Formulado para aliviar los dolores de garganta producidos por la tos o irritación (contiene alcohol)", "Natural apícola")
(4, "Propóleo en tintura", 3500, "Propoleo en estado puro disuelto en alcohol, sirve para hacer gárgaras ante infecciones bucales, faringeas, laringeas (amigdalitis)","Natural apícola")
(5, "Bálsamo labial", 2000, "Hidrata, regenera, alivia ardor de labios y mucosas expuestas al frío y resequedad", "Souvenirs")
(6, "Gotas de variedades de hierbas medicinales", 4000, "Gotas de hierbas medicinales para coayudar al tratamiento de distintas afecciones (Salvia-Manzanilla, Melissa-Paz y Flora)","Natural Herbal")
(7, "Gotas relajantes e inductoras del sueño", 4000, "Gotas de hierbas medicinales, para tratar la ansiedad permitiendo inducir el sueño de manera gradual", "Natural Herbal")
(8, "Jabón miel maqui (gránulos) y canela",1500,"Jabon de tocador natural con base de aceite de coco, especial para pieles secas o maltratadas por el día a día", "Natural apícola")
(9, "Jabón miel maqui (gránulos) y lemon grass", 1500, "Jabon de tocador natural con base de aceite de coco, especial para pieles secas o maltratadas por el día a día","Natural apícola")
(10, "Miel pura (250 gramos)", 2500, "Producida respetando los ciclos naturales de vida en las abejas y con cuidados ecológicos y amigables con el medio ambiente, favoreciendo así a los polinizadores locales y la flora endémica de la Araucanía Andina", "Natural apícola")
(11, "Miel pura (500 gramos)", 4500, "Producida respetando los ciclos naturales de vida en las abejas y con cuidados ecológicos y amigables con el medio ambiente, favoreciendo así a los polinizadores locales y la flora endémica de la Araucanía Andina", "Natural apícola")
(12, "Polen granulado", 3500, "Polen granulado de flores del territorio Araucanía Andina recolectado por abejas", "Natural apícola")
(13, "Vela cera de abeja panal", 4500, "Vela de cera de abejas 100% natural sin aditivos, ayuda a limpiar los ambientes", "Souvenirs")
(14, "Vela cera de abeja hexagonal", 3000, "Vela de cera de abejas 100% natural sin aditivos, ayuda a limpiar los ambientes", "Souvenirs")
(15, "Llaveros de polinizadores nativos", 1500, "Llaveros hechos por manos de mujeres de Cunco, representan la diversidad de polinizadores que existen en el territorio", "Souvenirs")
(16, "Vela redonda tipo panal", 4500, "Vela de cera de abejas 100% natural sin aditivos, ayuda a limpiar los ambientes", "Souvenirs")
