package okhttp3;

import java.io.File;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5830k;
import okio.BufferedSink;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: okhttp3.g0 */
/* loaded from: classes4.dex */
public abstract class AbstractC6297g0 {

    @NotNull
    public static final C6295f0 Companion = new C6295f0();

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final AbstractC6297g0 create(@NotNull String str, @Nullable C6333u c6333u) {
        Companion.getClass();
        return C6295f0.m5890a(str, c6333u);
    }

    public abstract long contentLength();

    public abstract C6333u contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink bufferedSink);

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @JvmStatic
    @NotNull
    public static final AbstractC6297g0 create(@Nullable C6333u c6333u, @NotNull File file) {
        Companion.getClass();
        AbstractC5830k.m5330g(file, "file");
        return new C6291d0(c6333u, file, 0);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @NotNull
    public static final AbstractC6297g0 create(@Nullable C6333u c6333u, @NotNull String content) {
        Companion.getClass();
        AbstractC5830k.m5330g(content, "content");
        return C6295f0.m5890a(content, c6333u);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @NotNull
    public static final AbstractC6297g0 create(@Nullable C6333u c6333u, @NotNull ByteString content) {
        Companion.getClass();
        AbstractC5830k.m5330g(content, "content");
        return new C6291d0(c6333u, content, 1);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public static final AbstractC6297g0 create(@Nullable C6333u c6333u, @NotNull byte[] content) {
        Companion.getClass();
        AbstractC5830k.m5330g(content, "content");
        return C6295f0.m5891b(c6333u, content, 0, content.length);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public static final AbstractC6297g0 create(@Nullable C6333u c6333u, @NotNull byte[] content, int i) {
        Companion.getClass();
        AbstractC5830k.m5330g(content, "content");
        return C6295f0.m5891b(c6333u, content, i, content.length);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final AbstractC6297g0 create(@NotNull byte[] bArr) {
        C6295f0 c6295f0 = Companion;
        c6295f0.getClass();
        AbstractC5830k.m5330g(bArr, "<this>");
        return C6295f0.m5892c(c6295f0, bArr, null, 0, 7);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final AbstractC6297g0 create(@NotNull byte[] bArr, @Nullable C6333u c6333u) {
        C6295f0 c6295f0 = Companion;
        c6295f0.getClass();
        AbstractC5830k.m5330g(bArr, "<this>");
        return C6295f0.m5892c(c6295f0, bArr, c6333u, 0, 6);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final AbstractC6297g0 create(@NotNull byte[] bArr, @Nullable C6333u c6333u, int i) {
        C6295f0 c6295f0 = Companion;
        c6295f0.getClass();
        AbstractC5830k.m5330g(bArr, "<this>");
        return C6295f0.m5892c(c6295f0, bArr, c6333u, i, 4);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final AbstractC6297g0 create(@NotNull byte[] bArr, @Nullable C6333u c6333u, int i, int i8) {
        Companion.getClass();
        return C6295f0.m5891b(c6333u, bArr, i, i8);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final AbstractC6297g0 create(@NotNull ByteString byteString, @Nullable C6333u c6333u) {
        Companion.getClass();
        AbstractC5830k.m5330g(byteString, "<this>");
        return new C6291d0(c6333u, byteString, 1);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final AbstractC6297g0 create(@NotNull File file, @Nullable C6333u c6333u) {
        Companion.getClass();
        AbstractC5830k.m5330g(file, "<this>");
        return new C6291d0(c6333u, file, 0);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public static final AbstractC6297g0 create(@Nullable C6333u c6333u, @NotNull byte[] content, int i, int i8) {
        Companion.getClass();
        AbstractC5830k.m5330g(content, "content");
        return C6295f0.m5891b(c6333u, content, i, i8);
    }
}
