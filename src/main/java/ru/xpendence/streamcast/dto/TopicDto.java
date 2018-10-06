package ru.xpendence.streamcast.dto;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 28.09.18
 * Time: 22:09
 * e-mail: 2262288@gmail.com
 */
@ToString
@EqualsAndHashCode(callSuper = false)
public class TopicDto extends AbstractDto {

    private Long author;
    private List<Long> subscribers;
    private List<Long> messages;

    @Builder
    public TopicDto(Long id,
                    String errorMessage,
                    LocalDateTime created,
                    Long active,
                    Long author,
                    List<Long> subscribers,
                    List<Long> messages) {
        super(id, errorMessage, created, active);
        this.author = author;
        this.subscribers = subscribers;
        this.messages = messages;
    }

    public Long getAuthor() {
        return author;
    }

    public void setAuthor(Long author) {
        this.author = author;
    }

    public List<Long> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<Long> subscribers) {
        this.subscribers = subscribers;
    }

    public List<Long> getMessages() {
        return messages;
    }

    public void setMessages(List<Long> messages) {
        this.messages = messages;
    }
}
