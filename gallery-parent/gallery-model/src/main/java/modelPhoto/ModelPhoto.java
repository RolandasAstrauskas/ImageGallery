package modelPhoto;

import javax.persistence.*;

@Entity
public class ModelPhoto {

    @Id
    @GeneratedValue
    private int id;
    private String photoName;
    private String dateOfStorage;

    @Lob
    private byte[] image;

    public ModelPhoto() {
    }


    public ModelPhoto(String photoName, String dateOfStorage, byte[] image) {
        this.photoName = photoName;
        this.dateOfStorage = dateOfStorage;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public String getDateOfStorage() {
        return dateOfStorage;
    }

    public void setDateOfStorage(String dateOfStorage) {
        this.dateOfStorage = dateOfStorage;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
