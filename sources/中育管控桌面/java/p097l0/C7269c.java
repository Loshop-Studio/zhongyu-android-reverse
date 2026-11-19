package p097l0;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p016b1.AbstractC4399a;
import p053f0.C6285d;
import p053f0.InterfaceC6282a;

/* renamed from: l0.c */
/* loaded from: classes3.dex */
public class C7269c implements InterfaceC6282a {
    @Override // p053f0.InterfaceC6282a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo6411a(ByteBuffer byteBuffer, File file, C6285d c6285d) throws Throwable {
        try {
            AbstractC4399a.m1410f(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
