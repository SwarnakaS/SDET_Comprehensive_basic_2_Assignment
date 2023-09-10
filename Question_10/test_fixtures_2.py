import pytest

@pytest.fixture
def employee_data(function):
    return{
            "first_name": "Denciya",
            "last_name" : "Ispampathy",
            "skill_set" : "Python",
            "email"     :"denci@25@gmail.com"       
    }
           
def test_first_name(employee_data):
    assert employee_data["first_name"] =="Denciya"          
    
def test_last_name(employee_data):
    assert employee_data["last_name"] =="Ispampathy"          

def test_skill_set(employee_data):
    assert employee_data["skill_set"] =="Python"          

def test_email(employee_data):
    assert employee_data["email"] =="denci@25@gmail.com"          
    
   
