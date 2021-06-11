package com.spring.BLOGTANGERINO07.utils;

import com.spring.BLOGTANGERINO07.model.Post;
import com.spring.BLOGTANGERINO07.repository.TangerinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Component
public class PopulaValor {
    @Autowired
    TangerinoRepository tangerinoRepository;

   // @PostConstruct
    public void savePosts(){
        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("João Pedro");
        post1.setData(LocalDate.now());
        post1.setTitulo("O Naruto pode ser um pouco duro as vezes");
        post1.setTexto("O Naruto pode ser um pouco duro às vezes Talvez você não saiba disso Mas o Naruto também Cresceu sem pai, Na verdade, ele nunca conheceu nenhum de seus pais e nunca teve nenhum amigo em nossa aldeia Mesmo assim, eu nunca vi ele chorar Ficar zangado ou se dar por vencido Ele está sempre disposto a melhorar Ele quer ser respeitado, é o sonho dele  e o Naruto daria a vida por isso sem hesitar. Meu palpite é que ele se cansou de chorar E decidiu fazer alguma coisa a respeito");

        postList.add(post1);
        for (Post post: postList){
            Post postSaved = tangerinoRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }






}
