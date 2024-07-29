package giselletech.dio_java_spring_railway.controller;

import giselletech.dio_java_spring_railway.model.Link;
import giselletech.dio_java_spring_railway.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/links")
public class LinkController {

    @Autowired
    private LinkService linkService;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Link>> findById(@PathVariable Long id){
        Optional<Link> linkToFind = linkService.findById(id);
        return ResponseEntity.ok(linkToFind);
    }

    @GetMapping
    public ResponseEntity<List<Link>> findAllLinks(){
        List<Link> linksList = linkService.findAllLinks();
        return ResponseEntity.ok(linksList);
    }

    @PostMapping
    public ResponseEntity<Link> create(@RequestBody Link link){
        Link linkCreated = linkService.create(link);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("{/id}")
                .buildAndExpand(linkCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(linkCreated);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Link> update(@PathVariable Long id, @RequestBody Link link){
        Link linkUpdated = linkService.update(id, link);
        return ResponseEntity.ok().body(linkUpdated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        linkService.delete(id);
        return ResponseEntity.ok().build();
    }

}
