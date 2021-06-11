package com.spring.BLOGTANGERINO07.service.impl;

import com.spring.BLOGTANGERINO07.model.Post;
import com.spring.BLOGTANGERINO07.repository.TangerinoRepository;
import com.spring.BLOGTANGERINO07.service.BlogtangerinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //steriotype do spring framework
public class Blogtangerinoimpl implements BlogtangerinoService {

    @Autowired //Ponto de injeção com o Repository
    TangerinoRepository tangerinoRepository;
    @Override
    public List<Post> findAll()  {
        /* Retorna a lista de Posts */
        return tangerinoRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return tangerinoRepository.findById(id).get();//.get retorna um post
    }

    @Override
    public Post save(Post post) {
        return tangerinoRepository.save(post);
    }
}
