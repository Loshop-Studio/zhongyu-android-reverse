package p226r;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p116h0.AbstractC8697a;
import p160l.C9230d;
import p160l.InterfaceC9227a;

/* renamed from: r.c */
/* loaded from: classes3.dex */
public class C9877c implements InterfaceC9227a {
    @Override // p160l.InterfaceC9227a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo16931b(ByteBuffer byteBuffer, File file, C9230d c9230d) throws Throwable {
        try {
            AbstractC8697a.m14153f(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
