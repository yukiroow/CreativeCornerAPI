# APP SPECIFICATIONS

## This Repository
This repository contains the backend (REST) application that returns data from the MySQL database in JSON

## Creative Corner
Creative Corner is a platform where artists can sell their artworks to interested buyers.

## FUNCTIONAL REQUIREMENTS
* Users must be able to create an account of their type (Artist, Buyer)
* Users must be able to modify their credentials
* Users must be able to archive their accounts
* Artists must be able to upload artworks
* Artists may edit an artwork's price and description
* Artists must be able to see all their artworks
* Artists must be able to delete artworks
* Buyers must be able to buy an artwork
* Buyers must be able to view all the posted artworks
* Buyers can only pay using Maya

## LOGICAL SCHEMA
* USERS (userId, username, password, joinDate, uType, status)
* ARTISTS (artistId, penName, intro)
* BUYERS (buyerId, firstName, middleName, lastName)
* ARTWORKS (artworkId, name, medium, description, price, status, artist)
* TRANSACTIONS (buyerId, artworkId, datePurchased)


