Feature: Ingresar al dashboard de banca virtual

  @Login
  Scenario: Logeo exitoso con un usuario de banco de bogota
    Given Ingresa a la pagina web
    When Ingresa sus credenciales de acceso:
      | username | 2006699 |
      | password | 1234    |
    Then El usuario debera ver "Tus productos"



