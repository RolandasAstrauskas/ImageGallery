package modelService;


import modelPhoto.ModelPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import repository.ModelPhotoRepository;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Service
public class ModelPhotoService implements ServiceInterface {


    @Autowired
    private final ModelPhotoRepository modelPhotoRepository;

    public ModelPhotoService(ModelPhotoRepository modelPhotoRepository) {
        this.modelPhotoRepository = modelPhotoRepository;
    }

    @Override
    public ModelPhoto findById(int id) {
        return modelPhotoRepository.findById(id);
    }

    @Override
    public List<ModelPhoto> findAll() {
       return modelPhotoRepository.findAll();
    }

    @Override
    public void deletebyId(int id) {
        modelPhotoRepository.deleteById(id);
    }

    @Override
    public void saveImage(String photoName, MultipartFile image) throws IOException {
        ModelPhoto modelPhotoToSave = new ModelPhoto(photoName, saveDate(), imageToByteArray(image));
        modelPhotoRepository.save(modelPhotoToSave);
    }

    private String saveDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return formatter.format(date);
    }

    private byte[] imageToByteArray(MultipartFile image) throws IOException {

        return image.getBytes();
    }
}
