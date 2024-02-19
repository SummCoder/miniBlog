package miniblog;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public interface ContactRepository {
    ArrayList<Contact> arrayList = new ArrayList<>();
//    List<Contact> findAll();

    void save(Contact contact);

//    void clear();
}
