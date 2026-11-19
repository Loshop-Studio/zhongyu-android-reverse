package androidx.core.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p310qd.C10792c;

/* loaded from: classes2.dex */
public final class AtomicFileKt {
    public static final byte[] readBytes(android.util.AtomicFile atomicFile) {
        return atomicFile.readFully();
    }

    public static final String readText(android.util.AtomicFile atomicFile, Charset charset) {
        return new String(atomicFile.readFully(), charset);
    }

    public static /* synthetic */ String readText$default(android.util.AtomicFile atomicFile, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C10792c.f26019b;
        }
        return readText(atomicFile, charset);
    }

    public static final void tryWrite(android.util.AtomicFile atomicFile, InterfaceC9540l interfaceC9540l) throws IOException {
        FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
        try {
            interfaceC9540l.invoke(fileOutputStreamStartWrite);
            AbstractC9977s.m20286b(1);
            atomicFile.finishWrite(fileOutputStreamStartWrite);
            AbstractC9977s.m20285a(1);
        } catch (Throwable th) {
            AbstractC9977s.m20286b(1);
            atomicFile.failWrite(fileOutputStreamStartWrite);
            AbstractC9977s.m20285a(1);
            throw th;
        }
    }

    public static final void writeBytes(android.util.AtomicFile atomicFile, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
        try {
            fileOutputStreamStartWrite.write(bArr);
            atomicFile.finishWrite(fileOutputStreamStartWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(fileOutputStreamStartWrite);
            throw th;
        }
    }

    public static final void writeText(android.util.AtomicFile atomicFile, String str, Charset charset) throws IOException {
        byte[] bytes = str.getBytes(charset);
        AbstractC9979u.m20293f(bytes, "this as java.lang.String).getBytes(charset)");
        writeBytes(atomicFile, bytes);
    }

    public static /* synthetic */ void writeText$default(android.util.AtomicFile atomicFile, String str, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = C10792c.f26019b;
        }
        writeText(atomicFile, str, charset);
    }
}
