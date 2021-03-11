package lt.rol.galleryapi.controller;

import modelPhoto.ModelPhoto;
import modelService.ModelPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ModelPhotoController{

    @Autowired
    private final ModelPhotoService modelPhotoService;

    public ModelPhotoController(ModelPhotoService modelPhotoService) {
        this.modelPhotoService = modelPhotoService;
    }

    @PostMapping("/save")
    public void saveImage(@RequestParam("photoName") String photoName, @RequestParam(value = "image") MultipartFile image) throws IOException {
        modelPhotoService.saveImage(photoName, image);
    }

    @GetMapping("find/{id}")
    public ModelPhoto findById(int id){
       return modelPhotoService.findById(id);
    }

    @GetMapping("/all")
    public List<ModelPhoto> findAll(){
        return modelPhotoService.findAll();
    }

    @DeleteMapping("/del/{id}")
    public void delById(int id){
        modelPhotoService.deletebyId(id);
    }
}
