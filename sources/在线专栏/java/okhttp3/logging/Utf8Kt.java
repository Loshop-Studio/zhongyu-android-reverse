package okhttp3.logging;

import java.io.EOFException;
import kotlin.jvm.internal.C2769l;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import p014b3.C1037f;

/* loaded from: classes.dex */
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(@NotNull Buffer isProbablyUtf8) {
        C2769l.m9241e(isProbablyUtf8, "$this$isProbablyUtf8");
        try {
            Buffer buffer = new Buffer();
            isProbablyUtf8.copyTo(buffer, 0L, C1037f.m4824e(isProbablyUtf8.size(), 64L));
            for (int i4 = 0; i4 < 16; i4++) {
                if (buffer.exhausted()) {
                    return true;
                }
                int utf8CodePoint = buffer.readUtf8CodePoint();
                if (Character.isISOControl(utf8CodePoint) && !Character.isWhitespace(utf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
