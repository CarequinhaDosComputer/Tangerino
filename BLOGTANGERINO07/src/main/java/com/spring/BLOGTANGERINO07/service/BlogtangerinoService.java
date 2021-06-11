 package com.spring.BLOGTANGERINO07.service;

 import com.spring.BLOGTANGERINO07.model.Post;

 import java.util.List;

 public interface BlogtangerinoService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
