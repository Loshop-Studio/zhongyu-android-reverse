package p110q;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p062g0.AbstractC3741a;
import p076j.C3794d;
import p076j.InterfaceC3791a;

/* renamed from: q.c */
/* loaded from: classes2.dex */
public class C4454c implements InterfaceC3791a {
    @Override // p076j.InterfaceC3791a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo4941a(ByteBuffer byteBuffer, File file, C3794d c3794d) throws Throwable {
        try {
            AbstractC3741a.m4741e(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
