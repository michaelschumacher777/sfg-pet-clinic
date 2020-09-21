package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {
    private PetType petTYpe;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetTYpe() {
        return petTYpe;
    }

    public void setPetTYpe(PetType petTYpe) {
        this.petTYpe = petTYpe;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
