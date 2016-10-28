package cz.muni.fi.pa165.machrent.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.security.Timestamp;
import java.util.Date;

/**
 * Created by Falka on 27. 10. 2016.
 */
public class Revision {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String note;
    private Timestamp revisionDate;
    private User mechanic;
    private Machine machine;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Timestamp getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(Timestamp revisionDate) {
        this.revisionDate = revisionDate;
    }

    public User getMechanic() {
        return mechanic;
    }

    public void setMechanic(User mechanic) {
        this.mechanic = mechanic;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Revision)) return false;

        Revision revision = (Revision) o;

        if (getRevisionDate() != null ? !getRevisionDate().equals(revision.getRevisionDate()) : revision.getRevisionDate() != null)
            return false;
        return getMachine() != null ? getMachine().equals(revision.getMachine()) : revision.getMachine() == null;

    }

    @Override
    public int hashCode() {
        int result = getRevisionDate() != null ? getRevisionDate().hashCode() : 0;
        result = 31 * result + (getMachine() != null ? getMachine().hashCode() : 0);
        return result;
    }
}

