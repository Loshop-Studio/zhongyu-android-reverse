package okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.OpenOption;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

@InterfaceC10770a
/* renamed from: okio.-DeprecatedOkio, reason: invalid class name */
/* loaded from: classes6.dex */
public final class DeprecatedOkio {
    public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

    private DeprecatedOkio() {
    }

    @InterfaceC10770a
    public final Sink appendingSink(File file) {
        AbstractC9979u.m20294g(file, "file");
        return Okio.appendingSink(file);
    }

    @InterfaceC10770a
    public final Sink blackhole() {
        return Okio.blackhole();
    }

    @InterfaceC10770a
    public final BufferedSink buffer(Sink sink) {
        AbstractC9979u.m20294g(sink, "sink");
        return Okio.buffer(sink);
    }

    @InterfaceC10770a
    public final Sink sink(File file) {
        AbstractC9979u.m20294g(file, "file");
        return Okio__JvmOkioKt.sink$default(file, false, 1, null);
    }

    @InterfaceC10770a
    public final Source source(File file) {
        AbstractC9979u.m20294g(file, "file");
        return Okio.source(file);
    }

    @InterfaceC10770a
    public final BufferedSource buffer(Source source) {
        AbstractC9979u.m20294g(source, "source");
        return Okio.buffer(source);
    }

    @InterfaceC10770a
    public final Sink sink(OutputStream outputStream) {
        AbstractC9979u.m20294g(outputStream, "outputStream");
        return Okio.sink(outputStream);
    }

    @InterfaceC10770a
    public final Source source(InputStream inputStream) {
        AbstractC9979u.m20294g(inputStream, "inputStream");
        return Okio.source(inputStream);
    }

    @InterfaceC10770a
    public final Sink sink(java.nio.file.Path path, OpenOption... options) {
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(options, "options");
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @InterfaceC10770a
    public final Source source(java.nio.file.Path path, OpenOption... options) {
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(options, "options");
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @InterfaceC10770a
    public final Sink sink(java.net.Socket socket) {
        AbstractC9979u.m20294g(socket, "socket");
        return Okio.sink(socket);
    }

    @InterfaceC10770a
    public final Source source(java.net.Socket socket) {
        AbstractC9979u.m20294g(socket, "socket");
        return Okio.source(socket);
    }
}
