# Activité Pratique N°2 – ORM JPA
#Mapping des Associations

## Objectif

Ce projet a pour but d’illustrer le **mapping des associations** entre les entités dans une application Spring Boot à l'aide de JPA (Java Persistence API).

## Entités principales

- **Patient**
- **Médecin**
- **RendezVous**

## Associations modélisées

- 🔗 Un **Patient** peut avoir plusieurs **rendez-vous**  
  (Relation : *OneToMany*)

- 🔗 Un **Médecin** peut avoir plusieurs **rendez-vous**  
  (Relation : *OneToMany*)

- 🔗 Un **RendezVous** est lié à un seul **Patient** et un seul **Médecin**  
  (Relation : *ManyToOne*)

## Fonctionnalités

- Créer et consulter des **patients**
- Créer et consulter des **médecins**
- Planifier un **rendez-vous** entre un patient et un médecin
- Lister tous les **rendez-vous**
- Rechercher les rendez-vous d’un patient ou d’un médecin

## Technologies utilisées

- Spring Boot
- Spring Data JPA
- Base de données H2
