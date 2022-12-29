class Animal:
    def __init__(self, name: str):
        self.name = name
    
    def get_name(self) -> str:
        pass

    def save(self, animal: Animal):
        pass

class Animal:
    def __init__(self, name: str):
        self.name = name
    
    def get_name(self) -> str:
        pass


class AnimalDB:
    def get_animal(self, id) -> Animal:
        pass

    def save(self, animal: Animal):
        pass
  
class Animal:
    def __init__(self, name: str):
        self.name = name
        self.db = AnimalDB()

    def get_name(self) -> str:
        return self.name

    def get(self, id):
        return self.db.get_animal(id)
    
    def save(self):
        self.db.save(animal=self)
