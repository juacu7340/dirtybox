package juacu7340.dirtybox.plugins;

import juacu7340.dirtybox.proto.SampleProto.Sample;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class DummyPlugin extends Plugin {
    public DummyPlugin() {}

    public DummyPlugin(Plugin observablePlugin) {
        super(observablePlugin);
    }

    @Override
    public void transform(byte[] data) throws IOException {
        Sample sample = Sample.parseFrom(data);

        System.out.println("Sample data: " + sample.getData());

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        sample.writeTo(outputStream);

        ByteArrayInputStream byteArrayInputStream =
                new ByteArrayInputStream(outputStream.toByteArray());

        // Store new data state
        this.data = outputStream.toByteArray();

        this.firePropertyChange(PROPERTY_TRANSFORM,
                byteArrayInputStream, byteArrayInputStream);
    }

    @Override
    public byte[] getData() {
        return this.data;
    }

    private byte[] data;
}
