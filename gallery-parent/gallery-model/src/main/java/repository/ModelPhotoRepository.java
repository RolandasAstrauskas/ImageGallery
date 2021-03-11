package repository;

import modelPhoto.ModelPhoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelPhotoRepository extends JpaRepository<ModelPhoto, Integer> {

    ModelPhoto findById(int id);


}
