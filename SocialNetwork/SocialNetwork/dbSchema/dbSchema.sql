CREATE DATABASE  IF NOT EXISTS `articledatabase` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `articledatabase`;
-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: articledatabase
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `article`
--

DROP TABLE IF EXISTS `article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Title` varchar(100) NOT NULL,
  `Body` varchar(2000) NOT NULL,
  `Author` varchar(15) NOT NULL,
  `Likes` int(11) DEFAULT NULL,
  `published` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `article`
--

LOCK TABLES `article` WRITE;
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
INSERT INTO `article` VALUES (10,'Mistakes','The most common mistake involving articles is using \'an\' instead of \'a\' (or vice versa). This mistake occurs because writers believe \'an\' is used before a vowel and \'a\' before a consonant. That is not entirely accurate. \'An\' is used before a vowel sound and \'a\' is used before a consonant sound. The word sound is important because consonants can create vowel sounds, and vowels can create consonant sounds. Therefore, the use of \'an\' or \'a\' is determined by the sound not the letter. Look at these examples:','Mr. Pressford',4,'2019/11/08 19:53:49'),(11,'Bullying','In my place, Primary School doesn\'t have the bully, but the Secondary School is maybe, it happened in my class, it was my classmate. I didn\'t know what did she do but the bully said don\'t play, don\'t talk, don\'t help and even don\'t smile with her. All the bully in my class is all bad study but fortunately, I have my friends, they like my sisters. I won\'t know what to do if I without them. But in general, if you being bullying, you need to find help with your good friends or teachers. I\'ll give you guys a \"Fighting\" for your school time. : )','Shpat Buzoku',3,'2019/11/08 19:55:40'),(12,'Anxiety','Finally, we have an article that shares some brilliant advice that comes from a Finnish photographer named Arno Rafael Minkkinen. In this article, I explain the philosophy Minkkinen used to make it through the difficult portions of his career and ultimately produce unique and meaningful work. No matter what profession you are in, his advice is valuable.','Rafael Arno',6,'2019/11/08 19:56:33'),(13,'Television','Television is one of the most important inventions of the century. Almost everyone owns a TV set at home today. Be it educational or entertainment, life would be so boring without one nowadays. Gd  First of all, thanks to television we have the latest information at our fingertips Gd. We are constantly informed of what is happening around the world without leaving home. Furthermore, television has made learning at home possible. In fact, some tv C stations dedicate their programmes to specific interests.','Anna Maria',0,'2019/11/08 19:57:24'),(14,'Feedback','This article demonstrates excellent language control; it is virtually error-free. Let\'s look closely at the task itself now. Today\'s television: \"A load of old rubbish\" or \"More choice than ever before\"? Is today\'s television still good value for money? Unfortunately you don\'t really get to grips with the above questions. What you have written is more of a generalised essay on TV rather than a comment on its quality and value for money. You have to be very careful in the exam to answer all aspects of the tasks or you could lose valuable marks. To sum up, therefore, there are no problems in terms of language expression - just make sure that you pay close attention to the task in the exam and answer the right question!','Mr. Enver',8,'2019/11/08 19:59:03');
/*!40000 ALTER TABLE `article` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-08 21:05:55
