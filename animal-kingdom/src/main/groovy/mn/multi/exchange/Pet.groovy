package mn.multi.exchange

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import mn.multi.domain.Animal
import mn.multi.domain.Cat
import mn.multi.domain.Dog

class Pet {

    String kind

    @JsonTypeInfo( use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "kind")
    @JsonSubTypes([
            @JsonSubTypes.Type(value = Dog, name = "dog"),
            @JsonSubTypes.Type(value = Cat, name = "cat")
    ])
    Animal animal

}
