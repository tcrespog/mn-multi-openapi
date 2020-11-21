package multi.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import mn.multi.domain.Cat;
import mn.multi.exchange.Pet;

@Controller("/pet")
public class PetController {

    @Get("/")
    public HttpResponse<Pet> get() {
        Pet pet = new Pet();
        pet.setKind("cat");

        Cat cat = new Cat();
        cat.setName("Garfield");
        cat.setLives(7);

        pet.setAnimal(cat);
        return HttpResponse.ok(pet);
    }

}
