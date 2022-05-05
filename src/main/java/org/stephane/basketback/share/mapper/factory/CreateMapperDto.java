package org.stephane.basketback.share.mapper.factory;

public class CreateMapperDto<I, D> {
    public ServiceMapperDto<I, D> getMapper(TypeServiceMapperDto mapperType) {
        return getServiceMapperFactory().create(mapperType);
    }

    protected ServiceMapperFactoryDto<I, D> getServiceMapperFactory() {
        return new ServiceMapperFactoryDtoImpl<>();
    }
}
