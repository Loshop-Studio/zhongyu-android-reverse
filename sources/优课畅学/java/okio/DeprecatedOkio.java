package okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.OpenOption;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;

@InterfaceC8721a
/* renamed from: okio.-DeprecatedOkio, reason: invalid class name */
/* loaded from: classes5.dex */
public final class DeprecatedOkio {
    public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

    private DeprecatedOkio() {
    }

    @InterfaceC8721a
    public final Sink appendingSink(File file) {
        AbstractC9133u.m16133g(file, "file");
        return Okio.appendingSink(file);
    }

    @InterfaceC8721a
    public final Sink blackhole() {
        return Okio.blackhole();
    }

    @InterfaceC8721a
    public final BufferedSink buffer(Sink sink) {
        AbstractC9133u.m16133g(sink, "sink");
        return Okio.buffer(sink);
    }

    @InterfaceC8721a
    public final Sink sink(File file) {
        AbstractC9133u.m16133g(file, "file");
        return Okio__JvmOkioKt.sink$default(file, false, 1, null);
    }

    @InterfaceC8721a
    public final Source source(File file) {
        AbstractC9133u.m16133g(file, "file");
        return Okio.source(file);
    }

    @InterfaceC8721a
    public final BufferedSource buffer(Source source) {
        AbstractC9133u.m16133g(source, "source");
        return Okio.buffer(source);
    }

    @InterfaceC8721a
    public final Sink sink(OutputStream outputStream) {
        AbstractC9133u.m16133g(outputStream, "outputStream");
        return Okio.sink(outputStream);
    }

    @InterfaceC8721a
    public final Source source(InputStream inputStream) {
        AbstractC9133u.m16133g(inputStream, "inputStream");
        return Okio.source(inputStream);
    }

    @InterfaceC8721a
    public final Sink sink(java.nio.file.Path path, OpenOption... options) {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(options, "options");
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @InterfaceC8721a
    public final Source source(java.nio.file.Path path, OpenOption... options) {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(options, "options");
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @InterfaceC8721a
    public final Sink sink(java.net.Socket socket) {
        AbstractC9133u.m16133g(socket, "socket");
        return Okio.sink(socket);
    }

    @InterfaceC8721a
    public final Source source(java.net.Socket socket) {
        AbstractC9133u.m16133g(socket, "socket");
        return Okio.source(socket);
    }
}
