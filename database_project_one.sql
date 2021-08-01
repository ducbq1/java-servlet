-- MariaDB dump 10.17  Distrib 10.4.10-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: projectoneversiontwo
-- ------------------------------------------------------
-- Server version	10.4.10-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bill` (
  `bill_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `total` double NOT NULL,
  `payment` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `address` longtext COLLATE utf8mb4_unicode_ci NOT NULL,
  `date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `name` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `phone` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`bill_id`),
  KEY `fk_bill_1` (`user_id`),
  CONSTRAINT `fk_bill_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` VALUES (1575046152047,1574679903816,243,'ViettinBank','VietNam','2019-11-29 16:49:12','BuiQuangDuc','0334619739'),(1575046419724,1574679903816,487,'SocoHref','NewYork','2019-11-29 16:53:39','DucDepTrai','0463297954'),(1575047382964,1574679903816,457,'Finally','World of my life','2019-11-29 17:09:42','Nguyen Phuong Thao','00000010101001'),(1575141120408,1574679903816,509,'WorldBanking','Tokyo','2019-11-30 19:12:00','Nhu Quynh Nguyen','0123456789'),(1575146852516,1574777256576,376,'exhausted','China','2019-11-30 20:47:32','Pham Ly','0463197393'),(1575385733123,1574777256576,217,'','','2019-12-03 15:08:53','','');
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bill_detail`
--

DROP TABLE IF EXISTS `bill_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bill_detail` (
  `bill_detail_id` bigint(20) NOT NULL,
  `bill_id` bigint(20) NOT NULL,
  `product_id` bigint(20) NOT NULL,
  `price` double NOT NULL,
  `quantity` int(11) NOT NULL,
  PRIMARY KEY (`bill_detail_id`),
  KEY `fk_bill_detail_1` (`bill_id`),
  KEY `fk_bill_detail_2` (`product_id`),
  CONSTRAINT `fk_bill_detail_1` FOREIGN KEY (`bill_id`) REFERENCES `bill` (`bill_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_bill_detail_2` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill_detail`
--

LOCK TABLES `bill_detail` WRITE;
/*!40000 ALTER TABLE `bill_detail` DISABLE KEYS */;
INSERT INTO `bill_detail` VALUES (1575046152058,1575046152047,6854,43,3),(1575046152064,1575046152047,774,74,1),(1575046419737,1575046419724,6,45,1),(1575046419746,1575046419724,6854,43,10),(1575047382975,1575047382964,5,99,1),(1575047382981,1575047382964,6,45,5),(1575047383000,1575047382964,7,66,1),(1575141120427,1575141120408,2,34,1),(1575141120444,1575141120408,5,99,4),(1575146852538,1575146852516,3,56,1),(1575146852553,1575146852516,6004,7,1),(1575146852567,1575146852516,5,99,3),(1575385733146,1575385733123,6854,43,4);
/*!40000 ALTER TABLE `bill_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `category_id` bigint(20) NOT NULL,
  `category_name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Thực phẩm chức năng'),(2,'Món tráng miệng'),(3,'Món ăn theo combo'),(4,'Thực phẩm dùng để trang trí'),(5,'Thực phẩm không để ăn');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contact`
--

DROP TABLE IF EXISTS `contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contact` (
  `contact_id` bigint(20) NOT NULL,
  `contact_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `contact_web` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `contact_email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `contact_title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `contact_message` longtext COLLATE utf8_unicode_ci DEFAULT NULL,
  `contact_date` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`contact_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact`
--

LOCK TABLES `contact` WRITE;
/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` VALUES (1575039756544,'Hua Ngan Xuyen','fb://ducdeptrai.com','duc.bq@sis.hust.edu.vn','Web','Trang web tốt lắm, địa chỉ uy tín, chất lượng tuyệt vời, giao hàng nhanh','2019-11-29 15:02:36'),(1575039839479,'Diep Khai Nguyen','fb://ducdeptrai.com','kasanumoto@yahoo.com.vn','Service','Giao hàng nhanh, giá cả phải chăng, phục vụ rất tận tình','2019-11-29 15:03:59'),(1575039922418,'Ho Vinh Hoa','fb://ducdeptrai.com','tester@ahihi.com','All','Tuyệt vời, tuy vậy nhưng ăn có vẻ không ngon lắm nhỉ?','2019-11-29 15:05:22'),(1575041846666,'Anonymous','fb://ducdeptrai.com','kasanumoto@gmail.com','Product','Món ăn không được ngon lắm xong chất lượng dịch vụ chăm sóc khách hàng rất tốt, vote 5 sao nhé','2019-11-29 15:37:26'),(1575042000781,'Vo Danh','fb://ducdeptrai.com','vodanh@hotmail.com','Product','Thực phẩm không đúng như mô tả trên hình ảnh, mình mua về rồi xong muốn đem đổi trả nhưng không được, khá thất vọng','2019-11-29 15:40:00'),(1575042082872,'Harry Potter','fb://ducdeptrai.com','potter.harry@fb.com','None','Thôi cứ comment cho đủ 250 kí tự cho page vui nhé! Đùa thôi chứ mình đánh giá cao chất lượng của shop dù mới hoạt động được 70 năm!','2019-11-29 15:41:22'),(1575046263057,'The GodFather','fb://ducdeptrai.com','admin@forfun.net','Product','Chất lượng thực phẩm tuyệt vời, mình có mua thử \"Combo nấm độc\" về ăn nhưng không thấy bị sao cả, hay lắm!','2019-11-29 16:51:03'),(1575046299253,'Pray For Me','fb://ducdeptrai.com','fatherGod@docker.cap','All','No comment, test for fun, keep calm and see my opinion, that\'s all for now, watch out for my action','2019-11-29 16:51:39'),(1575513341333,'Le Phuong An','fb://crushofduc.net','crush@education.com','All','TEST FOR FUN','2019-12-05 02:35:41');
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `product_id` bigint(20) NOT NULL,
  `category_id` bigint(20) NOT NULL,
  `product_name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `product_image` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `product_price` double NOT NULL,
  `product_description` longtext COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`product_id`),
  KEY `fk_product_1` (`category_id`),
  CONSTRAINT `fk_product_1` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,2,'Cá viên chiên giòn, bánh mỳ','image/product01.jpg',22,'One of the first ways I determine if a script is a pass or a consider is if it was an easy read. Did I breeze through these pages quickly and still retain a good sense of what the story was about? Was I turning those pages at a fast rate, eager to see what was on the next page? Or was it a chore to get through each page? Did my mind wander? Was I tempted to check my email, get a sandwich, make sure my DVR was programmed properly for that week’s offerings?'),(2,1,'Mứt dâu tây','image/product02.jpg',34,'One of the first ways I determine if a script is a pass or a consider is if it was an easy read. Did I breeze through these pages quickly and still retain a good sense of what the story was about? Was I turning those pages at a fast rate, eager to see what was on the next page? Or was it a chore to get through each page? Did my mind wander? Was I tempted to check my email, get a sandwich, make sure my DVR was programmed properly for that week’s offerings?'),(3,3,'Cà chua, kẹo que','image/product03.jpg',56,'One of the first ways I determine if a script is a pass or a consider is if it was an easy read. Did I breeze through these pages quickly and still retain a good sense of what the story was about? Was I turning those pages at a fast rate, eager to see what was on the next page? Or was it a chore to get through each page? Did my mind wander? Was I tempted to check my email, get a sandwich, make sure my DVR was programmed properly for that week’s offerings?'),(4,1,'Mứt cam, mứt chanh','image/product04.jpg',78,'One of the first ways I determine if a script is a pass or a consider is if it was an easy read. Did I breeze through these pages quickly and still retain a good sense of what the story was about? Was I turning those pages at a fast rate, eager to see what was on the next page? Or was it a chore to get through each page? Did my mind wander? Was I tempted to check my email, get a sandwich, make sure my DVR was programmed properly for that week’s offerings?'),(5,3,'Bít tết, súp lơ','image/product05.jpg',99,'One of the first ways I determine if a script is a pass or a consider is if it was an easy read. Did I breeze through these pages quickly and still retain a good sense of what the story was about? Was I turning those pages at a fast rate, eager to see what was on the next page? Or was it a chore to get through each page? Did my mind wander? Was I tempted to check my email, get a sandwich, make sure my DVR was programmed properly for that week’s offerings?'),(6,5,'Kem dâu khô','image/product06.jpg',45,'One of the first ways I determine if a script is a pass or a consider is if it was an easy read. Did I breeze through these pages quickly and still retain a good sense of what the story was about? Was I turning those pages at a fast rate, eager to see what was on the next page? Or was it a chore to get through each page? Did my mind wander? Was I tempted to check my email, get a sandwich, make sure my DVR was programmed properly for that week’s offerings?'),(7,3,'Súp lơ tẩm dầu','image/product07.jpg',66,'One of the first ways I determine if a script is a pass or a consider is if it was an easy read. Did I breeze through these pages quickly and still retain a good sense of what the story was about? Was I turning those pages at a fast rate, eager to see what was on the next page? Or was it a chore to get through each page? Did my mind wander? Was I tempted to check my email, get a sandwich, make sure my DVR was programmed properly for that week’s offerings?'),(8,1,'Mỳ trộn thập cẩm','image/product08.jpg',78,'One of the first ways I determine if a script is a pass or a consider is if it was an easy read. Did I breeze through these pages quickly and still retain a good sense of what the story was about? Was I turning those pages at a fast rate, eager to see what was on the next page? Or was it a chore to get through each page? Did my mind wander? Was I tempted to check my email, get a sandwich, make sure my DVR was programmed properly for that week’s offerings?'),(24,2,'Thịt viên chiên giòn','image/product09.jpg',43,'One of the first ways I determine if a script is a pass or a consider is if it was an easy read. Did I breeze through these pages quickly and still retain a good sense of what the story was about? Was I turning those pages at a fast rate, eager to see what was on the next page? Or was it a chore to get through each page? Did my mind wander? Was I tempted to check my email, get a sandwich, make sure my DVR was programmed properly for that week’s offerings?'),(42,1,'Mỳ xào, rượu vang','image/product10.jpg',77,'One of the first ways I determine if a script is a pass or a consider is if it was an easy read. Did I breeze through these pages quickly and still retain a good sense of what the story was about? Was I turning those pages at a fast rate, eager to see what was on the next page? Or was it a chore to get through each page? Did my mind wander? Was I tempted to check my email, get a sandwich, make sure my DVR was programmed properly for that week’s offerings?'),(48,3,'Bánh bông lan, kẹo hoa quả','image/product11.jpg',765,'One of the first ways I determine if a script is a pass or a consider is if it was an easy read. Did I breeze through these pages quickly and still retain a good sense of what the story was about? Was I turning those pages at a fast rate, eager to see what was on the next page? Or was it a chore to get through each page? Did my mind wander? Was I tempted to check my email, get a sandwich, make sure my DVR was programmed properly for that week’s offerings?'),(49,2,'Bánh bột mỳ, cam nho','image/product12.jpg',677,'One of the first ways I determine if a script is a pass or a consider is if it was an easy read. Did I breeze through these pages quickly and still retain a good sense of what the story was about? Was I turning those pages at a fast rate, eager to see what was on the next page? Or was it a chore to get through each page? Did my mind wander? Was I tempted to check my email, get a sandwich, make sure my DVR was programmed properly for that week’s offerings?'),(54,1,'Hỗn hợp hoa quả sấy','image/product13.jpg',98,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integer bibendum sodales arcu id te mpus. Ut consectetur lacus leo, non scelerisque nulla euismod nec.'),(64,3,'Salad cải bắp, hành tây','image/product14.jpg',65,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integer bibendum sodales arcu id te mpus. Ut consectetur lacus leo, non scelerisque nulla euismod nec.'),(74,1,'Hải sản tôm tươi, rau quả','image/product15.jpg',34,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integer bibendum sodales arcu id te mpus. Ut consectetur lacus leo, non scelerisque nulla euismod nec.'),(84,4,'Combo tôm chiên, salad','image/product16.jpg',67,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integer bibendum sodales arcu id te mpus. Ut consectetur lacus leo, non scelerisque nulla euismod nec.'),(406,1,'Hoa quả xào','image/product17.jpg',43,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integer bibendum sodales arcu id te mpus. Ut consectetur lacus leo, non scelerisque nulla euismod nec.'),(444,3,'Mứt hoa quả, sữa tươi','image/product18.jpg',65,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integer bibendum sodales arcu id te mpus. Ut consectetur lacus leo, non scelerisque nulla euismod nec.'),(454,3,'Bánh gối vị chanh','image/product19.jpg',34,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integer bibendum sodales arcu id te mpus. Ut consectetur lacus leo, non scelerisque nulla euismod nec.'),(474,2,'Trứng dán nhật nguyệt','image/product20.jpg',65,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integer bibendum sodales arcu id te mpus. Ut consectetur lacus leo, non scelerisque nulla euismod nec.'),(774,2,'Dâu tây nguyên bản','image/product21.jpg',74,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integer bibendum sodales arcu id te mpus. Ut consectetur lacus leo, non scelerisque nulla euismod nec.'),(994,4,'Cháo bột vị hoa quả','image/product22.jpg',24,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integer bibendum sodales arcu id te mpus. Ut consectetur lacus leo, non scelerisque nulla euismod nec.'),(6004,5,'Cháo bột vô danh','image/product23.jpg',7,'One of the first ways I determine if a script is a pass or a consider is if it was an easy read. Did I breeze through these pages quickly and still retain a good sense of what the story was about? Was I turning those pages at a fast rate, eager to see what was on the next page? Or was it a chore to get through each page? Did my mind wander? Was I tempted to check my email, get a sandwich, make sure my DVR was programmed properly for that week’s offerings?'),(6564,2,'Rau trộn cơm','image/product24.jpg',98,'One of the first ways I determine if a script is a pass or a consider is if it was an easy read. Did I breeze through these pages quickly and still retain a good sense of what the story was about? Was I turning those pages at a fast rate, eager to see what was on the next page? Or was it a chore to get through each page? Did my mind wander? Was I tempted to check my email, get a sandwich, make sure my DVR was programmed properly for that week’s offerings?'),(6854,3,'Combo nấm độc','image/product25.jpg',43,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integer bibendum sodales arcu id te mpus. Ut consectetur lacus leo, non scelerisque nulla euismod nec.');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `user_id` bigint(20) NOT NULL,
  `user_name` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `user_email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `user_pass` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `user_role` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1574679232274,'root','root@root.com','63a9f0ea7bb98050796b649e85481845',''),(1574679248017,'admin','admin@hotmail.com','21232f297a57a5a743894a0e4a801fc3',''),(1574679890109,'customer','customer@domain.net','91ec1f9324753048c0096d036a694f86','\0'),(1574679903816,'kasanumoto','kasanumoto@hotmail.com.net','195bc0af8b28f60fd5cd86923b8b77eb','\0'),(1574777256576,'tester','tester@sis.hust.edu.vn','195bc0af8b28f60fd5cd86923b8b77eb','\0'),(1575485104607,'SE_New','duc.bq173023@sis.hust.edu.vn','195bc0af8b28f60fd5cd86923b8b77eb',''),(1575511467677,'Le Phuong An','Kasa@sis.hust.edu.vn','9a286406c252a3d14218228974e1f567',''),(1575511964591,'Le Phuong An','crush@gmail.com','195bc0af8b28f60fd5cd86923b8b77eb',''),(1575563840522,'Bui Quang Duc','Kasa@sis.hust.edu.vn.net','6b741269b8310ed10155099679cf85a9',''),(1575564838857,'ADDME','ADDME','507eed24b0218f1e4f97d46b170681dd','\0');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-09 23:22:05
