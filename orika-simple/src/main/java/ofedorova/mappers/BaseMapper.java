package ofedorova.mappers;

import lombok.Getter;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

@Getter
public abstract class BaseMapper {

    public static final MapperFactory MAPPER_FACTORY = new DefaultMapperFactory.Builder().build();

}
