package ru.xpendence.streamcast.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.xpendence.streamcast.controller.common.AbstractController;
import ru.xpendence.streamcast.domain.QUser;
import ru.xpendence.streamcast.domain.User;
import ru.xpendence.streamcast.dto.UserDto;
import ru.xpendence.streamcast.dto.mapper.EntityDtoMapper;
import ru.xpendence.streamcast.repository.UserRepository;
import ru.xpendence.streamcast.service.UserService;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 28.09.18
 * Time: 23:16
 * e-mail: 2262288@gmail.com
 */
@RestController
@RequestMapping("/user")
public class UserController extends AbstractController<User, UserDto, QUser,
        EntityDtoMapper<User, UserDto>, UserRepository, UserService> {

    public UserController(UserService service) {
        super(service);
    }
}
