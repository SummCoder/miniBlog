package miniblog;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ContactList{
    public ArrayList<Contact> arrayList = new ArrayList<>();

    public void save(Contact contact){
        this.arrayList.add(contact);
    }
}
