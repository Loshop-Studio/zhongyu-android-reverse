package p301z0;

import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
import java.io.IOException;
import p117i1.AbstractC7642a;
import p162m0.C8539d;
import p162m0.InterfaceC8541f;
import p184o0.InterfaceC8690j;

/* renamed from: z0.c */
/* loaded from: classes3.dex */
public class C9966c implements InterfaceC8541f {
    @Override // p162m0.InterfaceC8541f
    /* renamed from: b */
    public EncodeStrategy mo14060b(C8539d c8539d) {
        return EncodeStrategy.SOURCE;
    }

    @Override // p162m0.InterfaceC8536a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo14048a(InterfaceC8690j interfaceC8690j, File file, C8539d c8539d) throws Throwable {
        try {
            AbstractC7642a.m12655f(((GifDrawable) interfaceC8690j.get()).m3670c(), file);
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
