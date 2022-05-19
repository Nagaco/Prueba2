import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest
{
    @Test
    void getName()
    {
        Persona p = new Persona("James");
        assertEquals("James", p.getName());
        assertEquals("John", p.getName());
    }
}