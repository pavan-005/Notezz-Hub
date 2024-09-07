package notezzhub.dto.user;

import notezzhub.dto.DtoConverter;
import notezzhub.data.user.User;

public interface UserDtoConverter extends DtoConverter<UserDto, User> {

    UserDto convertToDtoIgnoreNull(User entity);

    User convertToEntityIgnoreNull(UserDto dto);
}
