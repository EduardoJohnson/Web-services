package com.example.project.mapper;


import com.example.project.domain.User;
import com.example.project.dto.UpdateUserRequestDto;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {




    private MapperFacade facade;
    private MapperFactory factory;




    public UserMapper() {

        factory = new DefaultMapperFactory.Builder().build();
        factory.classMap(User.class, UpdateUserRequestDto.class)
                .field("name", "name")
                .byDefault()
                .register();
        facade = factory.getMapperFacade();

    }


    public User dtoToEntity(UpdateUserRequestDto dto) {
        return facade.map(dto, User.class);
    }


    public UpdateUserRequestDto entityToDto(User entity) { return facade.map(entity, UpdateUserRequestDto.class);
    }


}

