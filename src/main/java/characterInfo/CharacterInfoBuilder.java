package characterInfo;

public class CharacterInfoBuilder {
    private final CharacterInfo characterInfo;

    public CharacterInfoBuilder(){
        characterInfo = new CharacterInfo();
    }

    public CharacterInfo build(){
        if (characterInfo.getName() == null){
            throw new IllegalArgumentException("Nome Inválido");
        }
        if (characterInfo.getCharacterClass() == null ) {
            throw new IllegalArgumentException("Classe de personagem inválida");
        }
        return characterInfo;
    }

    public CharacterInfoBuilder setName(String name) {
        characterInfo.setName(name);
        return this;
    }

    public CharacterInfoBuilder setCharacterClass(String characterClass) {
        characterInfo.setCharacterClass(characterClass);
        return this;
    }

    public CharacterInfoBuilder setMaxHealth(int maxHealth) {
        characterInfo.setMaxHealth(maxHealth);
        return this;
    }
    public CharacterInfoBuilder setHealth(int health) {
        characterInfo.setHealth(health);
        return this;
    }

    public CharacterInfoBuilder setMaxMana(int maxMana) {
        characterInfo.setMaxMana(maxMana);
        return this;
    }

    public CharacterInfoBuilder setMana(int mana) {
        characterInfo.setMana(mana);
        return this;
    }
}
