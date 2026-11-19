package p194o0;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p091e1.AbstractC7829a;
import p122h0.C8084d;
import p122h0.InterfaceC8081a;

/* renamed from: o0.c */
/* loaded from: classes3.dex */
public class C9136c implements InterfaceC8081a {
    @Override // p122h0.InterfaceC8081a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo12898a(ByteBuffer byteBuffer, File file, C8084d c8084d) throws Throwable {
        try {
            AbstractC7829a.m12229e(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
