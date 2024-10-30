import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Table;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Galeria {

    public static void main(String[] args) {
        // Criar EntityManagerFactory e EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GaleriaPU");
        EntityManager em = emf.createEntityManager();

        // Iniciar uma transação
        em.getTransaction().begin();

        // Criar e persistir uma nova obra de arte
        ObraDeArte obra1 = new ObraDeArte();
        obra1.setTitulo("Mona Lisa");
        obra1.setAutor("Leonardo da Vinci");
        obra1.setDataObra(new GregorianCalendar(1503, Calendar.JANUARY, 1));
        obra1.setTecnica("Óleo sobre madeira");
        obra1.setTipo("Pintura");
        obra1.setProcedencia("Museu do Louvre");
        obra1.setDimensoes("77 cm × 53 cm");
        em.persist(obra1);

        // Commit da transação
        em.getTransaction().commit();

        // Fechar o EntityManager e o EntityManagerFactory
        em.close();
        emf.close();
    }

    // Método auxiliar para converter String em Calendar
    private static Calendar parseData(String data) {
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            Calendar calendar = Calendar.getInstance();
             calendar.setTime(date);
            return calendar;
        } catch (ParseException ex) {
            throw new IllegalArgumentException(ex);
        }
    }
}