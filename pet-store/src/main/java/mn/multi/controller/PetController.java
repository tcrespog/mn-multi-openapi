package mn.multi.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import mn.multi.domain.Cat;
import mn.multi.exchange.Pet;
import mn.multi.repository.CatRepository;

import javax.inject.Inject;

@Controller("/pet")
public class PetController {

    @Inject
    CatRepository catRepository;

    @Get("/")
    public HttpResponse<Pet> get() {
        Pet pet = new Pet();
        pet.setKind("cat");

        Cat cat = new Cat();
        cat.setName("Garfield");
        cat.setLives(7);

        catRepository.save(cat);

        pet.setAnimal(cat);
        return HttpResponse.ok(pet);
    }

}
