# GEN Labo Monopoly
Auteure: Tiffany Bonzon



## Utilisation des annotations

### `@ParameterizedTest`

- MonopolyGameTests : Pour tester le constructeur avec un different nombre de joueurs correcte ou non

### `@RepeatedTest`

- CupTests : Pour répéter 1000 fois le test de vérification de la valeur obtenue
- DieTests : Pour répéter 1000 fois le test de vérification de la valeur obtenue
- PlayerTests : Pour répéter 100 fois le `takeTurn()` du joueur afin de s'assurer qu'il se déplace à chaque tour

### `@BeforeEach`

- BoardTests : Pour réinitialiser le board avant chaque test
- PieceTests : Pour réinitialiser le board avant chaque test
- PlayerTests : Pour réinitialiser le board avant chaque test

## Assertions différentes

- assertEquals
- assertTrue / assertFalse
- assertThrows
- assertNotNull
- fail
- assertSame
