package ru.xpendence.streamcast.domain;

import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.RandomStringUtils;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.09.2018
 * Time: 15:38
 * e-mail: 2262288@gmail.com
 */
@Entity
@Table(name = "topics")
@SQLDelete(sql = "UPDATE topics SET active = 0 WHERE id = ?")
@Where(clause = "active = 1")
@Setter
@NoArgsConstructor
public class Topic extends AbstractEntity {

    private User author;
    private List<User> subscribers;
    private List<Message> messages;
    private String topic;
    private String hashcode;

    public Topic(User author, String topic) {
        this.author = author;
        this.topic = topic;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "author")
    public User getAuthor() {
        return author;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "subscribers_topics",
            joinColumns = @JoinColumn(name = "subscriber_id"),
            inverseJoinColumns = @JoinColumn(name = "topic_id")
    )
    public List<User> getSubscribers() {
        return subscribers;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "topic")
    public List<Message> getMessages() {
        return messages;
    }

    @Column(name = "topic")
    public String getTopic() {
        return topic;
    }

    // FIXME: 16.11.18 решить проблему с уникальностью
    @Column(name = "hashcode", unique = true)
    public String getHashcode() {
        return hashcode;
    }

    @PrePersist
    private void setup() {
        if (Objects.isNull(hashcode)) {
            this.setHashcode(RandomStringUtils.randomAlphanumeric(16));
        }
    }
}
