package com.example.demo.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.ProductComment;




@Repository
public interface ProductCommentRepository  extends JpaRepository<ProductComment, Long>  {
    
	List<ProductComment> findAllByProduct_Id(Long productId);

    List<ProductComment> findAllByCommentDateBetweenAndProduct_Id(LocalDate commentDateStart, LocalDate commentDateEnd, Long productId);

    List<ProductComment> findAllByUser_Id(Long userId);

    List<ProductComment> findAllByCommentDateBetweenAndUser_Id(LocalDate commentDateStart, LocalDate commentDateEnd, Long userId);

}
