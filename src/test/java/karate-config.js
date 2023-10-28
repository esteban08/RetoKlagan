function fn() {
    karate.configure('connectTimeout', 5000);
    karate.configure('readTimeout', 5000);

    var config ={
        baseUrl:"https://petstore.swagger.io/v2/",
        username:'admin',
        password:'admin'

    };
    return config;



}