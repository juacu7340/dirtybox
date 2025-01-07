package juacu7340.dirtybox.traits;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Objects;

public abstract class PropertyChangeSupportable {
    public PropertyChangeSupportable() {
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    /**
     * Adds a {@code PropertyChangeListener} to the listener list.
     * <p>
     * The listener is notified whenever a bound property is changed.
     * This method allows for observing and reacting to property changes
     * within the plugin.
     * </p>
     *
     * @param listener The {@code PropertyChangeListener} to be added. It must not be null.
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        Objects.requireNonNull(listener);

        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Adds a {@code PropertyChangeListener} for a specific property.
     * <p>
     * The listener is notified only when the specified property is changed.
     * This allows for more granular observation of property changes.
     * </p>
     *
     * @param property The name of the property to listen for. It must not be null.
     * @param listener The {@code PropertyChangeListener} to be added. It must not be null.
     */
    public void addPropertyChangeListener(String property, PropertyChangeListener listener) {
        Objects.requireNonNull(property);
        Objects.requireNonNull(listener);

        this.propertyChangeSupport.addPropertyChangeListener(property, listener);
    }

    /**
     * Removes a {@code PropertyChangeListener} from the listener list.
     * <p>
     * The listener is removed so it no longer receives notifications
     * of property changes.
     * </p>
     *
     * @param listener The {@code PropertyChangeListener} to be removed. It must not be null.
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        Objects.requireNonNull(listener);

        this.propertyChangeSupport.removePropertyChangeListener(listener);
    }

    /**
     * Removes a {@code PropertyChangeListener} for a specific property.
     * <p>
     * The listener is removed for the specified property, stopping notifications
     * for changes to that property.
     * </p>
     *
     * @param property The name of the property for which the listener should be removed. It must not be null.
     * @param listener The {@code PropertyChangeListener} to be removed. It must not be null.
     */
    public void removePropertyChangeListener(String property, PropertyChangeListener listener) {
        Objects.requireNonNull(property);
        Objects.requireNonNull(listener);

        this.propertyChangeSupport.removePropertyChangeListener(property,listener);
    }

    /**
     * Fires a {@code PropertyChangeEvent} to notify listeners of a bound property change.
     * <p>
     * This method triggers an event for all registered listeners, informing them that a specific
     * property has changed. The event contains the property name, old value, and new value.
     * This is useful for maintaining consistency across different components that observe the
     * plugin's state.
     * </p>
     *
     * @param event The name of the property that changed. It must not be null.
     * @param oldValue The old value of the property before the change.
     * @param newValue The new value of the property after the change.
     */
    public void firePropertyChange(String event, Object oldValue, Object newValue) {
        Objects.requireNonNull(event);

        this.propertyChangeSupport.firePropertyChange(event, oldValue, newValue);
    }

    /**
     * Registers a {@code PropertyChangeListener} to observe all property changes
     * of the specified {@code PropertyChangeSupportable} object.
     * <p>
     * This method simplifies the process of linking two observable components by
     * adding the provided listener to the target's list of listeners for all properties.
     * </p>
     *
     * @param propertyChangeSupportable The observable object to register the listener to. Must not be null.
     * @param listener                  The listener to be notified of property changes. Must not be null.
     */
    protected void registerPropertyChange(PropertyChangeSupportable propertyChangeSupportable, PropertyChangeListener listener) {
        Objects.requireNonNull(propertyChangeSupportable);
        Objects.requireNonNull(listener);

        propertyChangeSupportable.addPropertyChangeListener(listener);
    }

    /**
     * Registers a {@code PropertyChangeListener} for a specific property
     * of the specified {@code PropertyChangeSupportable} object.
     * <p>
     * This method links the listener to receive notifications only when the specified
     * property changes, allowing more fine-grained observation.
     * </p>
     *
     * @param propertyChangeSupportable The observable object to register the listener to. Must not be null.
     * @param property                  The name of the property to observe. Must not be null.
     * @param listener                  The listener to be notified of property changes. Must not be null.
     */
    protected void registerPropertyChange(PropertyChangeSupportable propertyChangeSupportable, String property, PropertyChangeListener listener) {
        Objects.requireNonNull(propertyChangeSupportable);
        Objects.requireNonNull(property);
        Objects.requireNonNull(listener);

        propertyChangeSupportable.addPropertyChangeListener(property, listener);
    }

    private final PropertyChangeSupport propertyChangeSupport;
}
