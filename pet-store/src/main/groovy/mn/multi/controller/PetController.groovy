package mn.multi.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import mn.multi.domain.Cat
import mn.multi.exchange.Pet

@Controller("/pet")
class PetController {

    @Get("/")
    HttpResponse<Pet> get() {
        Pet pet = new Pet(kind: "cat", animal: new Cat(name: "Garfield", lives: 7))
        return HttpResponse.ok(pet)
    }

}
