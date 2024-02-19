package miniblog;

import org.springframework.stereotype.Service;

@Service
public class ContactRepositoryImpl implements ContactRepository{

    @Override
    public void save(Contact contact) {
        arrayList.add(contact);
    }

}
