package ru.xpendence.streamcast.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 11.09.18
 * Time: 9:29
 * e-mail: 2262288@gmail.com
 */
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class UserDto extends AbstractDto {

    private List<Long> authors;
    private List<Long> subscribers;
    private List<Long> topicsCreated;
    private List<Long> topicsSubscribed;

    @Builder
    public UserDto(Long id,
                   String errorMessage,
                   LocalDateTime created,
                   Integer active,
                   List<Long> authors,
                   List<Long> subscribers,
                   List<Long> topicsCreated,
                   List<Long> topicsSubscribed
    ) {
        super(id, errorMessage, created, active);
        this.authors = authors;
        this.subscribers = subscribers;
        this.topicsCreated = topicsCreated;
        this.topicsSubscribed = topicsSubscribed;
    }

    public List<Long> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Long> authors) {
        this.authors = authors;
    }

    public List<Long> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<Long> subscribers) {
        this.subscribers = subscribers;
    }

    public List<Long> getTopicsCreated() {
        return topicsCreated;
    }

    public void setTopicsCreated(List<Long> topicsCreated) {
        this.topicsCreated = topicsCreated;
    }

    public List<Long> getTopicsSubscribed() {
        return topicsSubscribed;
    }

    public void setTopicsSubscribed(List<Long> topicsSubscribed) {
        this.topicsSubscribed = topicsSubscribed;
    }
}





