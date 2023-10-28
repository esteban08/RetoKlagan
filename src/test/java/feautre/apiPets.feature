Feature: Api pets get post update delete

  Background:
    * def creds = { username: 'admin', password: 'admin' }
    * header Authorization = call read('classpath:basic-auth.js') creds
    * def createUser = read('../data/CreateUser.json')
    * configure charset = null



  Scenario: Post user
    Given url karate.get('baseUrl') + "user"
    And request createUser
    When method POST
    Then status 200

  Scenario: Get DataUser
    Given url karate.get('baseUrl') + "user/Esteban23"
    When method GET
    Then status 200

  Scenario: pets ByStatus
    Given url karate.get('baseUrl') + "pet/findByStatus?status=sold&id&name"
    When method GET
    Then status 200