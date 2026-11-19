package p228s0;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p117i1.AbstractC7642a;
import p162m0.C8539d;
import p162m0.InterfaceC8536a;

/* renamed from: s0.c */
/* loaded from: classes3.dex */
public class C9101c implements InterfaceC8536a {
    @Override // p162m0.InterfaceC8536a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo14048a(ByteBuffer byteBuffer, File file, C8539d c8539d) throws Throwable {
        try {
            AbstractC7642a.m12655f(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
