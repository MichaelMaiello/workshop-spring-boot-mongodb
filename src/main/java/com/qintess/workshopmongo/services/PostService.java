package com.qintess.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qintess.workshopmongo.domain.Post;
import com.qintess.workshopmongo.repositories.PostRepository;
import com.qintess.workshopmongo.services.excepiton.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	public PostRepository repository;
	
	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle(String text){
		return repository.findByTitleContainingIgnoreCase(text);
	}
}
