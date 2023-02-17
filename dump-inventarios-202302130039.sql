-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: inventarios
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `clienteID` int NOT NULL AUTO_INCREMENT,
  `nombreCliente` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  PRIMARY KEY (`clienteID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Carolina Herrera'),(2,'Fernando Cubides'),(3,'Gina Calderon'),(4,'Gustavo Uribe'),(5,'Álvaro Molina'),(6,'Eugenia Carrascal');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compra`
--

DROP TABLE IF EXISTS `compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compra` (
  `compraID` int NOT NULL AUTO_INCREMENT,
  `productoID` int NOT NULL,
  `nombreProducto` varchar(100) NOT NULL,
  `valorUnidad` double NOT NULL,
  `cantidad` double DEFAULT NULL,
  PRIMARY KEY (`compraID`),
  KEY `compraFK` (`productoID`),
  CONSTRAINT `compraFK` FOREIGN KEY (`productoID`) REFERENCES `producto` (`productoID`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compra`
--

LOCK TABLES `compra` WRITE;
/*!40000 ALTER TABLE `compra` DISABLE KEYS */;
INSERT INTO `compra` VALUES (12,4,'Asus Vivobook',3245878,5),(13,2,'Lenovo Thinkcentre',7673932,5),(14,2,'Lenovo Thinkcentre',7673932,20),(15,5,'Macbook PRO 15\"',12953436,5),(16,5,'Macbook PRO 15\"',12953436,1),(17,5,'Macbook PRO 15\"',8345789,3),(18,6,'iMac Retina 27\"',13986016,3),(19,6,'iMac Retina 27\"',9986016,3),(20,6,'iMac Retina 27\"',9986016,3),(21,4,'Asus Vivobook',3245878,5),(22,1,'Acer Nitro 5',3398712,5),(23,1,'Acer Nitro 5',3398712,1),(24,1,'Acer Nitro 5',3398712,5),(25,3,'Lenovo Thinkpad',4965123,4),(26,3,'Lenovo Thinkpad',9965123,4),(27,5,'Macbook PRO 15\"',4345789,11),(28,2,'Lenovo Thinkcentre',7673932,50),(29,3,'Lenovo Thinkpad',9965123,4),(30,1,'Acer Nitro 5',4398712,5),(31,6,'iMac Retina 27\"',13986016,10),(32,3,'Lenovo Thinkpad',6965123,10),(33,3,'Lenovo Thinkpad',7675123,5),(34,1,'Acer Nitro 5',3523712,10),(35,1,'Acer Nitro 5',3523712,50),(36,1,'Acer Nitro 5',3523712,50),(37,1,'Acer Nitro 5',3523712,50),(38,1,'Acer Nitro 5',3523712,6),(39,2,'Lenovo Thinkcentre',7673932,50),(40,2,'Lenovo Thinkcentre',7673932,50),(41,1,'Acer Nitro 5',3523712,10),(42,1,'Acer Nitro 5',3523712,10),(43,1,'Acer Nitro 5',3523712,8),(44,1,'Acer Nitro 5',3523712,2),(45,1,'Acer Nitro 5',3523712,32),(46,1,'Acer Nitro 5',3523712,31),(47,3,'Lenovo Thinkpad',4694408.714285715,30),(48,4,'Asus Vivobook',4545878,10),(49,2,'Lenovo Thinkcentre',7673932,10),(50,4,'Asus Vivobook',4570878,10),(51,5,'Macbook PRO 15\"',6345789,4),(52,2,'Lenovo Thinkcentre',7673932,10),(53,1,'Acer Nitro 5',3523712,5),(54,1,'Acer Nitro 5',3523712,5),(55,1,'Acer Nitro 5',3523712,5),(56,1,'Acer Nitro 5',3523712,5),(57,1,'Acer Nitro 5',3523712,10),(58,1,'Acer Nitro 5',3523712,85),(59,1,'Acer Nitro 5',3523712,2),(60,1,'Acer Nitro 5',3523712,2),(61,1,'Acer Nitro 5',3523712,2),(62,1,'Acer Nitro 5',3523712,2),(63,1,'Acer Nitro 5',3523712,2),(64,1,'Acer Nitro 5',3523712,2),(65,3,'Lenovo Thinkpad',4694408,2),(66,1,'Acer Nitro 5',3523712,120),(67,1,'Acer Nitro 5',3523712,10),(68,3,'Lenovo Thinkpad',4694408,10);
/*!40000 ALTER TABLE `compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `productoID` int NOT NULL AUTO_INCREMENT,
  `nombreProducto` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `valorUnidad` double DEFAULT NULL,
  `cantidad` double DEFAULT NULL,
  PRIMARY KEY (`productoID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'Acer Nitro 5',3523712,90),(2,'Lenovo Thinkcentre',7673932,210),(3,'Lenovo Thinkpad',4694408,110),(4,'Asus Vivobook',3770878,55),(5,'Macbook PRO 15\"',7945789,20),(6,'iMac Retina 27\"',9419776,10);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venta` (
  `ventaID` int NOT NULL AUTO_INCREMENT,
  `productoID` int NOT NULL,
  `clienteID` int NOT NULL,
  `cantidad` double NOT NULL,
  `total` double NOT NULL,
  PRIMARY KEY (`ventaID`),
  KEY `venta_FK` (`productoID`),
  KEY `venta_FK_1` (`clienteID`),
  CONSTRAINT `venta_FK` FOREIGN KEY (`productoID`) REFERENCES `producto` (`productoID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `venta_FK_1` FOREIGN KEY (`clienteID`) REFERENCES `cliente` (`clienteID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
INSERT INTO `venta` VALUES (2,1,1,10,33987120),(3,1,1,10,33987120),(4,1,1,5,16993560),(5,1,1,1,3398712),(6,1,1,35,3398712),(7,1,1,34,13594848),(8,2,2,54,30695728),(9,1,1,30,16993560),(10,3,3,32,7930246),(11,3,3,30,7930246),(12,1,1,40,35237120),(13,1,1,100,105711360),(14,2,2,200,76739320),(15,5,5,21,41728945),(16,1,1,70,35237120),(17,1,1,10,35237120),(18,1,1,5,17618560),(21,1,1,10,35237120),(22,3,3,2,9388816),(24,2,2,10,76739320),(26,1,1,12,42284544),(27,1,1,12,42284544),(28,4,4,5,18854390);
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'inventarios'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-13  0:39:08
