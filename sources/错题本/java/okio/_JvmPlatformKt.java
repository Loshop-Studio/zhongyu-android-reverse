package okio;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5840a;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000T\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a<\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n*\u00060\u0006j\u0002`\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\r\u0010\u000e*\n\u0010\u0010\"\u00020\u000f2\u00020\u000f*\n\u0010\u0011\"\u00020\u00062\u00020\u0006*\n\u0010\u0013\"\u00020\u00122\u00020\u0012*\n\u0010\u0015\"\u00020\u00142\u00020\u0014*\n\u0010\u0017\"\u00020\u00162\u00020\u0016*\n\u0010\u0019\"\u00020\u00182\u00020\u0018*\n\u0010\u001b\"\u00020\u001a2\u00020\u001a*\n\u0010\u001d\"\u00020\u001c2\u00020\u001c*\n\u0010\u001f\"\u00020\u001e2\u00020\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, m5110d2 = {"", "", "toUtf8String", "([B)Ljava/lang/String;", "asUtf8ToByteArray", "(Ljava/lang/String;)[B", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", "newLock", "()Ljava/util/concurrent/locks/ReentrantLock;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "action", "withLock", "(Ljava/util/concurrent/locks/ReentrantLock;Lr6/a;)Ljava/lang/Object;", "Ljava/lang/ArrayIndexOutOfBoundsException;", "ArrayIndexOutOfBoundsException", "Lock", "Ljava/io/IOException;", "IOException", "Ljava/net/ProtocolException;", "ProtocolException", "Ljava/io/EOFException;", "EOFException", "Ljava/io/FileNotFoundException;", "FileNotFoundException", "Ljava/io/Closeable;", "Closeable", "Ljava/util/zip/Deflater;", "Deflater", "Ljava/util/zip/Inflater;", "Inflater", "okio"}, m5111k = 2, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class _JvmPlatformKt {
    @NotNull
    public static final byte[] asUtf8ToByteArray(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC5840a.f9235a);
        AbstractC5830k.m5329f(bytes, "getBytes(...)");
        return bytes;
    }

    @NotNull
    public static final ReentrantLock newLock() {
        return new ReentrantLock();
    }

    @NotNull
    public static final String toUtf8String(@NotNull byte[] bArr) {
        AbstractC5830k.m5330g(bArr, "<this>");
        return new String(bArr, AbstractC5840a.f9235a);
    }

    public static final <T> T withLock(@NotNull ReentrantLock reentrantLock, @NotNull InterfaceC6469a action) {
        AbstractC5830k.m5330g(reentrantLock, "<this>");
        AbstractC5830k.m5330g(action, "action");
        reentrantLock.lock();
        try {
            return (T) action.invoke();
        } finally {
            reentrantLock.unlock();
        }
    }
}
