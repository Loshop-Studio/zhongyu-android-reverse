package p146s0;

import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
import java.io.IOException;
import p016b1.AbstractC4399a;
import p053f0.C6285d;
import p053f0.InterfaceC6287f;
import p067h0.InterfaceC6440j;

/* renamed from: s0.c */
/* loaded from: classes3.dex */
public class C7681c implements InterfaceC6287f {
    @Override // p053f0.InterfaceC6287f
    /* renamed from: b */
    public EncodeStrategy mo6423b(C6285d c6285d) {
        return EncodeStrategy.SOURCE;
    }

    @Override // p053f0.InterfaceC6282a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo6411a(InterfaceC6440j interfaceC6440j, File file, C6285d c6285d) throws Throwable {
        try {
            AbstractC4399a.m1410f(((GifDrawable) interfaceC6440j.get()).m2850c(), file);
            return true;
        } catch (IOException e6) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e6);
            return false;
        }
    }
}
