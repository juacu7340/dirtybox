package juacu7340.dirtybox.plugins;

import java.io.IOException;

public class EmitterPlugin extends Plugin {
    public EmitterPlugin() {}

    @Override
    public void transform(byte[] data) throws IOException {
           // NOOP
    }

    @Override
    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    private byte[] data;
}
