package miniblog.data;

import miniblog.Contact;
import org.springframework.data.repository.CrudRepository;

public interface Repository
        extends CrudRepository<Contact, Long> {

}
