# Currency Exchange Springboot Application

This is a personal project to demonstrate the skills I have learned into a real-world working application.

### Technologies Used

* Java
* Springboot
* Thymeleaf
* Docker

### API - How to use

The API used for this project is [ExchangeRate-API](https://www.exchangerate-api.com/).

* Sign up for a free account and make a note of your API key.
* Create file 'application.properties' in 'src/main/resources'.
* Create entry 'API_KEY=YOUR_KEY_HERE' and replace 'YOUR_KEY_HERE' with your own API key.

Method 'getApiKey()' in class PropertiesLoader deals with retrieving the API key.

### Project Aims

The aim of the project is to create an application that provides a currency conversion
service, allowing the user to choose a From currency and To currency, and be provided with
the latest rates of that conversation.

The application will be Containerised using Docker, and that image can be pushed to AWS or 
other cloud-hosting providers.

### Project Goals

The goal of the project is to show my understanding of creating a working Springboot
RESTful application that interacts with an API, of understanding Thymeleaf, as well as
understanding Docker.