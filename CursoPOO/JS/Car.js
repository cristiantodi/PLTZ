class Car{
    constructor (license, driver){
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }

    prinDataCar(){
        console.log(this.driver)
        console.log(this.driver.name)
        console.log(this.driver.document)
    }
}