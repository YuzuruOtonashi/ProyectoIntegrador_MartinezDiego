package com.portfolio.mnnd.Interface;

import com.portfolio.mnnd.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer persona
    public List<Persona> getPersona();
    
    //Guardar un obj tipo persona
    
    public void savePersona(Persona Persona);
    
    //Eliminar un usuario
    
    public void deletePersona (Long id);
    
    //Buscar una persona
    
    public Persona findPersona(Long id);
}
