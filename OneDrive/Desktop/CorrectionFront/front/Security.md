**Questionnaire sur la sécurité applicative**


### 1-Que veut dire l'acronyme OWASP ?
* OWASP signifie Open Web Application Security Project


### 2-Qu'est ce qu'une CVE ?
* CVE signifie Common Vulnerabilities and Exposures


### 3-Que veut dire l'acronyme XSS ?
* XSS signifie Cross Site Scripting


### 4-Qu'est ce que la méthode DEVSECOPS ?
* La méthode DEVSECOPS est une méthode de développement qui permet de sécuriser les applications web

### 5-Donnez un exemple de faille de sécurité OWASP ?

* Injection : Il s'agit d'une vulnérabilité qui permet à un attaquant d'injecter du code malveillant dans une application en utilisant des entrées non vérifiées. Les injections SQL sont l'un des types les plus courants d'injection.

### 6-Donnez un exemple d'outils utilisé par les attaquants pour énumérer les services d'un serveur ?

* Telnet : C'est un protocole de communication utilisé pour se connecter à un service à distance. Les attaquants peuvent utiliser Telnet pour se connecter à des services tels que les serveurs FTP ou Telnet et énumérer les informations disponibles.

### 7-Décrivez la faille "Directory Traversal" ?

* Directory Tranversal est une vulnérabilité qui permet à un attaquant d'accéder à des fichiers et des répertoires qui ne sont pas destinés à être accessibles. Cela peut se produire lorsque les contrôles de sécurité sont insuffisants ou mal configurés, ce qui permet à l'attaquant de "traverser" les répertoires pour accéder à des fichiers sensibles ou d'exécuter des commandes malveillantes.


### 8-Donnez un exemple d'injecton SQL ?

* SELECT * FROM users WHERE username = 'admin' AND password = '' OR '1'='1'

### 9-Qu'est ce que l'élévation de privilèges ?

* L’élévation des privilèges est une technique utilisée pour accéder à des ressources ou à des fonctionnalités qui sont normalement restreintes ou protégées. Elle permet à un utilisateur ou à un programme d'acquérir des privilèges supplémentaires, tels que des droits d'administration ou des autorisations d'accès à des données sensibles.

### 10-Terminez cette phrase : "la sécurité doit être une responsabilité ..." de RedHat?


* La sécurité doit être une responsabilité partagée par tous



### 11-Quel est la version anglaise plus généralement adopté de cette définition : "Le durcisssement système" ?




### 12-Qu'est ce que le "Bug Bounty" ?

* Un programme de bug bounty est une initiative qui encourage les chercheurs en sécurité indépendants (aussi appelés "bountys hunters") à signaler les vulnérabilités de sécurité dans un système ou une application en récompensant ces personnes pour leur travail. Les entreprises et les organisations peuvent utiliser un programme de bug bounty pour identifier les vulnérabilités dans leur système qu'ils n'auraient pas pu trouver eux-mêmes. Les chercheurs en sécurité peuvent signaler les vulnérabilités trouvées en utilisant une plateforme en ligne ou en contactant directement l'entreprise. Les récompenses pour les rapports de vulnérabilités peuvent varier considérablement, allant de quelques centaines à plusieurs milliers de dollars.

### 13-Donnez un exemple de plateforme permettant de s'entrainer du côté attaquant ?

* VulnHub : une plateforme qui fournit des machines virtuelles vulnérables à utiliser pour les tests d'intrusion en toute sécurité.




### 14-Qu'elle est la couleur de l'équipe représentant les attaquant lors d'un pentest ou un audit de sécurité? 

* Rouge


### 15-Qu'elle faille de sécurité peut introduire ce code PHP ? 

* Injection SQL

```php	
$prod_id = $_GET["prod_id"];

$sql = "SELECT * FROM Products WHERE product_id = " . $prod_id;
```

### 16-Qu'elle est la loi française qui décrit les risques encourus pour piratage ?

* La loi française sur la sécurité informatique (loi n°2004-575 du 21 juin 2004) décrit les risques encourus pour le piratage informatique.



### 17-Qu'est ce que la CNIL ?

* La Commission nationale de l'informatique et des libertés (CNIL) est une autorité indépendante française créée en 1978. Elle a pour mission de protéger les droits et les libertés des personnes en matière de traitement de données à caractère personnel. La CNIL est chargée de veiller au respect de la loi "Informatique et Libertés" (loi n°78-17 du 6 janvier 1978) et de ses décrets d'application, ainsi qu'à la conformité des traitements de données à caractère personnel aux normes européennes en vigueur. Elle peut notamment donner des avis et des recommandations, mener des enquêtes et infliger des sanctions administratives en cas de non-respect de la réglementation.

### 18-Qu'est ce qu'un rançongiciel ou ransomware ?

* Un rançongiciel ou ransomware est un type de malware qui chiffre les fichiers de l'ordinateur infecté, rendant ainsi les données inaccessibles à l'utilisateur.


### 19-Donnez un exemple de scanner de vulnérabilité ?

* Le scanner de vulnérabilité « Nessus ». Il est développé et maintenu par Tenable, Inc. Il permet de détecter les vulnérabilités sur les systèmes et les réseaux informatiques. Il utilise des méthodes de balayage actif et passif pour rechercher les vulnérabilités et peut être utilisé pour évaluer les systèmes d'exploitation, les applications, les périphériques réseau et les bases de données.

### 20-Qu'est ce qu'un White Hat ?

* Un White Hat est un individu ou une entreprise qui pratique l'éthique de la sécurité informatique et utilise ses compétences pour protéger les systèmes et les réseaux contre les menaces informatiques.
Les White Hats utilisent des outils et des techniques similaires à ceux des pirates informatiques, mais à des fins éthiques et légales. Ils peuvent effectuer des tests d'intrusion, des évaluations de vulnérabilité et des audits de sécurité pour identifier les faiblesses dans les systèmes et les réseaux et les corriger avant qu'elles ne soient exploitées par des cybercriminels.


**Question Bonus :**

### Donnez votre définition de l'Open Source ?

* Il s'agit de code source rendu public donc tout le monde y a accès. L'open Source est fondé sur la collaboration et la participation de la communauté, qui peut contribuer au développement et à l'amélioration du logiciel.