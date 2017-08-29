package my.event.commons.commonUtils.converter;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by simon.calabrese on 29/08/2017.
 */
public class SuperConverter {

    public static<S,D> D convert(final S source, final Function<S,D> conversion) {
        return conversion.apply(source);
    }

    public static<S,D>List<D> convert(final List<S> source,final Function<S,D> conversion) {
        return source.stream().map(conversion).collect(Collectors.toList());
    }
}
