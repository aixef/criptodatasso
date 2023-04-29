<a name="readme-top">criptodatasso</a>


<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## About The Project
This project was created to solve the the integration between Salesforce Ind TransAmerica and Seismic.

This project was build in java using Spring Boot to generate a Docker image and using Fly.io as PAAS.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Built With

This section should list any major frameworks/libraries used to bootstrap your project. Leave any add-ons/plugins for the acknowledgements section. Here are a few examples.

* [![Java 17][JAVA-img]][JDK-url] JDK 17.0.7
* [![Spring Boot][Springboot-img]][Springboot-url] Spring boot 3.0.6
* [![Mavens][Maven-img]][Maven-url] Maven 3.9.1
* [![Docker][Docker-img]][Docker-url] Docker 20.10.24
* [![Fly.io][Fly.io]][fly-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- GETTING STARTED -->
## Getting Started

Before to start you need have installed the next programs
* Java JDK preferred 17.0.7 version
* Apache Mavens preferred version 3.9.1
* Docker desktop preferred version 20.10.24
* Visual Studio Code preferred version 1.77.3
* Postman preferred version 10.30


### Prerequisites

Before compile the project install the pingidentiy library.
### Installation

Open a terminal in the root path of the project and execute the next line to install the project dependency. 

mvn install:install-file -Dfile=<filepath >'-DgroupId=com.pingidentity' -DartifactId=opentoken-agent '-Dversion=2.7.1' -Dpackaging=jar -DgeneratePom=true

Replace the <filepath> by the path of the library jar.
Example: 
mvn install:install-file -Dfile=C:\Users\local\Downloads\opentoken\ping\opentoken-agent-2.7.1.jar

To compile the project when you make changes in the jab classes execute the next command line in the root of the project

mvn clean package

To generate the new docker image execute the next command line


docker build -t springservice .

This command will generate tart file in your local machine. 
To deploy the docker image to the fly.io server follow the next steps:



1. Get a free API Key at [https://example.com](https://example.com)
2. Clone the repo
   ```sh
   git clone https://github.com/your_username_/Project-Name.git
   ```
3. Install NPM packages
   ```sh
   npm install
   ```
4. Enter your API in `config.js`
   ```js
   const API_KEY = 'ENTER YOUR API';
   ```

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- USAGE EXAMPLES -->
## Usage

Use this space to show useful examples of how a project can be used. Additional screenshots, code examples and demos work well in this space. You may also link to more resources.

_For more examples, please refer to the [Documentation](https://example.com)_

<p align="right">(<a href="#readme-top">back to top</a>)</p>


mvn install:install-file -Dfile=C:\Users\LALO\Downloads\opentoken\ping\opentoken-agent-2.7.1.jar '-DgroupId=com.pingidentity' -DartifactId=opentoken-agent '-Dversion=2.7.1' -Dpackaging=jar -DgeneratePom=true


mvn clean package

docker build -t springservice .


iwr https://fly.io/install.ps1 -useb | iex

fly auth login

fly launch

[JDK-url]: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
[JAVA-img]:https://avatars.githubusercontent.com/u/41768318?s=200&v=4
[Maven-url]: https://maven.apache.org/download.cgi
[Maven-img]: https://avatars.githubusercontent.com/u/47359?s=200&v=4
[Docker-img]: https://avatars.githubusercontent.com/u/5429470?s=200&v=4
[Docker-url]: https://www.docker.com/products/docker-desktop/
[Springboot-url]: https://code.visualstudio.com/docs/java/java-spring-boot
[Springboot-img]: https://avatars.githubusercontent.com/u/317776?s=200&v=4
[fly-url]: https://fly.io/