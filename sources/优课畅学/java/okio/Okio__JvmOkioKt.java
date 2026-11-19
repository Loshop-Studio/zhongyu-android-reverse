package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.jvm.internal.AbstractC9133u;
import okio.internal.DefaultSocket;
import okio.internal.PipeSocket;
import okio.internal.ResourceFileSystem;
import okio.internal.SocketAsyncTimeout;

/* loaded from: classes5.dex */
final /* synthetic */ class Okio__JvmOkioKt {
    public static final Sink appendingSink(File file) {
        AbstractC9133u.m16133g(file, "<this>");
        return Okio.sink(new FileOutputStream(file, true));
    }

    public static final FileSystem asResourceFileSystem(ClassLoader classLoader) {
        AbstractC9133u.m16133g(classLoader, "<this>");
        return new ResourceFileSystem(classLoader, true, null, 4, null);
    }

    public static final CipherSink cipherSink(Sink sink, Cipher cipher) {
        AbstractC9133u.m16133g(sink, "<this>");
        AbstractC9133u.m16133g(cipher, "cipher");
        return new CipherSink(Okio.buffer(sink), cipher);
    }

    public static final CipherSource cipherSource(Source source, Cipher cipher) {
        AbstractC9133u.m16133g(source, "<this>");
        AbstractC9133u.m16133g(cipher, "cipher");
        return new CipherSource(Okio.buffer(source), cipher);
    }

    public static final HashingSink hashingSink(Sink sink, Mac mac) {
        AbstractC9133u.m16133g(sink, "<this>");
        AbstractC9133u.m16133g(mac, "mac");
        return new HashingSink(sink, mac);
    }

    public static final HashingSource hashingSource(Source source, Mac mac) {
        AbstractC9133u.m16133g(source, "<this>");
        AbstractC9133u.m16133g(mac, "mac");
        return new HashingSource(source, mac);
    }

    public static final Socket[] inMemorySocketPair(long j10) {
        Pipe pipe = new Pipe(j10);
        Pipe pipe2 = new Pipe(j10);
        return new Socket[]{new PipeSocket(pipe, pipe2), new PipeSocket(pipe2, pipe)};
    }

    public static final Sink sink(File file) {
        AbstractC9133u.m16133g(file, "<this>");
        return sink$default(file, false, 1, null);
    }

    public static /* synthetic */ Sink sink$default(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return Okio.sink(file, z10);
    }

    public static final Socket socket(java.net.Socket socket) {
        AbstractC9133u.m16133g(socket, "<this>");
        return new DefaultSocket(socket);
    }

    public static final Source source(InputStream inputStream) {
        AbstractC9133u.m16133g(inputStream, "<this>");
        return new InputStreamSource(inputStream, new Timeout());
    }

    public static final HashingSink hashingSink(Sink sink, MessageDigest digest) {
        AbstractC9133u.m16133g(sink, "<this>");
        AbstractC9133u.m16133g(digest, "digest");
        return new HashingSink(sink, digest);
    }

    public static final HashingSource hashingSource(Source source, MessageDigest digest) {
        AbstractC9133u.m16133g(source, "<this>");
        AbstractC9133u.m16133g(digest, "digest");
        return new HashingSource(source, digest);
    }

    public static final Sink sink(OutputStream outputStream) {
        AbstractC9133u.m16133g(outputStream, "<this>");
        return new OutputStreamSink(outputStream, new Timeout());
    }

    public static final Source source(java.net.Socket socket) throws IOException {
        AbstractC9133u.m16133g(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC9133u.m16132f(inputStream, "getInputStream(...)");
        return socketAsyncTimeout.source(new InputStreamSource(inputStream, socketAsyncTimeout));
    }

    public static final Sink sink(java.net.Socket socket) throws IOException {
        AbstractC9133u.m16133g(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC9133u.m16132f(outputStream, "getOutputStream(...)");
        return socketAsyncTimeout.sink(new OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    public static final Source source(File file) {
        AbstractC9133u.m16133g(file, "<this>");
        return new InputStreamSource(new FileInputStream(file), Timeout.NONE);
    }

    public static final Sink sink(File file, boolean z10) {
        AbstractC9133u.m16133g(file, "<this>");
        return Okio.sink(new FileOutputStream(file, z10));
    }

    public static final Source source(java.nio.file.Path path, OpenOption... options) throws IOException {
        AbstractC9133u.m16133g(path, "<this>");
        AbstractC9133u.m16133g(options, "options");
        InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        AbstractC9133u.m16132f(inputStreamNewInputStream, "newInputStream(...)");
        return Okio.source(inputStreamNewInputStream);
    }

    public static final Sink sink(java.nio.file.Path path, OpenOption... options) throws IOException {
        AbstractC9133u.m16133g(path, "<this>");
        AbstractC9133u.m16133g(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        AbstractC9133u.m16132f(outputStreamNewOutputStream, "newOutputStream(...)");
        return Okio.sink(outputStreamNewOutputStream);
    }
}
