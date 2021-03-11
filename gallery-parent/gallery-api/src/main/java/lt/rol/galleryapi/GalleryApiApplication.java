package lt.rol.galleryapi;

import lt.rol.galleryapi.controller.ModelPhotoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"repository"})
@EntityScan(basePackages = {"modelPhoto"})
@ComponentScan(basePackages = {"repository", "modelPhoto", "modelService"},
		basePackageClasses = ModelPhotoController.class)
public class GalleryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalleryApiApplication.class, args);

	}





}
