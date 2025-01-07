package juacu7340.dirtybox.builders;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Optional;

/**
 * Singleton that allows building  ProtoBuf to object and
 * vice versa.
 */
public class ProtoInstanceBuilder {
    private static ProtoInstanceBuilder instance = null;

    public static ProtoInstanceBuilder getInstance() {
        if (instance == null) {
            instance = new ProtoInstanceBuilder();
        }

        return ProtoInstanceBuilder.instance;
    }

    private ProtoInstanceBuilder() {}

    public <T>Optional<T> getObject(byte[] data, Class<T> tClass) {
        try {
            Method method = tClass.getMethod("parseFrom", byte[].class);

            T object = tClass.cast(method.invoke(null, (Object) data));

            return Optional.of(object);
        } catch (Exception ignored) {
            return Optional.empty();
        }
    }
}
