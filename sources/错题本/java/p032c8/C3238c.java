package p032c8;

import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.io.File;
import java.io.IOException;
import p016b0.C3070f0;
import p016b0.InterfaceC3072g0;
import p072h3.InterfaceC5624d;
import p111m0.C6082e;
import p168t5.InterfaceC6599c;
import p180v0.AbstractC6654a;
import p185v7.AbstractC6675d;
import p187w0.InterfaceC6695c;
import p202y.C6763f;
import p202y.InterfaceC6765h;

/* renamed from: c8.c */
/* loaded from: classes4.dex */
public final class C3238c implements InterfaceC6695c, InterfaceC5624d, InterfaceC6765h, InterfaceC6599c {

    /* renamed from: a */
    public static C3238c f1804a;

    @Override // p187w0.InterfaceC6695c
    /* renamed from: a */
    public Object mo2052a() {
        return new C3070f0();
    }

    @Override // p168t5.InterfaceC6599c
    public void accept(Object obj) {
        AbstractC6675d.m6351q(new OnErrorNotImplementedException((Throwable) obj));
    }

    @Override // p202y.InterfaceC6765h
    /* renamed from: g */
    public EncodeStrategy mo113g(C6763f c6763f) {
        return EncodeStrategy.SOURCE;
    }

    @Override // p202y.InterfaceC6758a
    /* renamed from: s */
    public boolean mo124s(Object obj, File file, C6763f c6763f) throws Throwable {
        try {
            AbstractC6654a.m6313b(((C6082e) ((GifDrawable) ((InterfaceC3072g0) obj).get()).f2309a.f4733b).f9692a.f11384d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }
}
