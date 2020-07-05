package linkchecker.services.springdatajpa;

import linkchecker.dbal.models.Link;
import linkchecker.dbal.repositories.LinkRepository;
import linkchecker.services.LinkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Profile({"default", "springdatajpa"})
@Slf4j
public class LinkSDJpaService implements LinkService {

    private LinkRepository linkRepository;

    public LinkSDJpaService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @Override
    public List<Link> findAll() {
        List<Link> links = new ArrayList<>();

        linkRepository.findAll().forEach(links::add);

        return links;
    }

    @Override
    public Link findById(Long aLong) {
        return linkRepository.findById(aLong).orElse(null);
    }

    @Override
    public Link save(Link object) {
        return linkRepository.save(object);
    }

    @Override
    public void delete(Link object) {
        linkRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        linkRepository.deleteById(aLong);
    }
}
