package p138x;

import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
import java.io.IOException;
import p062g0.AbstractC3741a;
import p076j.C3794d;
import p076j.InterfaceC3796f;
import p093m.InterfaceC4361j;

/* renamed from: x.c */
/* loaded from: classes2.dex */
public class C4651c implements InterfaceC3796f {
    @Override // p076j.InterfaceC3796f
    /* renamed from: b */
    public EncodeStrategy mo4954b(C3794d c3794d) {
        return EncodeStrategy.SOURCE;
    }

    @Override // p076j.InterfaceC3791a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo4941a(InterfaceC4361j interfaceC4361j, File file, C3794d c3794d) throws Throwable {
        try {
            AbstractC3741a.m4741e(((GifDrawable) interfaceC4361j.get()).m1971c(), file);
            return true;
        } catch (IOException e4) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e4);
            }
            return false;
        }
    }
}
