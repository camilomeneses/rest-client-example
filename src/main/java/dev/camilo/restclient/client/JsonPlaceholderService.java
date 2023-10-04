package dev.camilo.restclient.client;

import dev.camilo.restclient.post.Post;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

import java.util.List;
// interface JsonPlaceholderService to proxy form 2
public interface JsonPlaceholderService {

  @GetExchange("/posts")
  List<Post> findAll();

  @GetExchange("/posts/{id}")
  Post findById(@PathVariable Integer id);

  // bloqued from jsonplaceholder
  @PostExchange("/posts")
  Post create(Post post);

  // bloqued from jsonplaceholder
  @PutExchange("/posts/{id}")
  Post update(@PathVariable Integer id, Post post);

  // bloqued from jsonplaceholder
  @DeleteMapping("/posts/{id}")
  void delete(@PathVariable Integer id);
}
