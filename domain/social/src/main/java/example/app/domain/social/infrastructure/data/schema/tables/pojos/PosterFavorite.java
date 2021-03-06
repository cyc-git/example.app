/*
 * This file is generated by jOOQ.
 */
package example.app.domain.social.infrastructure.data.schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PosterFavorite implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long posterId;
    private Long articleId;
    private Long favoritedAt;

    public PosterFavorite() {}

    public PosterFavorite(PosterFavorite value) {
        this.posterId = value.posterId;
        this.articleId = value.articleId;
        this.favoritedAt = value.favoritedAt;
    }

    public PosterFavorite(
        Long posterId,
        Long articleId,
        Long favoritedAt
    ) {
        this.posterId = posterId;
        this.articleId = articleId;
        this.favoritedAt = favoritedAt;
    }

    /**
     * Getter for <code>test.poster_favorite.poster_id</code>. the poster id
     */
    public Long getPosterId() {
        return this.posterId;
    }

    /**
     * Setter for <code>test.poster_favorite.poster_id</code>. the poster id
     */
    public void setPosterId(Long posterId) {
        this.posterId = posterId;
    }

    /**
     * Getter for <code>test.poster_favorite.article_id</code>. the favorited article id
     */
    public Long getArticleId() {
        return this.articleId;
    }

    /**
     * Setter for <code>test.poster_favorite.article_id</code>. the favorited article id
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    /**
     * Getter for <code>test.poster_favorite.favorited_at</code>. the favorited time
     */
    public Long getFavoritedAt() {
        return this.favoritedAt;
    }

    /**
     * Setter for <code>test.poster_favorite.favorited_at</code>. the favorited time
     */
    public void setFavoritedAt(Long favoritedAt) {
        this.favoritedAt = favoritedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PosterFavorite (");

        sb.append(posterId);
        sb.append(", ").append(articleId);
        sb.append(", ").append(favoritedAt);

        sb.append(")");
        return sb.toString();
    }
}
