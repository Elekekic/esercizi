package elena.GestionePrenotazioni.Bean;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "utenti")
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String username;

    @Column(name = "nome_completo")
    private String nomeCompleto;

    private String email;

    @OneToMany(mappedBy = "utente")
    private List<Prenotazione> prenotazioni;
// un utente non può avere più prenotazioni di una
// postazione per una particolare data
}
