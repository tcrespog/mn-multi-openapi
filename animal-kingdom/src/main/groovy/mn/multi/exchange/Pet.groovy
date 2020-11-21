package mn.multi.exchange;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import mn.multi.domain.Animal;
import mn.multi.domain.Cat;
import mn.multi.domain.Dog;

public class Pet {
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    private String kind;
    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "source")
    @JsonSubTypes([@JsonSubTypes.Type(value = Dog.class, name = "cat"), @JsonSubTypes.Type(value = Cat.class, name = "cat")])
    private Animal animal;
}
