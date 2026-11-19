package okio;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import okio.internal.ResourceFileSystem;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0006\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\n\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\n\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u000e2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011¢\u0006\u0002\u0010\u0012\u001a#\u0010\u0003\u001a\u00020\u0004*\u00020\u000e2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011¢\u0006\u0002\u0010\u0013\u001a\u0012\u0010\u0014\u001a\u00020\u0015*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u0012\u0010\u0018\u001a\u00020\u0019*\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u0012\u0010\u001a\u001a\u00020\u001b*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d\u001a\u0012\u0010\u001e\u001a\u00020\u001f*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d\u001a\u0012\u0010\u001a\u001a\u00020\u001b*\u00020\u00012\u0006\u0010 \u001a\u00020!\u001a\u0012\u0010\u001e\u001a\u00020\u001f*\u00020\u00042\u0006\u0010 \u001a\u00020!\u001a\n\u0010\"\u001a\u00020#*\u00020$\"\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010%\u001a\u00020\f*\u00060&j\u0002`'8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010(¨\u0006)"}, m5110d2 = {"sink", "Lokio/Sink;", "Ljava/io/OutputStream;", "source", "Lokio/Source;", "Ljava/io/InputStream;", "Ljava/net/Socket;", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "Ljava/io/File;", RequestParameters.SUBRESOURCE_APPEND, "", "appendingSink", "Ljava/nio/file/Path;", "options", "", "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Sink;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Source;", "cipherSink", "Lokio/CipherSink;", "cipher", "Ljavax/crypto/Cipher;", "cipherSource", "Lokio/CipherSource;", "hashingSink", "Lokio/HashingSink;", "mac", "Ljavax/crypto/Mac;", "hashingSource", "Lokio/HashingSource;", "digest", "Ljava/security/MessageDigest;", "asResourceFileSystem", "Lokio/FileSystem;", "Ljava/lang/ClassLoader;", "isAndroidGetsocknameError", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "(Ljava/lang/AssertionError;)Z", "okio"}, m5111k = 5, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m5115xs = "okio/Okio")
/* loaded from: classes4.dex */
final /* synthetic */ class Okio__JvmOkioKt {
    private static final Logger logger = Logger.getLogger("okio.Okio");

    @NotNull
    public static final Sink appendingSink(@NotNull File file) throws FileNotFoundException {
        AbstractC5830k.m5330g(file, "<this>");
        return Okio.sink(new FileOutputStream(file, true));
    }

    @NotNull
    public static final FileSystem asResourceFileSystem(@NotNull ClassLoader classLoader) {
        AbstractC5830k.m5330g(classLoader, "<this>");
        return new ResourceFileSystem(classLoader, true, null, 4, null);
    }

    @NotNull
    public static final CipherSink cipherSink(@NotNull Sink sink, @NotNull Cipher cipher) {
        AbstractC5830k.m5330g(sink, "<this>");
        AbstractC5830k.m5330g(cipher, "cipher");
        return new CipherSink(Okio.buffer(sink), cipher);
    }

    @NotNull
    public static final CipherSource cipherSource(@NotNull Source source, @NotNull Cipher cipher) {
        AbstractC5830k.m5330g(source, "<this>");
        AbstractC5830k.m5330g(cipher, "cipher");
        return new CipherSource(Okio.buffer(source), cipher);
    }

    @NotNull
    public static final HashingSink hashingSink(@NotNull Sink sink, @NotNull Mac mac) {
        AbstractC5830k.m5330g(sink, "<this>");
        AbstractC5830k.m5330g(mac, "mac");
        return new HashingSink(sink, mac);
    }

    @NotNull
    public static final HashingSource hashingSource(@NotNull Source source, @NotNull Mac mac) {
        AbstractC5830k.m5330g(source, "<this>");
        AbstractC5830k.m5330g(mac, "mac");
        return new HashingSource(source, mac);
    }

    public static final boolean isAndroidGetsocknameError(@NotNull AssertionError assertionError) {
        AbstractC5830k.m5330g(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC5855p.m5372F(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    @JvmOverloads
    @NotNull
    public static final Sink sink(@NotNull File file) throws FileNotFoundException {
        AbstractC5830k.m5330g(file, "<this>");
        return sink$default(file, false, 1, null);
    }

    public static /* synthetic */ Sink sink$default(File file, boolean z8, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z8 = false;
        }
        return Okio.sink(file, z8);
    }

    @NotNull
    public static final Source source(@NotNull InputStream inputStream) {
        AbstractC5830k.m5330g(inputStream, "<this>");
        return new InputStreamSource(inputStream, new Timeout());
    }

    @NotNull
    public static final HashingSink hashingSink(@NotNull Sink sink, @NotNull MessageDigest digest) {
        AbstractC5830k.m5330g(sink, "<this>");
        AbstractC5830k.m5330g(digest, "digest");
        return new HashingSink(sink, digest);
    }

    @NotNull
    public static final HashingSource hashingSource(@NotNull Source source, @NotNull MessageDigest digest) {
        AbstractC5830k.m5330g(source, "<this>");
        AbstractC5830k.m5330g(digest, "digest");
        return new HashingSource(source, digest);
    }

    @NotNull
    public static final Sink sink(@NotNull OutputStream outputStream) {
        AbstractC5830k.m5330g(outputStream, "<this>");
        return new OutputStreamSink(outputStream, new Timeout());
    }

    @NotNull
    public static final Source source(@NotNull Socket socket) throws IOException {
        AbstractC5830k.m5330g(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC5830k.m5329f(inputStream, "getInputStream(...)");
        return socketAsyncTimeout.source(new InputStreamSource(inputStream, socketAsyncTimeout));
    }

    @NotNull
    public static final Sink sink(@NotNull Socket socket) throws IOException {
        AbstractC5830k.m5330g(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC5830k.m5329f(outputStream, "getOutputStream(...)");
        return socketAsyncTimeout.sink(new OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    @NotNull
    public static final Source source(@NotNull File file) throws FileNotFoundException {
        AbstractC5830k.m5330g(file, "<this>");
        return new InputStreamSource(new FileInputStream(file), Timeout.NONE);
    }

    @JvmOverloads
    @NotNull
    public static final Sink sink(@NotNull File file, boolean z8) throws FileNotFoundException {
        AbstractC5830k.m5330g(file, "<this>");
        return Okio.sink(new FileOutputStream(file, z8));
    }

    @NotNull
    public static final Source source(@NotNull java.nio.file.Path path, @NotNull OpenOption... options) throws IOException {
        AbstractC5830k.m5330g(path, "<this>");
        AbstractC5830k.m5330g(options, "options");
        InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        AbstractC5830k.m5329f(inputStreamNewInputStream, "newInputStream(...)");
        return Okio.source(inputStreamNewInputStream);
    }

    @NotNull
    public static final Sink sink(@NotNull java.nio.file.Path path, @NotNull OpenOption... options) throws IOException {
        AbstractC5830k.m5330g(path, "<this>");
        AbstractC5830k.m5330g(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        AbstractC5830k.m5329f(outputStreamNewOutputStream, "newOutputStream(...)");
        return Okio.sink(outputStreamNewOutputStream);
    }
}
