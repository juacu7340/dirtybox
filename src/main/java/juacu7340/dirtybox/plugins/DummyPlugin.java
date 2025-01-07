package juacu7340.dirtybox.plugins;

import juacu7340.dirtybox.builders.ProtoInstanceBuilder;
import juacu7340.dirtybox.proto.SampleProto.Sample;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Optional;


public class DummyPlugin extends Plugin {
    public DummyPlugin() {}

    public DummyPlugin(Plugin observablePlugin) {
        super(observablePlugin);
    }

    @Override
    public void transform(byte[] data) throws IOException {
        ProtoInstanceBuilder builder = ProtoInstanceBuilder.getInstance();
        Optional<Sample> sampleOptional = builder.getObject(data, Sample.class);

        if (sampleOptional.isEmpty()) {
            return;
        }

        Sample sample = sampleOptional.get();

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

    @Override
    public void setData(byte[] data) {
        this.data = data;
    }

    private byte[] data;
}
