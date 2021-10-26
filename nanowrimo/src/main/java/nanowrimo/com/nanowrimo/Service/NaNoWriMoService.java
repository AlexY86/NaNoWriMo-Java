package nanowrimo.com.nanowrimo.Service;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import nanowrimo.com.nanowrimo.DTO.BooksDTO;

public interface NaNoWriMoService {

    

     JpaRepository<BooksDTO, Long> nanowrimoRepository = null;

     public static List<BooksDTO> getAllBooksDTO(){
         return nanowrimoRepository.findAll();
     }
}