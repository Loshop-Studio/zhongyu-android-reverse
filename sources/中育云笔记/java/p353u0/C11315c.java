package p353u0;

import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
import java.io.IOException;
import p109d1.AbstractC8900a;
import p168h0.C9438e;
import p168h0.InterfaceC9440g;
import p198j0.InterfaceC9657j;

/* renamed from: u0.c */
/* loaded from: classes3.dex */
public class C11315c implements InterfaceC9440g {
    @Override // p168h0.InterfaceC9440g
    /* renamed from: b */
    public EncodeStrategy mo18630b(C9438e c9438e) {
        return EncodeStrategy.SOURCE;
    }

    @Override // p168h0.InterfaceC9434a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo18616a(InterfaceC9657j interfaceC9657j, File file, C9438e c9438e) throws Throwable {
        try {
            AbstractC8900a.m17440f(((GifDrawable) interfaceC9657j.get()).m4319c(), file);
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
