package my.event.service.base;

import my.event.commons.commonUtils.converter.SuperConverter;

import java.util.function.Function;

/**
 * Created by simon.calabrese on 29/08/2017.
 */
public class BaseService {

    protected <S,D> D convert(final S source, Function<S,D> conversion) {
        return SuperConverter.convert(source,conversion);
    }
}
