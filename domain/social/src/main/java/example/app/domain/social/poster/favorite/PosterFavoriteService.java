package example.app.domain.social.poster.favorite;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@Validated
@Service
public class PosterFavoriteService {
    private final PosterFavoriteRepository posterFavoriteRepository;

    @Cacheable(PosterFavoriteCacheName.MULTIPLE_BY_POSTER_ID)
    public List<IPosterFavoriteVo> findByPosterId(@NotNull Long posterId) {
        return Collections.unmodifiableList(posterFavoriteRepository.findByPosterId(posterId));
    }
}
