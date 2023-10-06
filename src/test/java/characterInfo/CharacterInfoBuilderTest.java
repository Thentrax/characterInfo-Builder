package characterInfo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterInfoBuilderTest {

    @Test
    void mustReturnExceptUserWithoutName() {
        try {
            CharacterInfoBuilder characterInfoBuilder = new CharacterInfoBuilder();
            CharacterInfo characterInfo = characterInfoBuilder
                    .setCharacterClass("Mago")
                    .setMaxHealth(12)
                    .setMaxMana(32)
                    .build();

            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Nome Inválido", exception.getMessage());
        }
    }

    @Test
    void mustReturnExceptInvalidCharacterClass() {
        try {
            CharacterInfoBuilder characterInfoBuilder = new CharacterInfoBuilder();
            CharacterInfo characterInfo = characterInfoBuilder
                    .setName("Thentrax")
                    .setMaxHealth(12)
                    .setMaxMana(32)
                    .build();

            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Classe de personagem inválida", exception.getMessage());
        }
    }

    @Test
    void mustReturnValidCharacterInfo() {
        CharacterInfoBuilder characterInfoBuilder = new CharacterInfoBuilder();
        CharacterInfo characterInfo = characterInfoBuilder
                .setName("Thentrax")
                .setCharacterClass("Mago")
                .setMaxHealth(12)
                .setMaxMana(32)
                .build();
        assertNotNull(characterInfo);
    }

}