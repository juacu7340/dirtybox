package juacu7340.dirtybox.plugins;

import java.io.IOException;

/**
 * Represents the end of the {@code Plugin} chain.
 */
public class ReceiverPlugin extends Plugin {
    @Override
    public void transform(byte[] data) throws IOException {

    }

    @Override
    public byte[] getData() {
        return new byte[0];
    }

    @Override
    public void setData(byte[] data) {
        // NOOP
    }
}
