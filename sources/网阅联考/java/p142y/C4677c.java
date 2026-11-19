package p142y;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import p076j.C3794d;
import p093m.InterfaceC4361j;
import p098n.InterfaceC4395d;
import p122t.C4559e;

/* renamed from: y.c */
/* loaded from: classes2.dex */
public final class C4677c implements InterfaceC4679e {

    /* renamed from: a */
    public final InterfaceC4395d f5991a;

    /* renamed from: b */
    public final InterfaceC4679e f5992b;

    /* renamed from: c */
    public final InterfaceC4679e f5993c;

    public C4677c(InterfaceC4395d interfaceC4395d, InterfaceC4679e interfaceC4679e, InterfaceC4679e interfaceC4679e2) {
        this.f5991a = interfaceC4395d;
        this.f5992b = interfaceC4679e;
        this.f5993c = interfaceC4679e2;
    }

    /* renamed from: b */
    public static InterfaceC4361j m6606b(InterfaceC4361j interfaceC4361j) {
        return interfaceC4361j;
    }

    @Override // p142y.InterfaceC4679e
    /* renamed from: a */
    public InterfaceC4361j mo6605a(InterfaceC4361j interfaceC4361j, C3794d c3794d) {
        Drawable drawable = (Drawable) interfaceC4361j.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f5992b.mo6605a(C4559e.m6280d(((BitmapDrawable) drawable).getBitmap(), this.f5991a), c3794d);
        }
        if (drawable instanceof GifDrawable) {
            return this.f5993c.mo6605a(m6606b(interfaceC4361j), c3794d);
        }
        return null;
    }
}
