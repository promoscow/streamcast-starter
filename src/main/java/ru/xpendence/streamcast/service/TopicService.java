package ru.xpendence.streamcast.service;

import org.springframework.stereotype.Service;
import ru.xpendence.streamcast.domain.QTopic;
import ru.xpendence.streamcast.domain.Topic;
import ru.xpendence.streamcast.dto.TopicDto;
import ru.xpendence.streamcast.dto.mapper.EntityDtoMapper;
import ru.xpendence.streamcast.repository.TopicRepository;
import ru.xpendence.streamcast.service.common.AbstractService;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 28.09.18
 * Time: 22:08
 * e-mail: 2262288@gmail.com
 */
@Service
public class TopicService extends AbstractService<Topic, TopicDto, QTopic,
        EntityDtoMapper<Topic, TopicDto>, TopicRepository> {

    public TopicService(TopicRepository repository, EntityDtoMapper<Topic, TopicDto> mapper) {
        super(repository, mapper);
    }
}