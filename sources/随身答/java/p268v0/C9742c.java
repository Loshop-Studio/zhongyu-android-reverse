package p268v0;

import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
import java.io.IOException;
import p091e1.AbstractC7829a;
import p122h0.C8084d;
import p122h0.InterfaceC8086f;
import p152k0.InterfaceC8259j;

/* renamed from: v0.c */
/* loaded from: classes3.dex */
public class C9742c implements InterfaceC8086f {
    @Override // p122h0.InterfaceC8086f
    /* renamed from: b */
    public EncodeStrategy mo12911b(C8084d c8084d) {
        return EncodeStrategy.SOURCE;
    }

    @Override // p122h0.InterfaceC8081a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo12898a(InterfaceC8259j interfaceC8259j, File file, C8084d c8084d) throws Throwable {
        try {
            AbstractC7829a.m12229e(((GifDrawable) interfaceC8259j.get()).m3295c(), file);
            return true;
        } catch (IOException e10) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            return false;
        }
    }
}
