package modelService;


import modelPhoto.ModelPhoto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ServiceInterface {

    ModelPhoto findById(int id);
    List<ModelPhoto> findAll();
    void deletebyId(int id);
    void saveImage(String photoName, MultipartFile image) throws IOException;
}
