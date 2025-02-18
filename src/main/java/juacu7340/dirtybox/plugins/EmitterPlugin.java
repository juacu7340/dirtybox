package juacu7340.dirtybox.plugins;

import java.io.IOException;

/**
 * Represents the start of the {@code Plugin} chain.
 */
public class EmitterPlugin extends Plugin {
    public EmitterPlugin() {}

    @Override
    public void transform(byte[] data) throws IOException {
           // NOOP
    }

    @Override
    public byte[] getData() {
        return this.data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    private byte[] data;
}
