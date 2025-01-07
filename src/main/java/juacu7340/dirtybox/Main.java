package juacu7340.dirtybox;

import juacu7340.dirtybox.plugins.DummyPlugin;
import juacu7340.dirtybox.plugins.EmitterPlugin;
import juacu7340.dirtybox.plugins.Plugin;
import juacu7340.dirtybox.proto.SampleProto.Sample;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // TODO: ProtoBuf to a binary file.
        // TODO: Take in ProtoBuf as argument.
        // TODO: Plugins to `.jar` file.
        // TODO: Take in Plugins as argument.
        // TODO: Add Logger support.

        Sample sample = Sample.newBuilder().setData("Testing Protobuf").build();

        try (FileOutputStream fileOutputStream = new FileOutputStream("sample.bin")) {
            sample.writeTo(fileOutputStream);
        }

        EmitterPlugin emitterPlugin = new EmitterPlugin();
        emitterPlugin.setData(sample.toByteArray());

        Plugin dummyPlugin = new DummyPlugin(emitterPlugin);

        emitterPlugin.firePropertyChange(Plugin.PROPERTY_TRANSFORM, null, null);
    }
}