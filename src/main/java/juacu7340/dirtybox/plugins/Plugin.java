package juacu7340.dirtybox.plugins;

import juacu7340.dirtybox.traits.PropertyChangeSupportable;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;
import java.util.Objects;

public abstract class Plugin extends PropertyChangeSupportable {
    public static String PROPERTY_TRANSFORM = "_transform_";

    public Plugin() {}

    // TODO: Think this thru, currently only a hotfix

    /**
     * Constructs a Plugin object and registers it in an
     * observable Plugin.
     *
     * @param observablePlugin An object of type {@code Plugin}.
     */
    public Plugin(Plugin observablePlugin) {
        Objects.requireNonNull(observablePlugin);

        this.registerPropertyChange(observablePlugin, Plugin.PROPERTY_TRANSFORM, evt -> {
            Object source = evt.getSource();

            if (source instanceof Plugin plugin) {
                byte[] data = plugin.getData();

                try {
                    transform(data);
                } catch (IOException ignored) {}
            }
        });
    }

    /**
     * Transforms the provided Protobuf data stream through a series of operations.
     * <p>
     * This method takes a {@code byte[]} containing a Protobuf object and applies
     * specific transformations to the data. The result is a new Protobuf object,
     * stored internally inside the Plugin.
     * Property {@code PROPERTY_TRANSFORM} will fire at function return.
     * </p>
     *
     * @param data A {@code byte[]} representing the original Protobuf object.
     *
     * @throws IOException If an error occurs during the transformation process.
     */
    public abstract void transform(byte[] data) throws IOException;

    public abstract byte[] getData();
}
