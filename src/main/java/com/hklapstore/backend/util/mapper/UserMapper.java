package com.hklapstore.backend.util.mapper;

import com.hklapstore.backend.dto.UserDto;
import com.hklapstore.backend.entity.User;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto userDto);
}