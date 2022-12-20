from car import Car
from account import Account

if __name__=='__main__':
    print("------------------------------------------------------------------")
    
    car1=Car("AMS123", Account("ANDRES", "1234"))
    print(vars(car1))
    print(vars(car1.driver))
    
"""    
    car2=Car()
    car2.license="123ABC"
    car2.driver="Fernando"
    print(vars(car2))
"""