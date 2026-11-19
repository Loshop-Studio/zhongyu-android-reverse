package okhttp3;

import androidx.collection.AbstractC0584a;
import androidx.collection.SieveCacheKt;
import coil3.network.AbstractC3315g;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5840a;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139p7.AbstractC6396c;

/* renamed from: okhttp3.m0 */
/* loaded from: classes4.dex */
public abstract class AbstractC6323m0 implements Closeable {

    @NotNull
    public static final C6321l0 Companion = new C6321l0();

    @Nullable
    private Reader reader;

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final AbstractC6323m0 create(@NotNull String str, @Nullable C6333u c6333u) {
        Companion.getClass();
        return C6321l0.m5947a(str, c6333u);
    }

    @NotNull
    public final InputStream byteStream() {
        return source().inputStream();
    }

    @NotNull
    public final ByteString byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > SieveCacheKt.NodeLinkMask) {
            throw new IOException(AbstractC0584a.m913n(jContentLength, "Cannot buffer entire body for content length: "));
        }
        BufferedSource bufferedSourceSource = source();
        try {
            ByteString byteString = bufferedSourceSource.readByteString();
            AbstractC3315g.m2237e(bufferedSourceSource, null);
            int size = byteString.size();
            if (jContentLength == -1 || jContentLength == size) {
                return byteString;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + size + ") disagree");
        } finally {
        }
    }

    @NotNull
    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > SieveCacheKt.NodeLinkMask) {
            throw new IOException(AbstractC0584a.m913n(jContentLength, "Cannot buffer entire body for content length: "));
        }
        BufferedSource bufferedSourceSource = source();
        try {
            byte[] byteArray = bufferedSourceSource.readByteArray();
            AbstractC3315g.m2237e(bufferedSourceSource, null);
            int length = byteArray.length;
            if (jContentLength == -1 || jContentLength == length) {
                return byteArray;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    @NotNull
    public final Reader charStream() {
        Charset charsetM5975a;
        Reader c6317j0 = this.reader;
        if (c6317j0 == null) {
            BufferedSource bufferedSourceSource = source();
            C6333u c6333uContentType = contentType();
            if (c6333uContentType == null || (charsetM5975a = c6333uContentType.m5975a(AbstractC5840a.f9235a)) == null) {
                charsetM5975a = AbstractC5840a.f9235a;
            }
            c6317j0 = new C6317j0(bufferedSourceSource, charsetM5975a);
            this.reader = c6317j0;
        }
        return c6317j0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC6396c.m6043c(source());
    }

    public abstract long contentLength();

    public abstract C6333u contentType();

    public abstract BufferedSource source();

    @NotNull
    public final String string() throws IOException {
        Charset charsetM5975a;
        BufferedSource bufferedSourceSource = source();
        try {
            C6333u c6333uContentType = contentType();
            if (c6333uContentType == null || (charsetM5975a = c6333uContentType.m5975a(AbstractC5840a.f9235a)) == null) {
                charsetM5975a = AbstractC5840a.f9235a;
            }
            String string = bufferedSourceSource.readString(AbstractC6396c.m6057q(bufferedSourceSource, charsetM5975a));
            bufferedSourceSource.close();
            return string;
        } finally {
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @JvmStatic
    @NotNull
    public static final AbstractC6323m0 create(@Nullable C6333u c6333u, long j7, @NotNull BufferedSource content) {
        Companion.getClass();
        AbstractC5830k.m5330g(content, "content");
        return C6321l0.m5948b(c6333u, j7, content);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    @NotNull
    public static final AbstractC6323m0 create(@Nullable C6333u c6333u, @NotNull String content) {
        Companion.getClass();
        AbstractC5830k.m5330g(content, "content");
        return C6321l0.m5947a(content, c6333u);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    @NotNull
    public static final AbstractC6323m0 create(@Nullable C6333u c6333u, @NotNull ByteString content) {
        Companion.getClass();
        AbstractC5830k.m5330g(content, "content");
        return C6321l0.m5948b(c6333u, content.size(), new Buffer().write(content));
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    @NotNull
    public static final AbstractC6323m0 create(@Nullable C6333u c6333u, @NotNull byte[] content) {
        Companion.getClass();
        AbstractC5830k.m5330g(content, "content");
        return C6321l0.m5949c(content, c6333u);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final AbstractC6323m0 create(@NotNull BufferedSource bufferedSource, @Nullable C6333u c6333u, long j7) {
        Companion.getClass();
        return C6321l0.m5948b(c6333u, j7, bufferedSource);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final AbstractC6323m0 create(@NotNull byte[] bArr, @Nullable C6333u c6333u) {
        Companion.getClass();
        return C6321l0.m5949c(bArr, c6333u);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final AbstractC6323m0 create(@NotNull ByteString byteString, @Nullable C6333u c6333u) {
        Companion.getClass();
        AbstractC5830k.m5330g(byteString, "<this>");
        return C6321l0.m5948b(c6333u, byteString.size(), new Buffer().write(byteString));
    }
}
