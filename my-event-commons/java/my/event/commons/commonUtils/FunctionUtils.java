package my.event.commons.commonUtils;

import my.event.commons.annotations.NodeAnnotation;
import my.event.commons.commonUtils.enums.CommandEnum;
import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by simon.calabrese on 28/08/2017.
 */
public class FunctionUtils {

    public static<T> String nodeElementToNeo4jQuery(final T elem, final CommandEnum commandEnum) {
        return commandEnum.getStandard().replace("<toReplace>",annotationToLabel(elem) + " " + attributesToStringDao(elem));
    }

    /**
     * Metodo che converte gli attributi di un oggetto in property labels di neo4j
     *
     * @param elem
     * @param <T>
     * @return
     */
    private static <T> String attributesToStringDao(T elem) {
        return "{" + Stream.of(elem.getClass().getDeclaredFields()).map(e -> {
            try {
                return Stream.of(e.getName(),
                        "\"" + valueToString(PropertyUtils.getProperty(elem, e.getName())) + "\"")
                        .collect(Collectors.joining(":"));
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e1) {
                //Do nothing
                return null;
            }
        }).collect(Collectors.joining(",")) + "}";
    }

    private static <T> String annotationToLabel(T elem) {
        final NodeAnnotation annotation = elem.getClass().getAnnotation(NodeAnnotation.class);
        return annotation.baseAlias() + ":" + annotation.labelReferences();

    }

    private static <T> String valueToString(T value) {
        return String.valueOf(value);
    }
}
