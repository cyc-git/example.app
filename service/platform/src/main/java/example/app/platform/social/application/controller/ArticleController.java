package example.app.platform.social.application.controller;

import example.app.common.web.dto.ResponseDto;
import example.app.platform.social.application.dto.input.CreateArticleDto;
import example.app.platform.social.application.dto.output.ArticleAggregateDto;
import example.app.platform.social.application.dto.output.ArticleDto;
import example.app.platform.social.application.facade.ArticleFacade;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Article", description = "the article api")
@RequiredArgsConstructor
@RestController
@RequestMapping("/article")
public class ArticleController {
    private final ArticleFacade articleFacade;

    @Operation(summary = "create an article")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseDto<ArticleDto> create(
            @RequestBody CreateArticleDto createArticleDto,
            @AuthenticationPrincipal Long currentPosterId
    ) {
        return ResponseDto.of(articleFacade.create(createArticleDto, currentPosterId));
    }

    @Operation(summary = "find an article")
    @GetMapping("{id}")
    public ResponseEntity<ResponseDto<ArticleAggregateDto>> find(@PathVariable Long id) {
        return ResponseEntity.of(articleFacade.findAggregate(id).map(ResponseDto::of));
    }
}
