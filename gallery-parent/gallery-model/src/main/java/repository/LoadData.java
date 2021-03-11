package repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


//Class for testing
@Component
public class LoadData implements CommandLineRunner {

    @Autowired
    private final ModelPhotoRepository modelPhotoRepository;

    public LoadData(ModelPhotoRepository modelPhotoRepository) {
        this.modelPhotoRepository = modelPhotoRepository;
    }

    @Override
    public void run(String... args) throws Exception {

//        BufferedImage bImage = ImageIO.read(new File());
//        ByteArrayOutputStream bos = new ByteArrayOutputStream();
//        ImageIO.write(bImage, "jpg", bos );
//        byte [] data = bos.toByteArray();
//            System.out.println("Loaded");
//        modelPhotoRepository.save( new ModelPhoto("test", "test", data));
//
//        BufferedImage bImage2 = ImageIO.read(new File());
//        ByteArrayOutputStream bos2 = new ByteArrayOutputStream();
//        ImageIO.write(bImage2, "jpg", bos2 );
//        byte [] data2 = bos2.toByteArray();
//        System.out.println("Loaded2");
//        modelPhotoRepository.save( new ModelPhoto("test2", "test2", data2));


    }



}
