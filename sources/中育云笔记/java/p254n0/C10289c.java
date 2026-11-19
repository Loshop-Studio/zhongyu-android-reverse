package p254n0;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p109d1.AbstractC8900a;
import p168h0.C9438e;
import p168h0.InterfaceC9434a;

/* renamed from: n0.c */
/* loaded from: classes3.dex */
public class C10289c implements InterfaceC9434a {
    @Override // p168h0.InterfaceC9434a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo18616a(ByteBuffer byteBuffer, File file, C9438e c9438e) throws Throwable {
        try {
            AbstractC8900a.m17440f(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
