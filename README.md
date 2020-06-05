# calculatriceJunit5
Les différences entre Junit 4 et Junit 5 sont les suivantes:
- l'anotation Before et After deviennent BeforeEach et AfterEach
- Les exceptions sont gérées par "Assertions.assertThrows" et non plus dons l'anotation
- Le temps d'exécution et géré par "Assertions.assertTimeout" et non plus dans l'anotation
- La desactivation d'une méthode de test est gérée par une nouvelle anotation "Disabled"
