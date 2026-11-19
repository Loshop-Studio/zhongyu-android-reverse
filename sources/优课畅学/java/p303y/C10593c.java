package p303y;

import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
import java.io.IOException;
import p116h0.AbstractC8697a;
import p160l.C9230d;
import p160l.InterfaceC9232f;
import p182n.InterfaceC9357j;

/* renamed from: y.c */
/* loaded from: classes3.dex */
public class C10593c implements InterfaceC9232f {
    @Override // p160l.InterfaceC9232f
    /* renamed from: a */
    public EncodeStrategy mo16943a(C9230d c9230d) {
        return EncodeStrategy.SOURCE;
    }

    @Override // p160l.InterfaceC9227a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo16931b(InterfaceC9357j interfaceC9357j, File file, C9230d c9230d) throws Throwable {
        try {
            AbstractC8697a.m14153f(((GifDrawable) interfaceC9357j.get()).m3115c(), file);
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
