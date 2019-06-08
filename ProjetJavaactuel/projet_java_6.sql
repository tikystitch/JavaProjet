-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  sam. 08 juin 2019 à 11:05
-- Version du serveur :  5.7.24
-- Version de PHP :  7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `projet_java`
--

-- --------------------------------------------------------

--
-- Structure de la table `bulletin`
--

DROP TABLE IF EXISTS `bulletin`;
CREATE TABLE IF NOT EXISTS `bulletin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `note` int(11) NOT NULL,
  `appreciation` varchar(255) NOT NULL,
  `trimestre` int(11) NOT NULL,
  `ideleve` int(11) NOT NULL,
  `idmatiere` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ideleve` (`ideleve`),
  KEY `idmatiere` (`idmatiere`),
  KEY `trimestre` (`trimestre`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `bulletin`
--

INSERT INTO `bulletin` (`id`, `note`, `appreciation`, `trimestre`, `ideleve`, `idmatiere`) VALUES
(5, 12, 'bon', 1, 1, 0),
(6, 12, 'bon', 1, 1, 0);

-- --------------------------------------------------------

--
-- Structure de la table `bulletinmatiere`
--

DROP TABLE IF EXISTS `bulletinmatiere`;
CREATE TABLE IF NOT EXISTS `bulletinmatiere` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `appreciation` varchar(255) NOT NULL,
  `idbulletin` int(11) NOT NULL,
  `matiere` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idbulletin` (`idbulletin`),
  KEY `matiere` (`matiere`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `bulletinmatiere`
--

INSERT INTO `bulletinmatiere` (`id`, `appreciation`, `idbulletin`, `matiere`) VALUES
(6, 'oui', 6, 0);

-- --------------------------------------------------------

--
-- Structure de la table `classe`
--

DROP TABLE IF EXISTS `classe`;
CREATE TABLE IF NOT EXISTS `classe` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `niveau` varchar(255) NOT NULL,
  `anneescolaire` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `classe`
--

INSERT INTO `classe` (`id`, `nom`, `niveau`, `anneescolaire`) VALUES
(1, '302', '3eme', '2015'),
(2, '303\r\n', '3eme', '2016'),
(6, 's2', 'terminale', '2016'),
(11, '1S2', '', '2019'),
(12, 'TS2', 'null', ''),
(13, '1S2', 'null', '2019'),
(14, 'TL3', 'terminale', '2019');

-- --------------------------------------------------------

--
-- Structure de la table `eleve`
--

DROP TABLE IF EXISTS `eleve`;
CREATE TABLE IF NOT EXISTS `eleve` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `classe` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `classe` (`classe`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `eleve`
--

INSERT INTO `eleve` (`id`, `nom`, `prenom`, `classe`) VALUES
(1, 'Potter', 'Tony', 1),
(2, 'Abadim', 'Samir', 1),
(3, 'Smith', 'Brad', 2),
(4, 'bouu', 'lii', 14),
(5, 'Louis', 'Samir', 1),
(6, 'Jimmou', 'Vuong', 1);

-- --------------------------------------------------------

--
-- Structure de la table `enseignement`
--

DROP TABLE IF EXISTS `enseignement`;
CREATE TABLE IF NOT EXISTS `enseignement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom_matiere` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `enseignement`
--

INSERT INTO `enseignement` (`id`, `nom_matiere`) VALUES
(10, 'Mathématiques'),
(11, 'Physique');

-- --------------------------------------------------------

--
-- Structure de la table `matiere`
--

DROP TABLE IF EXISTS `matiere`;
CREATE TABLE IF NOT EXISTS `matiere` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `note` int(11) NOT NULL,
  `appreciation` varchar(255) NOT NULL,
  `idenseignement` int(11) NOT NULL,
  `idclasse` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idclasse` (`idclasse`),
  KEY `idenseignement` (`idenseignement`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `matiere`
--

INSERT INTO `matiere` (`id`, `note`, `appreciation`, `idenseignement`, `idclasse`) VALUES
(0, 4, 'moyen', 10, 1);

-- --------------------------------------------------------

--
-- Structure de la table `notes`
--

DROP TABLE IF EXISTS `notes`;
CREATE TABLE IF NOT EXISTS `notes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `note` int(11) NOT NULL,
  `appreciation` varchar(255) NOT NULL,
  `idbulletinmatiere` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idbulletinmatiere` (`idbulletinmatiere`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `notes`
--

INSERT INTO `notes` (`id`, `note`, `appreciation`, `idbulletinmatiere`) VALUES
(1, 12, 'moyen', 6);

-- --------------------------------------------------------

--
-- Structure de la table `prof`
--

DROP TABLE IF EXISTS `prof`;
CREATE TABLE IF NOT EXISTS `prof` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `idmatiere` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idmatiere` (`idmatiere`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `prof`
--

INSERT INTO `prof` (`id`, `nom`, `prenom`, `idmatiere`) VALUES
(1, 'Grand', 'Maitre', 10),
(4, 'moi', 'Me', 11),
(5, 'Deslile', 'Laurent', 10);

-- --------------------------------------------------------

--
-- Structure de la table `trimestre`
--

DROP TABLE IF EXISTS `trimestre`;
CREATE TABLE IF NOT EXISTS `trimestre` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(10) NOT NULL,
  `debut` varchar(10) NOT NULL,
  `fin` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `trimestre`
--

INSERT INTO `trimestre` (`id`, `nom`, `debut`, `fin`) VALUES
(1, 'deuxieme', '02/12/2012', '01/02/2013'),
(3, 'deuxieme', '02/12/2012', '01/02/2013'),
(5, 'deuxieme', '02/12/2012', '01/02/2013');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `bulletin`
--
ALTER TABLE `bulletin`
  ADD CONSTRAINT `bulletin_ibfk_1` FOREIGN KEY (`ideleve`) REFERENCES `eleve` (`id`),
  ADD CONSTRAINT `bulletin_ibfk_2` FOREIGN KEY (`idmatiere`) REFERENCES `matiere` (`id`),
  ADD CONSTRAINT `bulletin_ibfk_3` FOREIGN KEY (`trimestre`) REFERENCES `trimestre` (`id`);

--
-- Contraintes pour la table `bulletinmatiere`
--
ALTER TABLE `bulletinmatiere`
  ADD CONSTRAINT `bulletinmatiere_ibfk_1` FOREIGN KEY (`idbulletin`) REFERENCES `bulletin` (`id`),
  ADD CONSTRAINT `bulletinmatiere_ibfk_2` FOREIGN KEY (`matiere`) REFERENCES `matiere` (`id`);

--
-- Contraintes pour la table `eleve`
--
ALTER TABLE `eleve`
  ADD CONSTRAINT `eleve_ibfk_1` FOREIGN KEY (`classe`) REFERENCES `classe` (`id`);

--
-- Contraintes pour la table `matiere`
--
ALTER TABLE `matiere`
  ADD CONSTRAINT `matiere_ibfk_1` FOREIGN KEY (`idclasse`) REFERENCES `classe` (`id`),
  ADD CONSTRAINT `matiere_ibfk_2` FOREIGN KEY (`idenseignement`) REFERENCES `enseignement` (`id`);

--
-- Contraintes pour la table `notes`
--
ALTER TABLE `notes`
  ADD CONSTRAINT `notes_ibfk_1` FOREIGN KEY (`idbulletinmatiere`) REFERENCES `bulletinmatiere` (`id`);

--
-- Contraintes pour la table `prof`
--
ALTER TABLE `prof`
  ADD CONSTRAINT `prof_ibfk_1` FOREIGN KEY (`idmatiere`) REFERENCES `enseignement` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
