package okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* renamed from: okio.-DeprecatedOkio, reason: invalid class name */
/* loaded from: classes.dex */
public final class DeprecatedOkio {
    public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

    private DeprecatedOkio() {
    }

    @NotNull
    public final Sink appendingSink(@NotNull File file) {
        C2769l.m9241e(file, "file");
        return Okio.appendingSink(file);
    }

    @NotNull
    public final Sink blackhole() {
        return Okio.blackhole();
    }

    @NotNull
    public final BufferedSink buffer(@NotNull Sink sink) {
        C2769l.m9241e(sink, "sink");
        return Okio.buffer(sink);
    }

    @NotNull
    public final Sink sink(@NotNull File file) {
        C2769l.m9241e(file, "file");
        return Okio__JvmOkioKt.sink$default(file, false, 1, null);
    }

    @NotNull
    public final Source source(@NotNull File file) {
        C2769l.m9241e(file, "file");
        return Okio.source(file);
    }

    @NotNull
    public final BufferedSource buffer(@NotNull Source source) {
        C2769l.m9241e(source, "source");
        return Okio.buffer(source);
    }

    @NotNull
    public final Sink sink(@NotNull OutputStream outputStream) {
        C2769l.m9241e(outputStream, "outputStream");
        return Okio.sink(outputStream);
    }

    @NotNull
    public final Source source(@NotNull InputStream inputStream) {
        C2769l.m9241e(inputStream, "inputStream");
        return Okio.source(inputStream);
    }

    @NotNull
    public final Sink sink(@NotNull Path path, @NotNull OpenOption... options) {
        C2769l.m9241e(path, "path");
        C2769l.m9241e(options, "options");
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @NotNull
    public final Source source(@NotNull Path path, @NotNull OpenOption... options) {
        C2769l.m9241e(path, "path");
        C2769l.m9241e(options, "options");
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @NotNull
    public final Sink sink(@NotNull Socket socket) {
        C2769l.m9241e(socket, "socket");
        return Okio.sink(socket);
    }

    @NotNull
    public final Source source(@NotNull Socket socket) {
        C2769l.m9241e(socket, "socket");
        return Okio.source(socket);
    }
}
